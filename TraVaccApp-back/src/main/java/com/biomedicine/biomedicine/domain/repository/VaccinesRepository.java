package com.biomedicine.biomedicine.domain.repository;

import com.biomedicine.biomedicine.domain.Countries;
import com.biomedicine.biomedicine.domain.Vaccines;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VaccinesRepository extends JpaRepository<Vaccines, UUID> {

  @Query(value = "  select * from vaccines v \n"
      + "  inner join countries c on v.id = c.vaccine_id  \n"
      + "  where c.country_id = :countryId", nativeQuery = true)
  Optional<Vaccines> findVaccinesByCountryId (@Param("countryId") String s);
}