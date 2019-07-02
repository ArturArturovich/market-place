package com.geekbrains.project.persist.model.repo;

import com.geekbrains.project.persist.model.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureRepository extends JpaRepository<Picture, Long> {
}
