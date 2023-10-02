package com.example.picpaychallenge.application.usecases.user;

import com.example.picpaychallenge.application.gateway.UserGateway;
import com.example.picpaychallenge.model.enums.UserType;

public class CheckUserTypeUseCase {

    private final UserGateway userGateway;

    public CheckUserTypeUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public boolean checkUserType(UserType type){
        return userGateway.checkUserType(type);
    }
}
