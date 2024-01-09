package com.biomedicine.biomedicine.web.assembler;

import com.biomedicine.biomedicine.domain.Countries;
import com.biomedicine.biomedicine.domain.Vaccines;
import com.biomedicine.biomedicine.web.resources.CountriesResource;

public class CountryAssembler {

  public static CountriesResource countryToResource (Countries countries, Vaccines vaccines){
    CountriesResource countriesResource = new CountriesResource();
    countriesResource.setCountryCode(countries.getCountryId());
    countriesResource.setCountryName(countries.getCountryName());
    countriesResource.setMandatoryVaccination(countries.isMandatoryVaccination());
    countriesResource.setRecommendedVaccination(countries.isRecommendedVaccination());
    countriesResource.setMandatoryVaccinationSpecific(countries.isMandatoryVaccinationSpecific());
    countriesResource.setVaccineName(vaccines.getName());
    return countriesResource;
  }
}
