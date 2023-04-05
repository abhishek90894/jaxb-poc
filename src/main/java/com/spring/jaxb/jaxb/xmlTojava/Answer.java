package com.spring.jaxb.jaxb.xmlTojava;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;



public class Answer {

    private int id;

    private String answerName;
    private String postedBy;

    public Answer(int id, String answerName, String postedBy) {
        this.id = id;
        this.answerName = answerName;
        this.postedBy = postedBy;
    }

    public Answer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswerName() {
        return answerName;
    }

    public void setAnswerName(String answerName) {
        this.answerName = answerName;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }
}
