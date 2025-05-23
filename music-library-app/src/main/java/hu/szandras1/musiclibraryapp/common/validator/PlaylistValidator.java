package hu.szandras1.musiclibraryapp.common.validator;

import hu.szandras1.musiclibraryapp.common.properties.CommonProperties;
import hu.szandras1.musiclibraryapp.dto.PlaylistCreatorDto;
import org.springframework.stereotype.Component;

@Component
public class PlaylistValidator extends BaseValidator {
	public void validate(final PlaylistCreatorDto playlistCreatorDto) {
		validateIsNotNull(playlistCreatorDto, "Invalid PlaylistCreatorDto");
		validateIsNotNull(playlistCreatorDto.getName(), "Invalid PlaylistCreatorDto name");
		validateStringMinLength(playlistCreatorDto.getName(), 3, "Invalid PlaylistCreatorDto name");
		validateStringMaxLength(playlistCreatorDto.getName(), CommonProperties.MAX_STRING_LENGTH, "Invalid PlaylistCreatorDto name");
	}
}