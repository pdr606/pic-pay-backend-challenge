package com.example.picpaychallenge.services;

import com.example.picpaychallenge.application.gateway.UserGateway;
import com.example.picpaychallenge.model.entities.User;
import com.example.picpaychallenge.repositories.UserRepository;
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
        return false;
    }

    @Override
    public String makeTranfer(Long paymentId, Long reciverId, BigDecimal value) throws Exception {
        Optional<User> payment = findById(paymentId);
        Optional<User> reciver = findById(reciverId);


    }

    @Override
    public Optional<User> findById(Long id) throws Exception {
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty()){
            throw new RuntimeException();
        }
        return user;
    }
}
