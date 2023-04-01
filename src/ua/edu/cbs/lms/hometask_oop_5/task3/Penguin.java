package ua.edu.cbs.lms.hometask_oop_5.task3;

public class Penguin extends Animal {


    private Penguin(int age){
        super("Пінгвін", age, "Хутро", "2 ластоногі лапи та 2 криловидкі лапи",
                "Риба", "Плаває, Бігає", false);
    }

    public static Penguin addPenguin(int age){
        if(age<0){
            System.out.println("Вік не може бути менше 0.");
            return null;
        }

        return new Penguin(age);
    }

//    @Override
//    public String toString() {
//        return name + "; " + super.toString();
//    }
}
