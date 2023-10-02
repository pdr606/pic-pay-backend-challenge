package com.example.picpaychallenge.services;

import com.example.picpaychallenge.application.gateway.UserGateway;
import com.example.picpaychallenge.model.entities.User;
import com.example.picpaychallenge.model.enums.UserType;
import com.example.picpaychallenge.repositories.UserRepository;
import com.example.picpaychallenge.services.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class UserService implements UserGateway {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean checkBalance(BigDecimal userBalance, BigDecimal transferBalance) {
        if(transferBalance.compareTo(userBalance) > 0){
            throw new RuntimeException("Insuficiente funds");
        }
        return true;
    }

    @Override
    public boolean checkUserType(UserType type) {
        if(type.equals("SHOPKEEPER")){
            throw new RuntimeException("Shopkeeper only recive");
        }
        return true;
    }

    @Override
    public Optional<User> findById(Long id) throws Exception {
        return Optional.ofNullable(userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id)));
    }
}
