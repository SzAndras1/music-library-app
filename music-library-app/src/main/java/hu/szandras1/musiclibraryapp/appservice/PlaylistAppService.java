package hu.szandras1.musiclibraryapp.appservice;

import hu.szandras1.musiclibraryapp.common.exception.ValidationException;
import hu.szandras1.musiclibraryapp.common.mapper.PlaylistCreatorMapper;
import hu.szandras1.musiclibraryapp.common.mapper.PlaylistMapper;
import hu.szandras1.musiclibraryapp.common.validator.PlaylistValidator;
import hu.szandras1.musiclibraryapp.dto.PlaylistCreatorDto;
import hu.szandras1.musiclibraryapp.dto.PlaylistDto;
import hu.szandras1.musiclibraryapp.entity.Playlist;
import hu.szandras1.musiclibraryapp.repository.PlaylistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaylistAppService {
	private final PlaylistValidator playlistValidator;
	private final PlaylistMapper playlistMapper;
	private final PlaylistCreatorMapper playlistCreatorMapper;
	private final PlaylistRepository playlistRepository;

	public PlaylistDto getPlayList(final Long playlistId) {
		Playlist playlist = playlistRepository.findById(playlistId).orElseThrow(
				() -> new ValidationException(
						String.format("Playlist with id %s is not found", playlistId))
		);
		return playlistMapper.toDto(playlist);
	}

	public List<PlaylistDto> getAllPlaylist() {
		return playlistRepository.findAll().stream()
				.map(playlistMapper::toDto)
				.toList();
	}

	public PlaylistDto createPlaylist(final PlaylistCreatorDto playlistCreatorDto) {
		playlistValidator.validate(playlistCreatorDto);
		Playlist savedPlaylist = playlistRepository.save(playlistCreatorMapper.toEntity(playlistCreatorDto));
		return playlistMapper.toDto(savedPlaylist);
	}
}
