package ua.edu.cbs.lms.task2;

public class Main {
    public static void main(String[] args) {
        Zoopark zoopark = new Zoopark();

        zoopark.addAnimal(Leopard.addLeopard(7));
        zoopark.addAnimal(Lion.addLion(5));
        zoopark.addAnimal(Penguin.addPenguin(4));
        zoopark.addAnimal(Ostrich.addOstrich(2));

        zoopark.addAnimal(3, Leopard.addLeopard(1));
        zoopark.addAnimal(2, Lion.addLion(2));
        zoopark.addAnimal(1, Penguin.addPenguin(3));
        zoopark.addAnimal(0, Ostrich.addOstrich(4));


        System.out.println(zoopark.toString());

        zoopark.showZoopark();
    }
}
