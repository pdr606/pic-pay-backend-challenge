package com.example.picpaychallenge.resource.exceptions.dto;

import com.example.picpaychallenge.model.enums.UserType;

public record UserRequestDTO(String firstName, String lastName, String cpf, String email, String password, String balance, UserType userType) {
}
