package com.example.todoapp.util;

import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class TaskRoomDatabase extends RoomDatabase {

    public static final int NUMBER_OF_THREADS = 4;
    public static volatile TaskRoomDatabase INSTANCE;
    public static final ExecutorService databaseWriterExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);


}
