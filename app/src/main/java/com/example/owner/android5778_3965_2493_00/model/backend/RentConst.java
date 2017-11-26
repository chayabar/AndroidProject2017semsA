package com.example.owner.android5778_3965_2493_00.model.backend;

import android.content.ContentValues;

import com.example.owner.android5778_3965_2493_00.model.entities.Branch;
import com.example.owner.android5778_3965_2493_00.model.entities.Car;
import com.example.owner.android5778_3965_2493_00.model.entities.CarModel;
import com.example.owner.android5778_3965_2493_00.model.entities.Customer;
import com.example.owner.android5778_3965_2493_00.model.entities.Order;

/**
 * Created by owner on 26/11/2017.
 */

public class RentConst {
    public static class BranchConst {
        public static final String BRANCHNUMBER = "_branchNumber";
        public static final String ADDRESS = "address";
        public static final String PARKINGSPACES = "parkingSpaces";
    }

    public static class CarConst {
        public static final String CARNUMBER = "_carNumber";
        public static final String HOUSEBRANCH = "houseBranch";
        public static final String MODELNAME = "modelName";
        public static final String MILEAGE = "mileAge";
    }

    public static class CarModelConst {
        public static final String MODELCODE = "_modelCode";
        public static final String COMPANYNAME = "companyName";
        public static final String MODELNAME = "modelName";
        public static final String ENGINECAPACITY = "engineCapacity";
        public static final String GEARBOX = "gearBox";
        public static final String SEATS = "seats";
        public static final String COLOR = "color";
        public static final String YEARMANUFACTURE = "yearManufacture";
    }

    public static class CustumerConst {
        public static final String ID = "_ID";
        public static final String CUSTOMERID = "customerID";
        public static final String LASTNAME = "lastName";
        public static final String FIRSTNAME = "firstName";
        public static final String PHONENUMBER = "phoneNumber";
        public static final String EMAIL = "eMail";
        public static final String CREDITCARD = "creditCard";
    }

    public static class OrderConst {
        public static final String CUSTUMERID = "_customerID";
        public static final String ORDER = "orderStatus";
        public static final String CARNUMBER = "carNumber";
        public static final String STARTRENT = "startRent";
        public static final String ENDRENT = "endRent";
        public static final String STARMILEAGE = "startMileAge";
        public static final String ENDMILEAGE = "endMileAge";
        public static final String FUELFILLING = "fuelFilling";
        public static final String FUELLITTER = "fuelLitter";
        public static final String CHARGE = "charge";
        public static final String ORDERID = "orderID";
    }

