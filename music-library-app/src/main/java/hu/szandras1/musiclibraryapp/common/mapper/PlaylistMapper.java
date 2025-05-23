package hu.szandras1.musiclibraryapp.common.mapper;

import hu.szandras1.musiclibraryapp.dto.PlaylistDto;
import hu.szandras1.musiclibraryapp.entity.Playlist;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

@Mapper(componentModel = "spring")
public interface PlaylistMapper extends Converter<Playlist, PlaylistDto> {
	Playlist toEntity(final PlaylistDto playlistDto);

	PlaylistDto toDto(final Playlist playlist);
}
