package com.example.owner.android5778_3965_2493_00.model.backend;

import android.content.ContentValues;

import com.example.owner.android5778_3965_2493_00.model.entities.Branch;
import com.example.owner.android5778_3965_2493_00.model.entities.Car;
import com.example.owner.android5778_3965_2493_00.model.entities.CarModel;
import com.example.owner.android5778_3965_2493_00.model.entities.Customer;

import java.util.List;

/**
 * Created by owner on 26/11/2017.
 */

public interface DB_manager {
    void addCustomer(ContentValues newCustomer);
    void addCarModel(ContentValues newCarModel);
    void addCar(ContentValues newCar);
    void addBranch(ContentValues newBranch);

    void removeCustomer(ContentValues customer);
    void removeCarModel(ContentValues carModel);
    void removeCar(ContentValues car);
    void removeBranch(ContentValues branch);

    void updateCustomer(ContentValues customer);
    void updateCarModel(ContentValues carModel);
    void updateCar(ContentValues car);
    void updateBranch(ContentValues branch);

    boolean existCustomer(ContentValues customer);
    boolean existcarModel(ContentValues carModel);
    boolean existcar(ContentValues car);
    boolean existbranch(ContentValues branch);


    List<Customer> getCustomers();
    List<CarModel> getCarModels();
    List<Car> getCars();
    List<Branch> getBranchs();
}

