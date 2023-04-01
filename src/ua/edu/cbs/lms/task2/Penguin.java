package ua.edu.cbs.lms.task2;

public class Penguin extends Animal{


    private Penguin(int age){
        super("Пінгвін", age, "Хутро", "4 лапи", "М'ясо", "Бігає", true);
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
