package pl.edu.pb.todoapp;

import java.util.Date;
import java.util.UUID;

public class Task {

    private UUID id;
    private String name;
    private Date date;
    private boolean done;

    public boolean isDone() {
        return this.done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



    public Task(){
        id = UUID.randomUUID();
        date = new Date();
    }
}
