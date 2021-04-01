package com.example.todoapp.data;


import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.todoapp.model.Task;
import com.example.todoapp.util.TaskRoomDatabase;

import java.util.List;

public class TaskRepository {

    private final TaskDao taskDao;
    private final LiveData<List<Task>> allTasks;

    public TaskRepository(Application application) {
        TaskRoomDatabase database = TaskRoomDatabase.getDatabase(application);
        taskDao = database.taskDao();
        allTasks = taskDao.getTask();
    }

    public LiveData<List<Task>> getAllTasks(){
        return  allTasks;
    }

    public void insert(Task task){
        TaskRoomDatabase.databaseWriterExecutor.execute(()->taskDao.insertTask(task));
    }

    public LiveData<Task> get(long id){
       return taskDao.get(id);
    }
}
