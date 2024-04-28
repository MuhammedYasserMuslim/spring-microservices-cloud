package com.spring.services;

import com.spring.model.ServiceTwo;
import com.spring.repository.ServiceTwoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceTwoServices {

    private final ServiceTwoRepository serviceTwoRepository;
    @Value("${me.id}")
    private int id;
    @Value("${me.name}")
    private String name;


    public List<ServiceTwo> findAll() {
        List<ServiceTwo> serviceOneList = serviceTwoRepository.findAll();
        serviceOneList.add(new ServiceTwo(this.id , this.name));
        return serviceOneList;
    }
}

