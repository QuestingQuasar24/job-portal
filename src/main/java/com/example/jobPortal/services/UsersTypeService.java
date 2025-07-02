package com.example.jobPortal.services;

import com.example.jobPortal.entity.UsersType;
import com.example.jobPortal.repository.UsersTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersTypeService {
    private final UsersTypeRepository usersTypeRepository;
    @Autowired
    public UsersTypeService(UsersTypeRepository usersTypeRepository) {
        this.usersTypeRepository = usersTypeRepository;
    }

    //defining a method to get all users type from database
    public List<UsersType> getAll(){
        return usersTypeRepository.findAll();
    }


}
