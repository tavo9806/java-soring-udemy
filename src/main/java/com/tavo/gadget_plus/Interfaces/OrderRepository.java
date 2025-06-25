package com.tavo.gadget_plus.Interfaces;

import com.tavo.gadget_plus.Entities.OrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderEntity, Long> {
}
