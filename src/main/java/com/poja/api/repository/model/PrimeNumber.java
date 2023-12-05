package com.poja.api.repository.model;

import java.math.BigInteger;
import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "prime_number")
@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PrimeNumber {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  private String prime;
  @CreationTimestamp
  @Column(columnDefinition = "TIMESTAMP WITHOUT TIMEZONE")
  private Instant createdAt;
}
