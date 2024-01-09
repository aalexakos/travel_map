package com.biomedicine.biomedicine.web;

import com.biomedicine.biomedicine.domain.Countries;
import com.biomedicine.biomedicine.service.CountryService;
import com.biomedicine.biomedicine.web.resources.CountriesResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController {
  private final CountryService countryService;

  public CountryController(CountryService countryService) {
    this.countryService = countryService;
  }

  @GetMapping("/{id}")
  public CountriesResource getCountry(@PathVariable String id){
    return countryService.getCountry(id);
  }
}
