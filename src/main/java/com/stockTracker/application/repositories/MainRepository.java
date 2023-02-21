package com.stockTracker.application.repositories;

import com.stockTracker.application.entities.MainEntity;
import org.springframework.data.repository.CrudRepository;

public interface MainRepository extends CrudRepository<MainEntity, Long> {

}
