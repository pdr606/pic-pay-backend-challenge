package com.example.picpaychallenge.application.usecases.user;

import com.example.picpaychallenge.application.gateway.UserGateway;

import java.math.BigDecimal;

public class CheckBalanceUseCase {

    private final UserGateway userGateway;

    public CheckBalanceUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public boolean checkBalance(BigDecimal balance){
        return userGateway.checkBalance(balance);
    }
}
