package com.ozgeaktas.patikaspring;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//Data Transfer Object= Objeler arası veri taşıma işlemi

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto {
    private Long studentId;
    private String studentName;
    private String studentSurname;
}
