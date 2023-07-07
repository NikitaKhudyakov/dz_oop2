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
public class AquariumFish extends Pet implements Swimable{
    public AquariumFish() {
    }

    public AquariumFish(int id, String name) {
        super(id, name);
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + "плавает со скоростью: 11 км/ч");
        return 11;
    }


}