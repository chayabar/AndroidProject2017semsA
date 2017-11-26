package com.example.owner.android5778_3965_2493_00.model.entities;

/**
 * Created by owner on 26/11/2017.
 */

public class Car {
    int houseBranch;
    String modelName;
    float mileAge;
    String carNumber;

    public int getHouseBranch() {
        return houseBranch;
    }

    public void setHouseBranch(int houseBranch) {
        this.houseBranch = houseBranch;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public float getMileAge() {
        return mileAge;
    }

    public void setMileAge(float mileAge) {
        this.mileAge = mileAge;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "houseBranch=" + houseBranch +
                ", modelName='" + modelName + '\'' +
                ", mileAge=" + mileAge +
                ", carNumber='" + carNumber + '\'' +
                '}';
    }
}
