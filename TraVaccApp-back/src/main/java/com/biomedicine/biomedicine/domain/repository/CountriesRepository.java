package com.biomedicine.biomedicine.domain.repository;

import com.biomedicine.biomedicine.domain.Countries;
import com.biomedicine.biomedicine.domain.Vaccines;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CountriesRepository extends JpaRepository<Countries, String> {

  @Query(value = "select * from countries where country_id = :countryId", nativeQuery = true)
  Optional<Countries> findByCountryId(@Param("countryId") String s);


}