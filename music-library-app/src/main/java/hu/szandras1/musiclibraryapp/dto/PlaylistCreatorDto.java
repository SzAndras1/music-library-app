package hu.szandras1.musiclibraryapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaylistCreatorDto {
	private String name;
	private List<Long> musicIds = new ArrayList<>();
}
