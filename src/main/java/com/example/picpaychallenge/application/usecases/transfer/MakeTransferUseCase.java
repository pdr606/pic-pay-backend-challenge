package com.example.picpaychallenge.application.usecases.transfer;

import com.example.picpaychallenge.application.gateway.TransferGetaway;

import java.math.BigDecimal;

public class MakeTransferUseCase {

    private final TransferGetaway transferGetaway;

    public MakeTransferUseCase(TransferGetaway transferGetaway) {
        this.transferGetaway = transferGetaway;
    }

    public String makeTransfer(Long paymentId, Long reciverId, BigDecimal value) throws Exception {
        return transferGetaway.makeTransfer(paymentId, reciverId, value);
    }
}
