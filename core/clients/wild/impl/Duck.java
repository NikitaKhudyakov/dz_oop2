package ru.gb.lessons.interfaces.core.clients.wild.impl;

import java.time.LocalDate;

import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.Runn;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

public class Duck extends WildAnimal implements Flyable, Runn, Swimable, Soundable {
    

    public Duck(int id, String name) {
        super(id, name);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + "летит со скоростью: 5 км/ч");
        return 5;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "ходит со скоростью: 3 км/ч");
        return 3;
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + "плавает со скоростью: 2 км/ч");
        return 2;
    }
    @Override
    public String sound() {
        System.out.println();
        return CLASS_NAME + "издает звук - кря";
    }

}
