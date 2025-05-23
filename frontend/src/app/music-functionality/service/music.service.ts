import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MusicDto } from '../dto/MusicDto';
import { BASE_URL } from '../../app.constants';
import { tap } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MusicService {

  constructor(private http: HttpClient) {}

  getMusic() {
    return this.http.get<MusicDto>(`${BASE_URL}/music/1`).pipe(
      tap((musicDto: MusicDto) =>
        musicDto.rawData = this.base64ToBlob(musicDto.rawData as string, 'audio/ogg')
      )
    );
  }

  private base64ToBlob(base64: string, mimeType: string): Blob {
    const byteCharacters = atob(base64);
    const byteArray = new Uint8Array(byteCharacters.length);
    for (let i = 0; i < byteCharacters.length; i++) {
      byteArray[i] = byteCharacters.charCodeAt(i);
    }
    return new Blob([byteArray], { type: mimeType });
  }
}
