package com.spring.jaxb.jaxb.jsonTojava;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private int statusCode;
    private String statusDescription;
    private String invoiceNumber;
    private String beepTransactionID;


}
