package com.papalugo.paymentservice.service;

import com.papalugo.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
