import { Component, OnInit } from '@angular/core';
import { MusicService } from '../../service/music.service';
import { MusicDto } from '../../dto/MusicDto';

@Component({
  selector: 'app-music-page',
  standalone: true,
  imports: [],
  templateUrl: './music-page.component.html',
  styleUrl: './music-page.component.scss'
})
export class MusicPageComponent implements OnInit {
  musicDto: MusicDto
  musicUrl: string;

  constructor(private musicService: MusicService) {}

  ngOnInit(): void {
    this.musicService.getMusic().subscribe((musicDto: MusicDto) => {
      this.musicDto = musicDto;
      this.musicUrl = URL.createObjectURL(musicDto.rawData as Blob);
    });
  }
}
