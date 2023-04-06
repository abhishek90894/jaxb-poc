package com.spring.jaxb.jaxb.jsonTojava1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class info {

    public int merchantPaymentID;
    public int apiPortNumber;
    public int pollerFrequency;
    public String serviceCode;
    public ExtraData extraData;
    public int merchantPaymentStatus;
    public String serviceUrl;
    public String merchantPaymentCurrencyCode;
    public String wrapperUrl;
    public String wsdlFile;
    public String protocol;
    public int sslEnabled;
    public int numberOfSends;
    public String invoiceNumber;
    public String merchantPaymentDate;
    public String merchantPaymentCustomerName;
    public String apiUserName;
    public String merchantPaymentUUID;
    public String merchantPaymentAccountNumber;
    public ArrayList<String> paymentMode;
    public String merchantPaymentMSISDN;
    public String apiFunctionName;
    public ArrayList<String> payerTransactionID;
    public String apiPassword;
    public String paymentUUID;
    public ArrayList<String> payerClientCode;
    public String sslCertificatePath;
    public int isTokenService;
    public int merchantPaymentAmount;
    public String paymentPusherProcessorClass;
    public ArrayList<String> requestOriginIDs;
    public String firstSend;
    public int maxNumberOfSends;
    public String narration;
    public String hubCreationDate;
    public int allowsPolling;
    public int serviceID;
    public String lastSend;
    public String nextSend;
    public int autoAcknowledgePayment;

}
