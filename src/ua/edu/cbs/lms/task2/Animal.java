package ua.edu.cbs.lms.task2;

public abstract class Animal implements ICharacteristic, IDemeanor{

    protected int age;
    protected String covered;
    protected String limbs;
    protected String food;
    protected String move;
    protected boolean isCarnivores;

    protected Animal(int age, String covered, String limbs, String food, String move, boolean isCarnivores){
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
        else return "Травоядне";
    }
}
