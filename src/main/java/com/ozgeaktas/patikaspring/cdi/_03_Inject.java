package com.ozgeaktas.patikaspring.cdi;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

@Named(value = "injecttuto")
@ApplicationScoped
public class _03_Inject {


    @Inject
    List<String> tuketen;

    public List<String> getTuketen() {
        return tuketen;
    }
}
