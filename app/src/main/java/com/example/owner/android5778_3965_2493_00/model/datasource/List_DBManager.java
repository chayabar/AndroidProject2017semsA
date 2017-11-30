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
import java.util.Objects;

import static com.example.owner.android5778_3965_2493_00.model.backend.RentConst.ContentValuesToBranch;
import static com.example.owner.android5778_3965_2493_00.model.backend.RentConst.ContentValuesToCar;
import static com.example.owner.android5778_3965_2493_00.model.backend.RentConst.ContentValuesToCarModel;
import static com.example.owner.android5778_3965_2493_00.model.backend.RentConst.ContentValuesToCustomer;

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
    public boolean existCustomer(ContentValues newcustomer) {
        Customer customer = ContentValuesToCustomer(newcustomer);
        for (Customer item : customers)
            if (item.getCustomerID() == customer.getCustomerID()) {
                return true;
            }
        return false;    }

    @Override
    public boolean existcarModel(ContentValues newCarModel) {
        CarModel carModel = ContentValuesToCarModel(newCarModel);
        for (CarModel item : carModels)
            if (item.getModelCode().equals(carModel.getModelCode())) {
                return true;
            }
        return false;
    }

    @Override
    public boolean existcar(ContentValues newCar) {
        Car car = ContentValuesToCar(newCar);
        for (Car item : cars)
            if (item.getCarNumber().equals(car.getCarNumber())) {
                return true;
            }
        return false;
    }

    @Override
    public boolean existbranch(ContentValues newbranch) {
        Branch branch = ContentValuesToBranch(newbranch);
        for (Branch item : branchs)
            if (item.getBranchNumber() == branch.getBranchNumber()) {
                return true;
            }
        return false;
    }

    @Override
    public boolean addCustomer(ContentValues newCustomer) {
        Customer customer = ContentValuesToCustomer(newCustomer);
        customers.add(customer);
        return true;
    }

    @Override
    public boolean addCarModel(ContentValues newCarModel) {
        CarModel carModel = ContentValuesToCarModel(newCarModel);
        carModels.add(carModel);
        return true;
    }

    @Override
    public boolean addCar(ContentValues newCar) {
        Car car = ContentValuesToCar(newCar);
        cars.add(car);
        return true;
    }

    @Override
    public boolean addBranch(ContentValues newBranch) {
        Branch branch = ContentValuesToBranch(newBranch);
        branchs.add(branch);
        return true;
    }

    @Override
    public boolean removeCustomer(long id) {
        Customer customerToRemove = null;
        for (Customer item : customers)
            if (item.getCustomerID() == id) {
                customerToRemove = item;
                break;
            }
        return customers.remove(customerToRemove);
    }

    @Override
    public boolean removeCarModel(String id) {
        CarModel carModelToRemove = null;
        for (CarModel item : carModels)
            if (item.getModelCode().equals(id)) {
                carModelToRemove = item;
                break;
            }
        return carModels.remove(carModelToRemove);

    }

    @Override
    public boolean removeCar(String id) {
        Car carToRemove = null;
        for (Car item : cars)
            if (item.getCarNumber().equals(id)) {
                carToRemove = item;
                break;
            }
        return cars.remove(carToRemove);

    }

    @Override
    public boolean removeBranch(long id) {
        Branch branchToRemove = null;
        for (Branch item : branchs)
            if (item.getBranchNumber() == id) {
                branchToRemove = item;
                break;
            }
        return branchs.remove(branchToRemove);

    }

    @Override
    public boolean updateCustomer(int id,ContentValues values) {
        Customer customer = ContentValuesToCustomer(values);
        customer.setCustomerID(id);
        for (int i = 0; i < customers.size(); i++)
            if (customers.get(i).getCustomerID() == id) {
                customers.set(i, customer);
                return true;
            }
        return false;
    }

    @Override
    public boolean updateCarModel(String id,ContentValues values) {
        CarModel carModel = ContentValuesToCarModel(values);
        carModel.setModelCode(id);
        for (int i = 0; i < carModels.size(); i++)
            if (carModels.get(i).getModelCode().equals(id)) {
                carModels.set(i, carModel);
                return true;
            }
        return false;
    }

    @Override
    public boolean updateCar(String id,ContentValues values) {
        Car car = ContentValuesToCar(values);
        car.setCarNumber(id);
        for (int i = 0; i < cars.size(); i++)
            if (cars.get(i).getCarNumber().equals(id)) {
                cars.set(i, car);
                return true;
            }
        return false;
    }

    @Override
    public boolean updateBranch(int id,ContentValues values) {
        Branch branch = ContentValuesToBranch(values);
        branch.setBranchNumber(id);
        for (int i = 0; i < branchs.size(); i++)
            if (branchs.get(i).getBranchNumber() == id) {
                branchs.set(i, branch);
                return true;
            }
        return false;
    }

    @Override
    public List<Customer> getCustomers() {
        return customers;
    }

    @Override
    public List<CarModel> getCarModels() {
        return carModels;
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Branch> getBranchs() {
        return branchs;
    }
}
