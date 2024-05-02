package org.example;

public class House {
    private double area;
    private int floors;
    private String materials;
    private boolean hasGarden;

    public void setArea(double area) {
        this.area = area;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public double getArea() {
        return area;
    }

    public int getFloors() {
        return floors;
    }

    public String getMaterials() {
        return materials;
    }

    public boolean getHasGarden() {
        return hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", floors=" + floors +
                ", materials='" + materials + '\'' +
                ", hasGarden=" + hasGarden +
                '}';
    }
}
