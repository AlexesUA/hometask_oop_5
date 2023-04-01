package ua.edu.cbs.lms.hometask_oop_5.task5;

public class Main {
    public static void main(String[] args) {

        Friends friends = new Friends();
        friends.addFriend("Наталя");
        friends.addFriend("Ігор");
        friends.addFriend("Ольга");
        friends.addFriend("Володимир");
        friends.addFriend("Юлія");
        friends.addFriend("Василь");
        friends.addFriend("Тетяна");
        friends.addFriend("Олексій");
        friends.addFriend("Юрій");
        friends.addFriend("Людмила");


        System.out.println("Before sorting");
        friends.showFriends();


        System.out.println("\n\nAfter sorting");
        friends.sort();
        friends.showFriends();

    }
}
