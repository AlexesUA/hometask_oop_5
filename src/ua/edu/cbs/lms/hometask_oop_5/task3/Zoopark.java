package ua.edu.cbs.lms.hometask_oop_5.task3;

import java.util.ArrayList;
import java.util.List;


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

    public void removeAnimal(Animal animal){
        animalList.remove(animal);
    }

    public void removeAnimal(int index){
        if(index >= 0 && index<animalList.size())
            animalList.remove(index);
    }


    public void showZoopark(){
        int index = 0;
        for (Animal animal:animalList) {
            System.out.println((index+1) + "; " + animal.toString());
            index++;
        }
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
