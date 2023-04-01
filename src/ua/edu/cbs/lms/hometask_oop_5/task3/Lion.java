package ua.edu.cbs.lms.hometask_oop_5.task3;

public class Lion extends Animal {

    private Lion(int age){
        super("Лев", age, "Хутро", "4 лапи", "М'ясо", "Бігає", true);
    }

    public static Lion addLion(int age){
        if(age<0){
            System.out.println("Вік не може бути менше 0.");
            return null;
        }

        return new Lion(age);
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
