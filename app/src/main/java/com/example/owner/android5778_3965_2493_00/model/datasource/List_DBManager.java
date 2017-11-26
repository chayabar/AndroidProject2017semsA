package com.example.owner.android5778_3965_2493_00.model.datasource;

import android.content.ContentValues;

import com.example.owner.android5778_3965_2493_00.model.backend.DB_manager;
import com.example.owner.android5778_3965_2493_00.model.backend.RentConst;
import com.example.owner.android5778_3965_2493_00.model.entities.Branch;
import com.example.owner.android5778_3965_2493_00.model.entities.Car;
import com.example.owner.android5778_3965_2493_00.model.entities.CarModel;
import com.example.owner.android5778_3965_2493_00.model.entities.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by owner on 26/11/2017.
 */

public class List_DBManager implements DB_manager {
    public static List<Customer> customers;
    public static List<Car> cars;
    public static List<CarModel> carModels;
    public static List<Branch> branchs;

    static {
        customers = new ArrayList<>();
        cars = new ArrayList<>();
        carModels = new ArrayList<>();
        branchs = new ArrayList<>();
    }

    @Override
    public boolean existCustomer(ContentValues customer) {

        return false;
    }

    @Override
    public boolean existcarModel(ContentValues carModel) {
        return false;
    }

    @Override
    public boolean existcar(ContentValues car) {
        return false;
    }

    @Override
    public boolean existbranch(ContentValues branch) {
        return false;
    }

    @Override
    public void addCustomer(ContentValues newCustomer) {
        Customer customer = RentConst.ContentValuesToCustomer(newCustomer);
        List_DBManager.customers.add(customer); //!!!!!!!!!!!!!short
        return;
    }

    @Override
    public void addCarModel(ContentValues newCarModel) {
        CarModel carModel = RentConst.ContentValuesToCarModel(newCarModel);
        List_DBManager.carModels.add(carModel); //!!!!!!!!!!!!!short
        return;
    }

    @Override
    public void addCar(ContentValues newCar) {
        Car car = RentConst.ContentValuesToCar(newCar);
        List_DBManager.cars.add(car); //!!!!!!!!!!!!!short
        return;
    }

    @Override
    public void addBranch(ContentValues newBranch) {

    }

    @Override
    public void removeCustomer(ContentValues customer) {

    }

    @Override
    public void removeCarModel(ContentValues carModel) {

    }

    @Override
    public void removeCar(ContentValues car) {

    }

    @Override
    public void removeBranch(ContentValues branch) {

    }

    @Override
    public void updateCustomer(ContentValues customer) {

    }

    @Override
    public void updateCarModel(ContentValues carModel) {

    }

    @Override
    public void updateCar(ContentValues car) {

    }

    @Override
    public void updateBranch(ContentValues branch) {

    }

    @Override
    public List<Customer> getCustomers() {
        return null;
    }

    @Override
    public List<CarModel> getCarModels() {
        return null;
    }

    @Override
    public List<Car> getCars() {
        return null;
    }

    @Override
    public List<Branch> getBranchs() {
        return null;
    }
}
