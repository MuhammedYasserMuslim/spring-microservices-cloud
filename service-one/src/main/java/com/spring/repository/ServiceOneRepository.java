package com.spring.repository;

import com.spring.model.ServiceOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceOneRepository extends JpaRepository<ServiceOne, Integer> {
}
