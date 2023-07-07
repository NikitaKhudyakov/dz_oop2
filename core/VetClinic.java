package ru.gb.lessons.interfaces.core;

import java.util.ArrayList;
import java.util.List;

import ru.gb.lessons.interfaces.core.clients.Animal;
import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.Human;
import ru.gb.lessons.interfaces.core.clients.Runn;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.home.Pet;
import ru.gb.lessons.interfaces.core.clients.home.impl.Cat;
import ru.gb.lessons.interfaces.core.clients.home.impl.Dog;
import ru.gb.lessons.interfaces.core.clients.wild.impl.Duck;

public class VetClinic {
    private List<Animal> animals = new ArrayList<>();
     private Human headPhysician;
     public VetClinic(Human headPhysician) {
        this.headPhysician = headPhysician;
        this.animals = new ArrayList<>();
    }
    public VetClinic() { this(null); }


    public  List<Runn> AnimalsRunning() {
        List<Runn> runningAnimals = new ArrayList<>();
        for (Animal index : this.animals)
            if (index instanceof Runn) {
                runningAnimals.add((Runn) index);
            }

        return runningAnimals;
    }

    public List<Flyable> AnimalsFlyable() {
        List<Flyable> flyableAnimals = new ArrayList<>();

        for (Animal index : this.animals)
            if (index instanceof Flyable) {
                flyableAnimals.add((Flyable) index);
            }

        return flyableAnimals;
    }

    public List<Soundable> AnimalsSoundable() {
        List<Soundable> soundableAnimals = new ArrayList<>();

        for (Animal index : this.animals)
            if (index instanceof Soundable) {
                soundableAnimals.add((Soundable) index);
            }

        return soundableAnimals;
    }

    public List<Swimable> AnimalsSwimable() {
        List<Swimable> swimableAnimals = new ArrayList<>();

        for (Animal index : this.animals)
            if (index instanceof Swimable) {
                swimableAnimals.add((Swimable) index);
            }

        return swimableAnimals;
    }
public VetClinic addAnimal(Animal animal) {
        if (animal instanceof Human)
            this.headPhysician = (Human) animal;
        else
            this.animals.add(animal);
        return this;
    }
    
   
}
