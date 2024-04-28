package com.spring.services;

import com.spring.model.ServiceOne;
import com.spring.repository.ServiceOneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceOneServices {

    private final ServiceOneRepository serviceOneRepository;
    @Value("${me.id}")
    private int id;
    @Value("${me.name}")
    private String name;

    public List<ServiceOne> findAll() {
        List<ServiceOne> serviceOneList = serviceOneRepository.findAll();
        serviceOneList.add(new ServiceOne(this.id , this.name));
        return serviceOneList;
    }
}
