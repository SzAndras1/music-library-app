package hu.szandras1.musiclibraryapp.controller;

import hu.szandras1.musiclibraryapp.appservice.MusicAppService;
import hu.szandras1.musiclibraryapp.dto.MusicDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MusicController {
	private final MusicAppService musicAppService;

	@GetMapping("api/v1/music/{id}")
	public ResponseEntity<MusicDto> getMusic(@PathVariable final Long id) {
		return ResponseEntity.ok(musicAppService.getMusic(id));
	}

	@GetMapping("api/v1/music/all")
	public ResponseEntity<List<MusicDto>> getAllMusic() {
		return ResponseEntity.ok(musicAppService.getAllMusic());
	}

	@PostMapping("api/v1/music")
	public ResponseEntity<MusicDto> uploadMusic(@RequestBody final MusicDto musicDto) {
		return ResponseEntity.ok(musicAppService.uploadMusic(musicDto));
	}
}
