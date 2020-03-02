package ru.lanit.awesomeproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.lanit.awesomeproject.entities.Barbell;

@RepositoryRestResource(collectionResourceRel = "barbells", path = "barbells")
public interface BarbellRepository extends JpaRepository<Barbell, Long> {
}
