package com.papalugo.paymentservice.model;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;

@ToString
@Getter
public class Payment implements Serializable {

    private Long id;
    private Long idUser;
    private Long idProduct;
    private String cardNumber;
}
