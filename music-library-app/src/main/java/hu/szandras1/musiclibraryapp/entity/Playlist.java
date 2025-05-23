package hu.szandras1.musiclibraryapp.entity;

import hu.szandras1.musiclibraryapp.common.properties.CommonProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Playlist extends BaseEntity {
	@Column(nullable = false, length = CommonProperties.MAX_STRING_LENGTH)
	private String name;
	@ManyToMany
	private Set<Music> sounds;
}
