package ua.edu.cbs.lms.hometask_oop_5.task6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> teachers = new ArrayList<>();

        teachers.add("Ковальчук Олексій Віталійович");
        teachers.add("Шевченко Юлія Олегівна");
        teachers.add("Бойко Сергій Володимирович");
        teachers.add("Петренко Оксана Василівна");
        teachers.add("Лисенко Вікторія Ігорівна");
        teachers.add("Мельник Олександра Сергіївна");
        teachers.add("Григоренко Ігор Михайлович");
        teachers.add("Кравченко Наталія Олексіївна");
        teachers.add("Бондаренко Андрій Вікторович");
        teachers.add("Іваненко Марина Петрівна");



        System.out.println("Список вчителів: ");

        for(String teacher: teachers){
            System.out.println(teacher);
        }

        System.out.println("Індекс найкращого вчителя: " + teachers.indexOf("Петренко Оксана Василівна"));
        System.out.println("Індекс найгіршого вчителя: " + teachers.indexOf("Власенко Дмитро Іванович"));

    }
}
