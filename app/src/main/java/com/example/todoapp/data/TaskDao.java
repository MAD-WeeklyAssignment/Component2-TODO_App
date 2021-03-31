package com.example.todoapp.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.todoapp.model.Task;

@Dao
public interface TaskDao {

    @Insert
    void insertTask(Task task);

    @Query("Delete FROM task_table")
    void deleteAll();


}
