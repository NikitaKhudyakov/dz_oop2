package ru.gb.lessons.interfaces.core.clients;

import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.supports.Record;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Workers {
    protected final String CLASS_NAME = "The " + getClass().getSimpleName();

    protected int id_worker; // идентификатор работника для хранения в БД
    protected String name_worker; // ФИО
    protected String positionAtWork_worker; // должность

    public Workers() {
    }

    public Workers(int id, String name, String positionAtWork) {
        this.id_worker = id;
        this.name_worker = name;
        this.positionAtWork_worker = positionAtWork;

    }

    public int getId_worker() {
        return id_worker;
    }

    public void setId_worker(int id) {
        this.id_worker = id_worker;
    }

    public String getName_worker() {
        return name_worker;
    }

    public void setName_worker(String name) {
        this.name_worker = name_worker;
    }

    public String getPositionAtWork() {
        return positionAtWork_worker;
    }

    public void setNumberOfLimbs_worker(String positionAtWork) {
        this.positionAtWork_worker = positionAtWork_worker;
    }

    @Override
    public String toString() {
        return CLASS_NAME + " " +
                "id=" + id_worker +
                ", name='" + name_worker + "'" + ", должность=" + positionAtWork_worker;
    }

    public String getClassName_worker() {
        return this.CLASS_NAME;
    }
}
