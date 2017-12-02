package com.example.owner.android5778_3965_2493_00.model.entities;

/**
 * Created by owner on 26/11/2017.
 */
//gg

public class Branch {
    String address;
    int parkingSpaces;
    int branchNumber;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getParkingSpaces() {
        return parkingSpaces;
    }

    public void setParkingSpaces(int parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }

    public int getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(int branchNumber) {
        this.branchNumber = branchNumber;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "address='" + address + '\'' +
                ", parkingSpaces=" + parkingSpaces +
                ", branchNumber=" + branchNumber +
                '}';
    }

    /*public ContentValues BranchToContentValues(Branch branch)
    {
        ContentValues contentValues=new ContentValues();
        contentValues.put("Address", branch.getAddress());
        contentValues.put("ParkingSpaces", branch.getParkingSpaces());
        contentValues.put("BranchNumber", branch.getBranchNumber());
        return contentValues;
    }

    public Branch ContentToValuesBranch(ContentValues contentValues)
    {
        Branch branch=new Branch();
        branch.setAddress(contentValues.getAsString("Address"));
        branch.setParkingSpaces(contentValues.getAsInteger("ParkingSpaces"));
        branch.setBranchNumber(contentValues.getAsInteger("BranchNumber"));
        return branch;
    }*/
}
