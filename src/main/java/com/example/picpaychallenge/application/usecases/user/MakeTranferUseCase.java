package com.example.picpaychallenge.application.usecases.user;

import com.example.picpaychallenge.application.gateway.UserGateway;
import com.example.picpaychallenge.model.entities.User;

import java.math.BigDecimal;

public class MakeTranferUseCase {

    private final UserGateway userGateway;

    public MakeTranferUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public String makeTranfer(Long paymentId, Long reciverId, BigDecimal value){
        return userGateway.makeTranfer(paymentId, reciverId, value);
    }
}
