package com.spring.jaxb.jaxb.xmlTojava4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
//@XmlAccessorType(XmlAccessType.PROPERTY)
public class promuntFinancialResponse {

    private String function;

    private int receiptDate;

    private int cashierNo;

    private int reference;

    private int date;

    private int mcno;

    private String operator;

    private int recno;

    private String icode;

    private String paytype;

    private int account;

    private int ref;

    private int amount;
    @XmlElement

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    @XmlElement
    public int getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(int receiptDate) {
        this.receiptDate = receiptDate;
    }
    @XmlElement
    public int getCashierNo() {
        return cashierNo;
    }

    public void setCashierNo(int cashierNo) {
        this.cashierNo = cashierNo;
    }
    @XmlElement
    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }
    @XmlElement
    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    @XmlElement
    public int getMcno() {
        return mcno;
    }

    public void setMcno(int mcno) {
        this.mcno = mcno;
    }
   @XmlElement
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
   @XmlElement
    public int getRecno() {
        return recno;
    }

    public void setRecno(int recno) {
        this.recno = recno;
    }
   @XmlElement
    public String getIcode() {
        return icode;
    }

    public void setIcode(String icode) {
        this.icode = icode;
    }
   @XmlElement
    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }
   @XmlElement
    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }
   @XmlElement
    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }
   @XmlElement
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
