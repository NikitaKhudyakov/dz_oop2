package ru.gb.lessons.interfaces.core.clients.home.impl;

import ru.gb.lessons.interfaces.core.clients.Runn;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.home.Pet;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Cat extends Pet implements Runn, Soundable{
    public Cat() {
    }

    public Cat(int id, String name) {
        super(id, name);
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "бегает со скоростью: 7 км/ч");
        return 7;
    }
    @Override
    public String sound() {
        System.out.println();
        return CLASS_NAME + "издает звук - мяу";
    }


    
}
