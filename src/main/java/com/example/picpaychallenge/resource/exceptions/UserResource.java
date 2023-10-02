package com.example.picpaychallenge.resource.exceptions;

import com.example.picpaychallenge.resource.exceptions.dto.UserRequestDTO;
import com.example.picpaychallenge.services.TranferService;
import com.example.picpaychallenge.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    private final UserService userService;
    private final TranferService tranferService;

    public UserResource(UserService userService, TranferService tranferService) {
        this.userService = userService;
        this.tranferService = tranferService;
    }

    public ResponseEntity<Void> createUser(@RequestBody UserRequestDTO data){


    }


}
