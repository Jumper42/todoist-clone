package com.bawp.todoister.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "task_table")
public class Task {

    @ColumnInfo(name = "task_id")
    @PrimaryKey(autoGenerate = true)
    public long taskId;

    public String task;

    public Priorty priorty;

    @ColumnInfo(name="last_date")
    public Date lastDate;

    @ColumnInfo(name = "craeted_date")
    public Date createdDate;

    @ColumnInfo(name = "is_done")
    public Boolean isDone;

    public Task(String task, Priorty priorty, Date lastDate, Date createdDate, Boolean isDone) {
        this.task = task;
        this.priorty = priorty;
        this.lastDate = lastDate;
        this.createdDate = createdDate;
        this.isDone = isDone;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Priorty getPriorty() {
        return priorty;
    }

    public void setPriorty(Priorty priorty) {
        this.priorty = priorty;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", task='" + task + '\'' +
                ", priorty=" + priorty +
                ", lastDate=" + lastDate +
                ", createdDate=" + createdDate +
                ", isDone=" + isDone +
                '}';
    }
}
