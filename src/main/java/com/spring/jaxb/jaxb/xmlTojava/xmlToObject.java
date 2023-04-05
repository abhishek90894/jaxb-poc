package com.spring.jaxb.jaxb.xmlTojava;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class xmlToObject {

    public static void main(String[] args) throws Exception {

        File file1 = new File("src\\main\\java\\com\\spring\\jaxb\\jaxb\\xmlTojava\\question.xml");

        JAXBContext jaxbContext = JAXBContext.newInstance(Question.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
           Question question    =  (Question) unmarshaller.unmarshal(file1);
        System.out.println(question.getId()+"\t"+question.getQuestionName());

        System.out.println("Answers");

        List<Answer> list = question.getAnswers();
        for(Answer ans : list)
        {
            System.out.println(ans.getId()+"\n"+ans.getAnswerName()+"\n"+ans.getPostedBy());
        }

    }
}
