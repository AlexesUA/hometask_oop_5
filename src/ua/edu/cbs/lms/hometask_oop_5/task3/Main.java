package ua.edu.cbs.lms.hometask_oop_5.task3;

public class Main {
    public static void main(String[] args) {
        Zoopark zoopark = new Zoopark();

        zoopark.addAnimal(Leopard.addLeopard(7));
        zoopark.addAnimal(Lion.addLion(5));
        zoopark.addAnimal(Penguin.addPenguin(4));
        zoopark.addAnimal(Ostrich.addOstrich(2));

        System.out.println("\n\n" + zoopark.size());

        zoopark.addAnimal(3, Leopard.addLeopard(1));
        zoopark.addAnimal(2, Lion.addLion(2));
        zoopark.addAnimal(1, Penguin.addPenguin(3));
        zoopark.addAnimal(0, Ostrich.addOstrich(4));

        System.out.println("\n\n" + zoopark.size());

        System.out.println(zoopark.toString());

        zoopark.showZoopark();

        zoopark.removeAnimal(5);
        zoopark.removeAnimal(3);
        zoopark.removeAnimal(0);

        System.out.println("\n\n" + zoopark.size());
        zoopark.showZoopark();

        zoopark.removeAnimal(Leopard.addLeopard(1));
        zoopark.removeAnimal(Lion.addLion(2));

        System.out.println("\n\n" + zoopark.size());
        zoopark.showZoopark();


        zoopark.clear();

        System.out.println("\n\n" + zoopark.size());
        zoopark.showZoopark();

    }
}
