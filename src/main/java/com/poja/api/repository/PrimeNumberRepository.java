package com.poja.api.repository;

import com.poja.api.repository.model.PrimeNumber;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimeNumberRepository extends JpaRepository<PrimeNumber, String> {
  Page<PrimeNumber> findAllByOrderByCreatedAtDesc(Pageable pageable);
}
