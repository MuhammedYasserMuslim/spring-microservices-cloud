package com.spring.repository;

import com.spring.model.ServiceTwo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceTwoRepository extends JpaRepository<ServiceTwo, Integer> {
}
