package com.example.picpaychallenge.services;

import com.example.picpaychallenge.application.gateway.TransferGetaway;
import com.example.picpaychallenge.model.entities.User;
import com.example.picpaychallenge.repositories.TransferRepository;

import java.math.BigDecimal;
import java.util.Optional;

public class TranferService implements TransferGetaway {

    private final TransferRepository transferRepository;
    private final UserService userService;

    public TranferService(TransferRepository transferRepository, UserService userService) {
        this.transferRepository = transferRepository;
        this.userService = userService;
    }

    @Override
    public String makeTransfer(Long paymentId, Long reciverId, BigDecimal value) throws Exception {
        Optional<User> payment = userService.findById(paymentId);
        Optional<User> reciver = userService.findById(reciverId);
        userService.checkUserType(payment.get().getUserType());
        userService.checkBalance(payment.get().getBalance(), value);

        payment.get().setBalance(payment.get().getBalance().subtract(value));
        reciver.get().setBalance(reciver.get().getBalance().add(value));
}
