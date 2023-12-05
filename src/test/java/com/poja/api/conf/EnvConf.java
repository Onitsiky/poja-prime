package com.poja.api.conf;

import org.springframework.test.context.DynamicPropertyRegistry;

public class EnvConf {
  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("spring.flyway.locations", () -> "classpath:/db/migration,classpath:/db/testdata");
  }
}
