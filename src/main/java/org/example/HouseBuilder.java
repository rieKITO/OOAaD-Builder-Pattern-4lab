package org.example;

public interface HouseBuilder {
    void buildArea(double area);
    void buildFloors(int floors);
    void buildMaterials(String materials);
    void buildHasGarden(boolean hasGarden);
    House getHouse();
}
