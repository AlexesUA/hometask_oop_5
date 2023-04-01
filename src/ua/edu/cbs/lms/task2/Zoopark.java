package ua.edu.cbs.lms.task2;

import java.util.List;
import java.util.ArrayList;


public class Zoopark {
    private List<Animal> animalList;

    public Zoopark(){
        animalList = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        animalList.add(animal);
    }

    public void addAnimal(int index, Animal animal){
        animalList.add(index, animal);
    }

    public void showZoopark(){
        int index = 0;
        for (Animal animal:animalList) {
            System.out.println((index+1) + animal.toString());
            index++;
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
