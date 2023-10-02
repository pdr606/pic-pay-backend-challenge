package com.example.picpaychallenge.application.usecases.user;

import com.example.picpaychallenge.application.gateway.UserGateway;
import com.example.picpaychallenge.model.entities.User;

import java.math.BigDecimal;

public class MakeTranferUseCase {

    private final UserGateway userGateway;

    public MakeTranferUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    String makeTranfer(User payment, User reciver, BigDecimal value){
        return userGateway.makeTranfer(payment, reciver, value);
    }
}
