package hu.szandras1.musiclibraryapp.common.mapper;

import hu.szandras1.musiclibraryapp.dto.MusicDto;
import hu.szandras1.musiclibraryapp.entity.Music;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

@Mapper(componentModel = "spring")
public interface MusicMapper extends Converter<Music, MusicDto> {
	MusicDto toDto(final Music music);

	Music toEntity(final MusicDto musicDto);
}
