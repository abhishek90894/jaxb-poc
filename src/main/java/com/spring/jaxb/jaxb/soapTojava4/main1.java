package com.spring.jaxb.jaxb.soapTojava4;

public class main1 {


    public static String s=" <?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">\n" +
            "    <soapenv:Header />\n" +
            "    <soapenv:Body>\n" +
            "        <tem:SendToWallet>\n" +
            "            <tem:strReq>\n" +
            "                <![CDATA[\n" +
            "                <MobiPay ver=\"1.0\" InstitutionID=\"letsbank1\" UserName=\"letsbank1\" Password=\"L3ttMo1paO12\">\n" +
            "                <SendToWalletRequest>\n" +
            "                <TransType>1</TransType>\n" +
            "                <Amount>200000</Amount>\n" +
            "                <Description>transfer</Description>\n" +
            "                <Recipient>264815626131</Recipient>\n" +
            "                <SMSText>Send2Wallet BlueWallet</SMSText\n" +
            "                ><ReqTraceID>16430</ReqTraceID>\n" +
            "                <DateTime>2019-06-28 16:52:59</DateTime>\n" +
            "                </SendToWalletRequest>\n" +
            "                </MobiPay>]]></tem:strReq>\n" +
            "        </tem:SendToWallet>\n" +
            "    </soapenv:Body>\n" +
            "</soapenv:Envelope>";
    public static String removeCDATA (String s) {
        s = s.replaceAll("!\\[CDATA", "");
        s = s.replaceAll("]]", "");
        s = s.replaceAll("\\[", "");
        return s;
    }

    public static void main(String[] args) {
        String w = removeCDATA(s);
        System.out.println(w);
    }
}
