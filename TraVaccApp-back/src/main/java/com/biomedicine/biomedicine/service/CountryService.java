package com.biomedicine.biomedicine.service;

import com.biomedicine.biomedicine.domain.repository.CountriesRepository;
import com.biomedicine.biomedicine.domain.repository.VaccinesRepository;
import com.biomedicine.biomedicine.web.assembler.CountryAssembler;
import com.biomedicine.biomedicine.web.resources.CountriesResource;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

  private final CountriesRepository countriesRepository;
  private final VaccinesRepository vaccinesRepository;

  public CountryService(CountriesRepository countriesRepository,
      VaccinesRepository vaccinesRepository) {
    this.countriesRepository = countriesRepository;
    this.vaccinesRepository = vaccinesRepository;
  }

  public CountriesResource getCountry(String id){
    var country = countriesRepository.findByCountryId(id).get();
    var vaccine = vaccinesRepository.findVaccinesByCountryId(id).get();
    return CountryAssembler.countryToResource(country, vaccine);
  }
}
