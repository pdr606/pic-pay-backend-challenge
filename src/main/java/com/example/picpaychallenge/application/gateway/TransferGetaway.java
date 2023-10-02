package com.example.picpaychallenge.application.gateway;

import java.math.BigDecimal;

public interface TransferGetaway {
    String makeTransfer(Long paymentId, Long reciverId, BigDecimal value) throws Exception;
}
