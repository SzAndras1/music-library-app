package hu.szandras1.musiclibraryapp.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Music extends BaseEntity {
	@ManyToMany
	private Set<Playlist> playlists;

	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(nullable = false)
	private byte[] rawData;
}
