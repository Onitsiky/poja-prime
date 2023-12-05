package com.poja.api.endpoint.rest.controller;

import com.poja.api.conf.FacadeIT;
import java.math.BigInteger;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumberControllerIT extends FacadeIT {
  @Autowired PrimeNumberController primeNumberController;

  @Test
  void new_prime_ok() {
    BigInteger actual = primeNumberController.generatePrime();

    int certainty = (int) (99.99 * 100);
    assertTrue(actual.isProbablePrime(certainty));
  }

  @Test
  void get_generated_ok() {
    List<BigInteger> actual = primeNumberController.generatedPrimes();
    assertTrue(actual.size() == 4);
  }
}
