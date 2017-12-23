package com.example.owner.android5778_3965_2493_00.model.backend;

import android.content.ContentValues;

import com.example.owner.android5778_3965_2493_00.model.entities.Branch;
import com.example.owner.android5778_3965_2493_00.model.entities.Car;
import com.example.owner.android5778_3965_2493_00.model.entities.CarModel;
import com.example.owner.android5778_3965_2493_00.model.entities.Customer;
import com.example.owner.android5778_3965_2493_00.model.entities.Order;

import java.util.List;

/**
 * Created by owner on 26/11/2017.
 */

public interface DB_manager {
    boolean addCustomer(ContentValues newCustomer);
    boolean addCarModel(ContentValues newCarModel);
    boolean addCar(ContentValues newCar);
    boolean addBranch(ContentValues newBranch);
    boolean addOrder(ContentValues newOrder);

   /* boolean removeCustomer(long id);
    boolean removeCarModel(String id);
    boolean removeCar(String id);
    boolean removeBranch(long id);
    boolean removeOrder(long id);

    boolean updateCustomer(int id,ContentValues values);
    boolean updateCarModel(String id,ContentValues values);
    boolean updateCar(String id,ContentValues values);
    boolean updateBranch(int id,ContentValues values);
    boolean updateOrder(int id,ContentValues values);


    boolean existCustomer(ContentValues customer);
    boolean existcarModel(ContentValues carModel);
    boolean existcar(ContentValues car);
    boolean existbranch(ContentValues branch);
    boolean existorder(ContentValues order);*/



    List<Customer> getCustomers();
    List<CarModel> getCarModels();
    List<Car> getCars();
    List<Branch> getBranchs();
    List<Order> getOrders();

}

