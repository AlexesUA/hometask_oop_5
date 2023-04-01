package ua.edu.cbs.lms.hometask_oop_5.task3;

import java.util.Objects;

public abstract class Animal implements ICharacteristic, IDemeanor {

    protected String name;
    protected int age;
    protected String covered;
    protected String limbs;
    protected String food;
    protected String move;
    protected boolean isCarnivores;

    protected Animal(String name, int age, String covered, String limbs, String food, String move, boolean isCarnivores){
        this.name = name;
        this.age = age;
        this.covered = covered;
        this.limbs = limbs;
        this.food = food;
        this.move = move;
        this.isCarnivores = isCarnivores;
    }

//    public static Animal addAnimal(int age, String covered, String limbs, String food, String move, boolean isCarnivores){
//        if(age<0){
//            System.out.println("Вік не може бути менше 0.");
//            return null;
//        }
//        return new Animal(age, covered, limbs, food, move, isCarnivores);
//    }


    @Override
    public String covered() {
        return covered;
    }

    @Override
    public String limbs() {
        return limbs;
    }

    @Override
    public String food() {
        return food;
    }

    @Override
    public String move() {
        return move;
    }

    @Override
    public String aggression() {
        if(isCarnivores) return "Хижак";
        else return "Мирне";
    }

    @Override
    public String toString() {
        return String.format("%1$s; Вік: %2$s; %3$s; Кінцівки: %4$s; Покриття шкіри: %5$s; Може: %6$s; Їжа: %7$s;",
                name, age, aggression(), limbs, covered, move, food);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && isCarnivores == animal.isCarnivores && Objects.equals(name, animal.name) && Objects.equals(covered, animal.covered) && Objects.equals(limbs, animal.limbs) && Objects.equals(food, animal.food) && Objects.equals(move, animal.move);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, covered, limbs, food, move, isCarnivores);
    }
}
