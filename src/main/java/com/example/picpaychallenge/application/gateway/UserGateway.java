package com.example.picpaychallenge.application.gateway;

import com.example.picpaychallenge.model.entities.User;

import java.math.BigDecimal;
import java.util.Optional;

public interface UserGateway {

    boolean checkBalance(BigDecimal userBalance, BigDecimal transferBalance);

    String makeTranfer(Long paymentId, Long reciverId, BigDecimal value) throws Exception;

    Optional<User> findById(Long id) throws Exception;

}
