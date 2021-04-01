package com.example.todoapp.util;

import java.util.Date;

public class Converter {

    public static Date fromTimeStamp(Long value){
        return value == null ? null : new Date(value);
    }
}
