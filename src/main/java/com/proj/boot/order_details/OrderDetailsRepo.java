package com.proj.boot.order_details;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepo extends CrudRepository<OrderDetails, Integer> {

}
