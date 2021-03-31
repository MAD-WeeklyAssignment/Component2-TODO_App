package com.example.todoapp.model;

import android.renderscript.RenderScript;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName="task_table")
public class Task {

    @ColumnInfo(name="task_id")
    @PrimaryKey(autoGenerate = true)
    public long taskId;

    public String task;

    public Priority priority;

    @ColumnInfo(name="due_date")
    public Date dueDate;

    @ColumnInfo(name = "created_at")
    public Date dateCreated;

    @ColumnInfo(name = "is_done")
    public boolean isDone;

    public Task(String task, Priority priority, Date dueDate, Date dateCreated, boolean isDone) {
        this.task = task;
        this.priority = priority;
        this.dueDate = dueDate;
        this.dateCreated = dateCreated;
        this.isDone = isDone;
    }


}
