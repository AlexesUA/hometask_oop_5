package ua.edu.cbs.lms.task2;

public class Ostrich extends Animal{
    private Ostrich(int age){
        super(age, "Пір'я", "2 лапи та 2 Крила", "Зерно, трава", "Бігає", false);
    }

    public static Ostrich addOstrich(int age){
        if(age<0){
            System.out.println("Вік не може бути менше 0.");
            return null;
        }
        return new Ostrich(age);
    }

    @Override
    public String toString() {
        return "Страус; " + super.toString();
    }
}
