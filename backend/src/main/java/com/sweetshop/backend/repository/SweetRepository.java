package com.sweetshop.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sweetshop.backend.model.Sweet;

public interface SweetRepository extends JpaRepository<Sweet, Long> {
}
