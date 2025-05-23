package hu.szandras1.musiclibraryapp.repository;

import hu.szandras1.musiclibraryapp.entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<Music, Long> {
}
