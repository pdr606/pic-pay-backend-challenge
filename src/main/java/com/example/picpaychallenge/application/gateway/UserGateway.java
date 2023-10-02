package com.example.picpaychallenge.application.gateway;

import com.example.picpaychallenge.model.entities.User;
import com.example.picpaychallenge.model.enums.UserType;

import java.math.BigDecimal;
import java.util.Optional;

public interface UserGateway {

    boolean checkBalance(BigDecimal userBalance, BigDecimal transferBalance);

    boolean checkUserType(UserType type);

    Optional<User> findById(Long id) throws Exception;

}
