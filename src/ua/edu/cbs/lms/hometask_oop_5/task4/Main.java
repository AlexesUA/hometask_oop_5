package ua.edu.cbs.lms.hometask_oop_5.task4;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rndNumber = new Random();

        List<Integer> listIntNumbers = new ArrayList<>();

        for(int i = 0; i<10; i++){
            listIntNumbers.add(rndNumber.nextInt(0, 100));
        }

        System.out.println(listIntNumbers);

        Iterator<Integer> iteratorIntNumber = listIntNumbers.listIterator();

        while (iteratorIntNumber.hasNext()){

        }
    }
}
