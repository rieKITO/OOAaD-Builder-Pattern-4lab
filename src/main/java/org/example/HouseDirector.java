package org.example;

public class HouseDirector {
    HouseBuilder builder;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
        if (this.builder == null)
            throw new IllegalArgumentException("House director can't work without house builder!");
    }

    public House construct(double area, int floors, String materials, boolean hasGarden) {
        builder.buildArea(area);
        builder.buildFloors(floors);
        builder.buildMaterials(materials);
        builder.buildHasGarden(hasGarden);
        return builder.getHouse();
    }
}
