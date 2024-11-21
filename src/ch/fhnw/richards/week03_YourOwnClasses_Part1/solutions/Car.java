package ch.fhnw.richards.week03_YourOwnClasses_Part1.solutions;

import java.time.*;

public class Car {
    private final String serialNumber;
    private String make, model;
    private int year;


    public Car(String serialNumber, String makeInit, String modelInit, int yearInit) {
        this.serialNumber = serialNumber;
        this.make = makeInit;
        this.model = modelInit;
        this.year = yearInit;
    }

    public String getMake() {
        return make;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setMake(String makeUpdate) {
        make = makeUpdate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String modelUpdate) {
        model = modelUpdate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int yearUpdate) {
        year = yearUpdate;
    }

    public boolean isAntique() {
        return Year.now().getValue() - getYear() > 45;
    }

}
