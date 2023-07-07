package ru.gb.lessons.interfaces.core.clients.wild.impl;

import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.Runn;
import ru.gb.lessons.interfaces.core.clients.Soundable;

import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;

/**
 * Одна из реализаций дикого животного
 */
public class Pigeon extends WildAnimal implements Runn, Soundable, Flyable {
    
    public Pigeon(int id, String name) {
        super(id, name);
    }

    @Override
    public int run() {
        System.out.println("Бегает со скоростью 1 км/ч");
        return 1;
    }

    @Override
    public String sound() {
        System.out.println();
        return CLASS_NAME + "издает звук - курлык";
    }
    @Override
    public int fly() {
        System.out.println(CLASS_NAME + "летит со скоростью: 4 км/ч");
        return 4;
    }
}
