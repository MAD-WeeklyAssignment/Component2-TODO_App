package com.example.todoapp.data;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.todoapp.model.Task;

import java.util.List;

public class TaskViewModel extends AndroidViewModel {

    public static TaskRepository repository;
    public final LiveData<List<Task>> allTasks;

    public TaskViewModel(@NonNull Application application) {
        super(application);
        repository = new TaskRepository(application);
        allTasks = repository.getAllTasks();
    }

    public LiveData<List<Task>> getAllTasks(){
        return allTasks;
    }

    public static void insert(Task task){
        repository.insert(task);
    }
}
