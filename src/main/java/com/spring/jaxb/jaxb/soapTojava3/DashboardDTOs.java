package com.spring.jaxb.jaxb.soapTojava3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DashboardDTOs")
public class DashboardDTOs {

    @XmlElement(name = "DashboardDTO", namespace = "http://schemas.datacontract.org/2004/07/PS.SharedWebServices.Response")
    private List<DashboardDTO> dashboardDTO;
}
