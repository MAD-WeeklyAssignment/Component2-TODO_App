package com.example.todoapp.util;

import androidx.room.TypeConverter;

import com.example.todoapp.model.Priority;

import java.util.Date;

public class Converter {

    @TypeConverter
    public static Date fromTimeStamp(Long value){
        return value == null ? null : new Date(value);
    }

    @TypeConverter
    public static Long dateToTimeStamp(Date date){
        return value == null ? null : date.getTime();
    }

    @TypeConverter
    public static String fromPriority(Priority priority){
        return priority == null ? null : priority.name();
    }
}
