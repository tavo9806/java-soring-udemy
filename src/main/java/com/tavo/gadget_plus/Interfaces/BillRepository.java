package com.tavo.gadget_plus.Interfaces;

import com.tavo.gadget_plus.Entities.BillEntity;
import org.springframework.data.repository.CrudRepository;

public interface BillRepository extends CrudRepository<BillEntity, String> {
}
