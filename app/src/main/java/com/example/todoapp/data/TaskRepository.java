package com.example.todoapp.data;


import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.todoapp.model.Task;

import java.util.List;

public class TaskRepository {

    public final TaskDao;
    private final LiveData<List<Task>> allTasks;


}
