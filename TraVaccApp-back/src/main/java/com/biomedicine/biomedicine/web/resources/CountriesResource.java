package com.biomedicine.biomedicine.web.resources;

import java.io.Serializable;

public class CountriesResource implements Serializable {

  private String vaccineName;
  private String countryName;
  private String countryCode;
  private boolean recommendedVaccination;
  private boolean mandatoryVaccination;
  private boolean mandatoryVaccinationSpecific;

  public String getVaccineName() {
    return vaccineName;
  }

  public void setVaccineName(String vaccineName) {
    this.vaccineName = vaccineName;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
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
