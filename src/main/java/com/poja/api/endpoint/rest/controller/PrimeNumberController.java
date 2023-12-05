package com.poja.api.endpoint.rest.controller;

import com.poja.api.service.PrimeNumberService;
import java.math.BigInteger;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PrimeNumberController {
  private final PrimeNumberService service;

  @GetMapping("/new-prime")
  public BigInteger generatePrime() {
    return service.generatePrimeNumber();
  }
}
