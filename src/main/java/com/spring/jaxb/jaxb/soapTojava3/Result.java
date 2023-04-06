package com.spring.jaxb.jaxb.soapTojava3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "Results")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result", propOrder = { "Errors", "Count",  "Return", "DashboardDTOs"})
public class Result {

        @XmlElement(name="Errors", required = true, namespace = "http://schemas.datacontract.org/2004/07/PS.SharedWebServices.Response")
        private String Errors;

        @XmlElement(name="Count", required = true, namespace = "http://schemas.datacontract.org/2004/07/PS.SharedWebServices.Response")
        private Integer Count;

        @XmlElement(name="Return", required = true, namespace = "http://schemas.datacontract.org/2004/07/PS.SharedWebServices.Response")
        private String Return;

        @XmlElement(name = "DashboardDTOs", namespace = "http://schemas.datacontract.org/2004/07/PS.SharedWebServices.Response")
        private List<DashboardDTOs> DashboardDTOs;
}
