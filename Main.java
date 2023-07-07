package ru.gb.lessons.interfaces;

import ru.gb.lessons.interfaces.core.VetClinic;
import ru.gb.lessons.interfaces.core.clients.Animal;
import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.Runn;
import ru.gb.lessons.interfaces.core.clients.Runn;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.Workers;
import ru.gb.lessons.interfaces.core.clients.home.impl.AquariumFish;
import ru.gb.lessons.interfaces.core.clients.home.impl.Cat;
import ru.gb.lessons.interfaces.core.clients.home.impl.Dog;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.impl.Duck;
import ru.gb.lessons.interfaces.core.clients.wild.impl.Pigeon;
import ru.gb.lessons.interfaces.core.clients.wild.impl.WildCat;
import ru.gb.lessons.interfaces.core.personal.Doctor;
import ru.gb.lessons.interfaces.core.personal.Nurse;

import java.time.LocalDate;

/**
 * Небольшая шпаргалка по синтаксису java:
 * 
 * 1) Названия классов в java - существительные с большой буквы верблюжьей
 * нотацией: CamelCase;
 * 2) названия методов - отглагольные, с маленькой буквы, верблюжьей нотацией:
 * getUserById;
 * 3) Названия переменных - существительные с маленькой буквы, верблюжьей
 * нотацией: maxCount;
 * 4) названия пакетов в java существительные, всегда с маленькой буквы и в одно
 * слово;
 * -! Если логика классов внутри пакета не позволяет назвать все в одно
 * существительное, надо вложить один пакет в другой.
 */
public class Main {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();

        vetClinic.addAnimal(new Cat(1, "КОТ"));
        vetClinic.addAnimal(new Dog(2, "СОБАКА"));
        vetClinic.addAnimal(new AquariumFish(3, "АКВАРИУМНАЯ РЫБКА"));
        vetClinic.addAnimal(new WildCat(4, "ДИКИЙ КОТ"));
        vetClinic.addAnimal(new Pigeon(5, "ГОЛУБЬ"));
        vetClinic.addAnimal(new Duck(6, "УТКА"));

        System.out.println("AnimalsRunnings:");
        for (Runn r : vetClinic.AnimalsRunning()) {
            System.out.println(r);
        }
        System.out.println("AnimalsSwimable:");
        for (Swimable r : vetClinic.AnimalsSwimable()) {
            System.out.println(r);
        }
        System.out.println("AnimalsSoundable:");
        for (Soundable r : vetClinic.AnimalsSoundable()) {
            System.out.println(r);
        }
        System.out.println("AnimalsFlyable:");
        for (Flyable r : vetClinic.AnimalsFlyable()) {
            System.out.println(r);
        }

        Doctor docktor1 = new Doctor(1, "Карл", "Хирург");
        Doctor docktor2 = new Doctor(2, "Хлоя", "Педиатор");
        Nurse Nurse1 = new Nurse(1, "Робин", "Медсестра");
        Nurse Nurse2 = new Nurse(2, "Тэд", "Медбрат");

    }

}
