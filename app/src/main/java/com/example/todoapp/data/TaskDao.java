package com.example.todoapp.data;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface TaskDao {

    @Insert
    void insertTask(Task task);


}
