package com.example.picpaychallenge.application.usecases.user;

import com.example.picpaychallenge.application.gateway.UserGateway;
import com.example.picpaychallenge.model.entities.User;

public class FindByIdUseCase {

    private final UserGateway userGateway;

    public FindByIdUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User findById(Long id){
        return userGateway.findById(id);
    }
}
