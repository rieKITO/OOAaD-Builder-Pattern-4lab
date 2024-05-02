package org.example;

public class ModernBuilder implements HouseBuilder {
    private House house;

    public ModernBuilder() {
        this.house = new House();
    }

    @Override
    public void buildArea(double area) {
        house.setArea(area);
    }

    @Override
    public void buildFloors(int floors) {
        house.setFloors(floors);
    }

    @Override
    public void buildMaterials(String materials) {
        house.setMaterials(materials);
    }

    @Override
    public void buildHasGarden(boolean hasGarden) {
        house.setHasGarden(hasGarden);
    }

    @Override
    public House getHouse() {
        return house;
    }
}
