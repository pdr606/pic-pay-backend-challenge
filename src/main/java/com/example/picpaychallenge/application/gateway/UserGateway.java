package com.example.picpaychallenge.application.gateway;

import com.example.picpaychallenge.model.entities.User;

import java.math.BigDecimal;

public interface UserGateway {

    boolean checkBalance(BigDecimal balance);

    String makeTranfer(User payment, User reciver, BigDecimal value);

}
