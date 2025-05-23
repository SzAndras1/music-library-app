package hu.szandras1.musiclibraryapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MusicDto {
	private Long id;
	private String name;
	private byte[] rawData;
}