    public static ContentValues BranchToContentValues(Branch branch) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(BranchConst.ADDRESS, branch.getAddress());
        contentValues.put(BranchConst.BRANCHNUMBER, branch.getBranchNumber());
        contentValues.put(BranchConst.PARKINGSPACES, branch.getParkingSpaces());
        return contentValues;
    }

    public static Branch ContentValuesToBranch(ContentValues contentValues) {
        Branch branch = new Branch();
        branch.setAddress(contentValues.getAsString(BranchConst.ADDRESS));
        branch.setParkingSpaces(contentValues.getAsInteger(BranchConst.PARKINGSPACES));
        branch.setBranchNumber(contentValues.getAsInteger(BranchConst.BRANCHNUMBER));
        return branch;
    }

    public static ContentValues CarToContentValues(Car car) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(CarConst.CARNUMBER, car.getCarNumber());
        contentValues.put(CarConst.HOUSEBRANCH, car.getHouseBranch());
        contentValues.put(CarConst.MODELNAME, car.getModelName());
        contentValues.put(CarConst.MILEAGE, car.getMileAge());
        return contentValues;
    }

    public static Car ContentValuesToCar(ContentValues contentValues) {
        Car car = new Car();
        car.setCarNumber(contentValues.getAsString(CarConst.CARNUMBER));
        car.setHouseBranch(contentValues.getAsInteger(CarConst.HOUSEBRANCH));
        car.setModelName(contentValues.getAsString(CarConst.MODELNAME));
        car.setMileAge(contentValues.getAsFloat(CarConst.MILEAGE));
        return car;
    }

    public static ContentValues CarModelToContentValues(CarModel carModel) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(CarModelConst.MODELCODE, carModel.getModelCode());
        contentValues.put(CarModelConst.COMPANYNAME, carModel.getCompanyName());
        contentValues.put(CarModelConst.MODELNAME, carModel.getModelName());
        contentValues.put(CarModelConst.ENGINECAPACITY, carModel.getEngineCapacity());
        contentValues.put(CarModelConst.GEARBOX, String.valueOf(carModel.getGearBox()));
        contentValues.put(CarModelConst.SEATS, carModel.getSeats());
        contentValues.put(CarModelConst.COLOR, carModel.getColor());
        contentValues.put(CarModelConst.YEARMANUFACTURE, String.valueOf(carModel.getYearManufacture()));
        return contentValues;
    }

    public static CarModel ContentValuesToCarModel(ContentValues contentValues) {
        CarModel carModel = new CarModel();
        carModel.setModelCode(contentValues.getAsString(CarModelConst.MODELCODE));
        carModel.setCompanyName(contentValues.getAsString(CarModelConst.COMPANYNAME));
        carModel.setModelName(contentValues.getAsString(CarModelConst.MODELNAME));
        carModel.setEngineCapacity(contentValues.getAsFloat(CarModelConst.ENGINECAPACITY));
        //carModel.setGearBox((Enums.GearBox)Enum.Parse(contentValues.getAsString(CarModelConst.GEARBOX)));
        carModel.setSeats(contentValues.getAsInteger(CarModelConst.SEATS));
        carModel.setColor(contentValues.getAsString(CarModelConst.COLOR));
        //carModel.setYearManufacture(contentValues.getAsDate(CarModelConst.YEARMANUFACTURE));
        return carModel;
    }

    public static ContentValues CustomerToContentValues(Customer customer) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(CustumerConst.CUSTOMERID, customer.getCustomerID());
        contentValues.put(CustumerConst.LASTNAME, customer.getLastName());
        contentValues.put(CustumerConst.FIRSTNAME, customer.getFirstName());
        contentValues.put(CustumerConst.ID, customer.getID());
        contentValues.put(CustumerConst.PHONENUMBER, customer.getPhoneNumber());
        contentValues.put(CustumerConst.EMAIL, customer.geteMail());
        contentValues.put(CustumerConst.CREDITCARD, customer.getCreditCard());
        return contentValues;
    }


    public static Customer ContentValuesToCustomer(ContentValues contentValues) {
        Customer customer = new Customer();
        customer.setCustomerID(contentValues.getAsInteger(CustumerConst.CUSTOMERID));
        customer.setLastName(contentValues.getAsString(CustumerConst.LASTNAME));
        customer.setFirstName(contentValues.getAsString(CustumerConst.FIRSTNAME));
        customer.setID(contentValues.getAsInteger(CustumerConst.ID));
        customer.setPhoneNumber(contentValues.getAsString(CustumerConst.PHONENUMBER));
        customer.seteMail(contentValues.getAsString(CustumerConst.EMAIL));
        customer.setCreditCard(contentValues.getAsString(CustumerConst.CREDITCARD));
        return customer;
    }

    public static ContentValues OrderToContentValues(Order order) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(OrderConst.CUSTUMERID, order.getCustomerID());
        contentValues.put(OrderConst.ORDER, String.valueOf(order.getOrderStatus()));
        contentValues.put(OrderConst.CARNUMBER, order.getCarNumber());
        contentValues.put(OrderConst.STARTRENT, String.valueOf(order.getStartRent()));
        contentValues.put(OrderConst.ENDRENT, String.valueOf(order.getEndRent()));
        contentValues.put(OrderConst.STARMILEAGE, order.getStartMileAge());
        contentValues.put(OrderConst.ENDMILEAGE, order.getEndMileAge());
        contentValues.put(OrderConst.FUELFILLING, order.getFuelFilling());
        contentValues.put(OrderConst.FUELLITTER, order.getFuelLitter());
        contentValues.put(OrderConst.CHARGE, order.getCharge());
        contentValues.put(OrderConst.ORDERID, order.getOrderID());
        return contentValues;
    }

    public static Order ContentValuesToOrder(ContentValues contentValues) {
        Order order = new Order();
        order.setCustomerID(contentValues.getAsInteger(OrderConst.CUSTUMERID));
        //order.setOrderStatus(contentValues.get(OrderConst.ORDER));
        order.setCarNumber(contentValues.getAsString(OrderConst.CARNUMBER));
        //order.setStartRent(contentValues.get(OrderConst.STARTRENT));
        //order.setEndRent(contentValues.get(OrderConst.ENDRENT));
        order.setStartMileAge(contentValues.getAsFloat(OrderConst.STARMILEAGE));
        order.setEndMileAge(contentValues.getAsFloat(OrderConst.ENDMILEAGE));
        order.setFuelFilling(contentValues.getAsBoolean(OrderConst.FUELFILLING));
        order.setFuelLitter(contentValues.getAsFloat(OrderConst.FUELLITTER));
        order.setCharge(contentValues.getAsFloat(OrderConst.CHARGE));
        //order.setOrderID(contentValues.getAsInteger(OrderConst.ORDERID));
        //i add change
        return order;
    }
}
