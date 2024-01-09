package com.biomedicine.biomedicine.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Countries {

  @Id
  @Column(name = "country_id", length = 2)
  private String countryId;

  @Column(name = "country_name", nullable = false)
  private String countryName;

  @Column(name = "vaccine_id")
  private byte[] vaccineId;

  @Column(name = "recommended_vaccination")
  private boolean recommendedVaccination;

  @Column(name = "mandatory_vaccination")
  private boolean mandatoryVaccination;

  @Column(name = "mandatory_vaccination_specific")
  private boolean mandatoryVaccinationSpecific;

  // Constructors, getters, setters, and other methods...

  // Example: Generating getters and setters

  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public byte[] getVaccineId() {
    return vaccineId;
  }

  public void setVaccineId(byte[] vaccineId) {
    this.vaccineId = vaccineId;
  }

  public boolean isRecommendedVaccination() {
    return recommendedVaccination;
  }

  public void setRecommendedVaccination(boolean recommendedVaccination) {
    this.recommendedVaccination = recommendedVaccination;
  }

  public boolean isMandatoryVaccination() {
    return mandatoryVaccination;
  }

  public void setMandatoryVaccination(boolean mandatoryVaccination) {
    this.mandatoryVaccination = mandatoryVaccination;
  }

  public boolean isMandatoryVaccinationSpecific() {
    return mandatoryVaccinationSpecific;
  }

  public void setMandatoryVaccinationSpecific(boolean mandatoryVaccinationSpecific) {
    this.mandatoryVaccinationSpecific = mandatoryVaccinationSpecific;
  }
}