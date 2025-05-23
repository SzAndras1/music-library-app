package hu.szandras1.musiclibraryapp.appservice;

import hu.szandras1.musiclibraryapp.common.mapper.MusicMapper;
import hu.szandras1.musiclibraryapp.dto.MusicDto;
import hu.szandras1.musiclibraryapp.entity.Music;
import hu.szandras1.musiclibraryapp.repository.MusicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MusicAppService {
	private final MusicMapper musicMapper;
	private final MusicRepository musicRepository;

	@Value("classpath:static/test_sound1.mp3")
	private Resource musicFile;


	public MusicDto getMusic(final Long id) {
		// TODO: remove example resource loading
		try {
			return new MusicDto(null, "random", musicFile.getContentAsByteArray());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public List<MusicDto> getAllMusic() {
		return musicRepository.findAll().stream()
				.map(musicMapper::toDto)
				.toList();
	}

	public MusicDto uploadMusic(final MusicDto musicDto) {
		Music music = musicMapper.toEntity(musicDto);
		return musicMapper.toDto(musicRepository.save(music));
	}
}
