package ua.edu.cbs.lms.hometask_oop_5.task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rndNumber = new Random();

        List<Integer> listIntNumbers = new ArrayList<>();

        for(int i = 0; i<10; i++){
            listIntNumbers.add(rndNumber.nextInt(0, 100));
        }

        System.out.println(listIntNumbers);

        ListIterator<Integer> iteratorIntNumber = listIntNumbers.listIterator();

        while (iteratorIntNumber.hasNext()){
            Integer temp = iteratorIntNumber.next();
            iteratorIntNumber.set(temp + 1);
        }

        System.out.println(listIntNumbers);

    }
}
