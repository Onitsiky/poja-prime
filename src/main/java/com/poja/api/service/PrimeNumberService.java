package com.poja.api.service;

import com.poja.api.repository.PrimeNumberRepository;
import com.poja.api.repository.model.PrimeNumber;
import java.math.BigInteger;
import java.util.List;
import java.util.Random;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PrimeNumberService {
  private final PrimeNumberRepository repository;
  public BigInteger generatePrimeNumber() {
    int bitLength = 10_000;
    BigInteger actual = BigInteger.probablePrime(bitLength, new Random());
    return new BigInteger(repository.save(PrimeNumber.builder()
        .prime(actual.toString())
        .build()).getPrime());
  }

  public List<BigInteger> getGenerated() {
    Pageable pageable = PageRequest.of(0, 10);
    List<BigInteger> actual = repository.findAllByOrderByCreatedAtDesc(pageable).toList().stream()
        .map(item -> new BigInteger(item.getPrime()))
        .toList();
    return actual;
  }
}
