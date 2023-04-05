package com.spring.jaxb.jaxb.jsonTojava;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthStatus {

    private int authStatusCode;
    private String authStatusDescription;

}
