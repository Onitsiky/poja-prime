package com.poja.api.service;

import java.math.BigInteger;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class PrimeNumberService {
  public BigInteger generatePrimeNumber() {
    int bitLength = 10_000;
    return BigInteger.probablePrime(bitLength, new Random());
  }
}
