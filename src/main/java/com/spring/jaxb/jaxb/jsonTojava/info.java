package com.spring.jaxb.jaxb.jsonTojava;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class info {

    private AuthStatus authStatus;
    private ArrayList<Result> results;
}
