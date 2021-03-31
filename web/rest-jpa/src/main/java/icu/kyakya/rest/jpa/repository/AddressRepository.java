package icu.kyakya.rest.jpa.repository;

import icu.kyakya.rest.jpa.model.Address;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface AddressRepository extends PagingAndSortingRepository<Address, Long> {

    List<Address> findByCity(@Param("city") String name);

}
