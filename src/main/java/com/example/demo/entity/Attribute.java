package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Attribute {

  @Id
  private UUID id;
  private String name;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "data_type_id")
  private DataType dataType;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "unit_id")
  private Unit unit;
}
