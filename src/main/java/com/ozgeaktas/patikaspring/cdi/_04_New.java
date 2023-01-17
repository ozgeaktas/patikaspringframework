package com.ozgeaktas.patikaspring.cdi;

import com.ozgeaktas.patikaspring.StudentDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.New;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;

import java.io.Serializable;

@Named(value = "newtuto")
@ApplicationScoped
public class _04_New implements Serializable {


    //üretilen
    @Produces
    public String uretilenData(@New  StudentDto studentDto){
        studentDto=StudentDto.builder().studentId(0L).studentName("adı").build();

        return studentDto.getStudentName();

    }
    @Getter
    @Inject
    private String tuketilenData;
}
