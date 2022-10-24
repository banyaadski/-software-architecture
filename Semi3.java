package Semi3;

import java.awt.*;

/*
 * Создание абстрактного класса
 */
abstract class Car {
    public enum TypeCar {
        SEDAN,
        PIKCUP
    }

    public enum TypeFuel {
        GASOLINE,
        DIESEL
    }

    public enum TypeGearBox {
        MT,
        AT
    }

    /*
     * поля класса для обозначения некоторых состояний объекта
     */
    private String make;
    private String model;
    private Color color;
    private TypeCar bodyType;
    private int numberWheels;
    private TypeFuel fuelType;
    private TypeGearBox gaerboxType;
    private double engineCapacity;

    /*
     * методы для "работы" экземпляра класса
     * 
     */
    public void movement() {
    }

    public void maintenance() {
    }

    public boolean gearShifting() {
        return true;
    }

    public boolean switchHeadlights() {
        return true;
    }

    public boolean swithWipers() {
        return true;
    }

    /*
     * методы для оперативной работы с полями класса
     * т.к поля "Закрыты" нужно использовать "get" и "set"
     * для изменения или вывода информации о полях
     * 
     */
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public TypeFuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(TypeFuel fuelType) {
        this.fuelType = fuelType;
    }

    public TypeGearBox getGaerboxType() {
        return gaerboxType;
    }

    public void setGaerboxType(TypeGearBox gaerboxType) {
        this.gaerboxType = gaerboxType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

}

/*
 * создание конекретного объекта абстрактного класса
 */
class PickUp extends Car implements Refueling, Wiping {

    private int loadCapacity;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void fuel() {

    }

    @Override
    public void wipWindshild() {

    }

    @Override
    public void wipHeadlights() {

    }

    @Override
    public void wipMirror() {

    }

}

class FutureCar extends Car {

    FutureCar() {
        this.setNumberWheels(getNumberWheels());
    }

    @Override
    public void movement() {
        fly();
    }

    private void fly() {
    }
}

interface Refueling {
    void fuel();
}

interface Wiping {
    void wipWindshild();

    void wipHeadlights();

    void wipMirror();
}