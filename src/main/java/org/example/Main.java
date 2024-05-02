package org.example;

public class Main {
    public static void main(String[] args) {

        HouseBuilder cottageBuilder = new CottageBuilder();
        HouseDirector cottageDirector = new HouseDirector(cottageBuilder);
        House cottage = cottageDirector.construct(200.0, 2, "Wood", true);
        System.out.println("Cottage: " + cottage);


        HouseBuilder modernBuilder = new ModernBuilder();
        HouseDirector modernDirector = new HouseDirector(modernBuilder);
        House modern = modernDirector.construct(150.0, 3, "Concrete", false);
        System.out.println("Modern House: " + modern);
    }
}