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

    @Override
    public String covered() {
        return null;
    }

    @Override
    public String limbs() {
        return null;
    }

    @Override
    public String food() {
        return null;
    }

    @Override
    public String move() {
        return null;
    }

    @Override
    public String aggression() {
        return null;
    }
}
