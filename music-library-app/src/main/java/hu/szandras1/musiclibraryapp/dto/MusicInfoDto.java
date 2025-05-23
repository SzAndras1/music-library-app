package hu.szandras1.musiclibraryapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MusicInfoDto {
	private Long id;
	private LocalDate uploadedDate;
}
