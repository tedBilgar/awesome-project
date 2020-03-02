package ru.lanit.awesomeproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.lanit.awesomeproject.entities.Gym;

@RepositoryRestResource(collectionResourceRel = "gyms", path = "gyms")
public interface GymRepository extends JpaRepository<Gym, Long> {
}
