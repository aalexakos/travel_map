package com.biomedicine.biomedicine.domain;

import javax.persistence.*;

@Entity
@Table(name = "vaccines")
public class Vaccines {

  @Id
  @Column(name = "id", length = 16)
  private byte[] id;

  @Column(name = "name", nullable = false)
  private String name;

  // Constructors, getters, setters, and other methods...

  // Example: Generating getters and setters

  public byte[] getId() {
    return id;
  }

  public void setId(byte[] id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
