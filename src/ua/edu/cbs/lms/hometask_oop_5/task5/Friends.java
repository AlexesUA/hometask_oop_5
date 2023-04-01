package ua.edu.cbs.lms.hometask_oop_5.task5;

import java.util.ArrayList;
import java.util.List;

public class Friends {

    private List<String> nameFriends;

    public Friends(){
        nameFriends = new ArrayList<>();
    }

    public void addFriend(String name){
        nameFriends.add(name);
    }

    public void showFriends(){
        for (String nameFriend : nameFriends){
            System.out.println(nameFriend);
        }
    }

}
