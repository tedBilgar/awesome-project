package ru.lanit.awesomeproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.lanit.awesomeproject.entities.RunningTrack;

@RepositoryRestResource(collectionResourceRel = "tracks", path = "tracks")
public interface RunningTrackRepository extends JpaRepository<RunningTrack, Long> {
}
