package com.proj.boot.contact;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepo extends CrudRepository<Contact, Integer>{

}
