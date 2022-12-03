package com.eric.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    int stuID;
    String stuName;
    int stuAge;
    String stuGender;
    int stuYear;

}
