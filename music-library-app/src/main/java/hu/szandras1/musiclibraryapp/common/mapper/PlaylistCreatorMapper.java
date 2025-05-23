package hu.szandras1.musiclibraryapp.common.mapper;

import hu.szandras1.musiclibraryapp.dto.PlaylistCreatorDto;
import hu.szandras1.musiclibraryapp.entity.Playlist;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

@Mapper(componentModel = "spring")
public interface PlaylistCreatorMapper extends Converter<Playlist, PlaylistCreatorDto> {
	Playlist toEntity(final PlaylistCreatorDto playlistCreatorDto);
}
