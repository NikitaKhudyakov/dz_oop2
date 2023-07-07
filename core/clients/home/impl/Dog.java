package ru.gb.lessons.interfaces.core.clients.home.impl;

import ru.gb.lessons.interfaces.core.clients.Runn;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.home.Pet;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Dog extends Pet implements Runn, Soundable, Swimable{
    public Dog() {
    }

    public Dog(int id, String name) {
        super(id, name);
    }


    @Override
    public int run() {
        System.out.println(CLASS_NAME + "бегает со скоростью: 15 км/ч");
        return 15;
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + "плавает со скоростью: 1 км/ч");
        return 1;
    }
    @Override
    public String sound() {
        System.out.println();
        return CLASS_NAME + "издает звук - гав";
    }


}
