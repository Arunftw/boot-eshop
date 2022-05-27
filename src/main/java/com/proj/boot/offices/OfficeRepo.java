package com.proj.boot.offices;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OfficeRepo extends CrudRepository<Office, Integer> {

}
