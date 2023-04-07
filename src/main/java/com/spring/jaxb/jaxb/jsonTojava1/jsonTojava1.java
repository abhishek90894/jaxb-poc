package com.spring.jaxb.jaxb.jsonTojava1;

import lombok.extern.slf4j.Slf4j;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;

@Slf4j
public class jsonTojava1 {

    public static void main(String[] args) throws Exception{
        ObjectMapper mapper = new ObjectMapper();

        File file1 = new File("file1.json");
       // info info    = mapper.readValue(file1,info.class);
        info info1 = mapper.readValue(file1,info.class);


        String s =  "{\n" +
                "  \"merchantPaymentID\": 30461165,\n" +
                "  \"apiPortNumber\": 0,\n" +
                "  \"pollerFrequency\": 0,\n" +
                "  \"serviceCode\": \"VODABUNDLES\",\n" +
                "  \"extraData\": {\n" +
                "    \"38874292\": {\n" +
                "      \"pushToOriginator\": true,\n" +
                "      \"isThirdPartyPayment\": \"false\",\n" +
                "      \"appVersion\": \"\",\n" +
                "      \"amount\": 5,\n" +
                "      \"debitMessage\": \"Transaction successful.\",\n" +
                "      \"requestOrigin\": \"MULA_USSD\",\n" +
                "      \"accountNumber\": 233504665467,\n" +
                "      \"deviceName\": \"\",\n" +
                "      \"transactionID\": \"621d34658ac80c8c7c10e633\",\n" +
                "      \"mno\": \"MTN\",\n" +
                "      \"requestLogID\": \"12855813\",\n" +
                "      \"totalAmountCharged\": 5,\n" +
                "      \"dateCreated\": \"2022-02-28 20:45:19\",\n" +
                "      \"productCode\": \"DATANVDR5WLY\",\n" +
                "      \"name\": \"233556171673\",\n" +
                "      \"chargeAmount\": 0,\n" +
                "      \"debitStatus\": 1,\n" +
                "      \"paybillNumber\": \"1032\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"merchantPaymentStatus\": 139,\n" +
                "  \"serviceUrl\": \"\",\n" +
                "  \"merchantPaymentCurrencyCode\": \"GHS\",\n" +
                "  \"wrapperUrl\": \"\",\n" +
                "  \"wsdlFile\": \"\",\n" +
                "  \"protocol\": \"default\",\n" +
                "  \"sslEnabled\": 0,\n" +
                "  \"numberOfSends\": 0,\n" +
                "  \"invoiceNumber\": \"\",\n" +
                "  \"merchantPaymentDate\": \"2022-02-28 20:46:02\",\n" +
                "  \"merchantPaymentCustomerName\": \"Customer\",\n" +
                "  \"apiUserName\": \"\",\n" +
                "  \"merchantPaymentUUID\": \"1289282705\",\n" +
                "  \"merchantPaymentAccountNumber\": \"233504665467\",\n" +
                "  \"paymentMode\": [\n" +
                "    \"USSD_PUSH\"\n" +
                "  ],\n" +
                "  \"merchantPaymentMSISDN\": \"233556171673\",\n" +
                "  \"apiFunctionName\": \"\",\n" +
                "  \"payerTransactionID\": [\n" +
                "    \"621d34658ac80c8c7c10e633\"\n" +
                "  ],\n" +
                "  \"apiPassword\": \"\",\n" +
                "  \"paymentUUID\": \"1289282705\",\n" +
                "  \"payerClientCode\": [\n" +
                "    \"NSANOMOMO\"\n" +
                "  ],\n" +
                "  \"sslCertificatePath\": \"\",\n" +
                "  \"isTokenService\": 0,\n" +
                "  \"merchantPaymentAmount\": 5,\n" +
                "  \"paymentPusherProcessorClass\": \"\",\n" +
                "  \"requestOriginIDs\": [\n" +
                "    \"7\"\n" +
                "  ],\n" +
                "  \"firstSend\": \"\",\n" +
                "  \"maxNumberOfSends\": 1,\n" +
                "  \"narration\": \"Transaction successful.\",\n" +
                "  \"hubCreationDate\": \"2022-02-28 20:46:02\",\n" +
                "  \"allowsPolling\": 0,\n" +
                "  \"serviceID\": 74,\n" +
                "  \"lastSend\": \"2022-02-28 20:46:02\",\n" +
                "  \"nextSend\": \"2022-02-28 20:46:02\",\n" +
                "  \"autoAcknowledgePayment\": 1\n" +
                "}\n" +
                "\n";

        log.info("input json {}",s);
        log.info("output java object {}",info1);


    }
}
