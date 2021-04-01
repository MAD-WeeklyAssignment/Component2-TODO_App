package com.example.todoapp.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.todoapp.model.Task;

import java.util.List;

@Dao
public interface TaskDao {

    @Insert
    void insertTask(Task task);

    @Query("Delete FROM task_table")
    void deleteAll();

    @Query("SELECT * FROM task_table")
    LiveData<List<Task>> getTask();

    @Query("SELECT * FROM task_table WHERE task_table.task_id == :id")
    LiveData<Task> get(long id);

    @Update
    void update(Task task);


}