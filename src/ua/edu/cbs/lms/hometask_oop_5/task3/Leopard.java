package ua.edu.cbs.lms.hometask_oop_5.task3;

public class Leopard extends Animal {
    private Leopard(int age){
        super("Леопард", age, "Хутро", "4 лапи", "М'ясо", "Бігає", true);
    }

    public static Leopard addLeopard(int age){
        if(age<0){
            System.out.println("Вік не може бути менше 0.");
            return null;
        }

        return new Leopard(age);
    }
}
