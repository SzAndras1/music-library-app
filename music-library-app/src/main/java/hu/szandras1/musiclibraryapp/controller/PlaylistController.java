package hu.szandras1.musiclibraryapp.controller;

import hu.szandras1.musiclibraryapp.appservice.PlaylistAppService;
import hu.szandras1.musiclibraryapp.dto.PlaylistCreatorDto;
import hu.szandras1.musiclibraryapp.dto.PlaylistDto;
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
public class PlaylistController extends BaseController {
	private final PlaylistAppService playlistAppService;

	@GetMapping("api/v1/playlist/{playlistId}")
	public ResponseEntity<PlaylistDto> getPlaylist(@PathVariable final Long playlistId) {
		return ResponseEntity.ok(playlistAppService.getPlayList(playlistId));
	}

	@GetMapping("api/v1/playlist/all")
	public ResponseEntity<List<PlaylistDto>> getAllPlaylist() {
		return ResponseEntity.ok(playlistAppService.getAllPlaylist());
	}

	@PostMapping("api/v1/playlist")
	public ResponseEntity<PlaylistDto> createPlayList(@RequestBody final PlaylistCreatorDto playlistCreatorDto) {
		return ResponseEntity.ok(playlistAppService.createPlaylist(playlistCreatorDto));
	}

}
