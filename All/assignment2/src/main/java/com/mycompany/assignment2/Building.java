package com.mycompany.assignment2;
public class Building {
    private String address;
    private int numOfFloors;
    private double totalArea;
    public Building(String address,int numOfFloors,double totalArea){
        this.address=address;
        this.numOfFloors=numOfFloors;
        this.totalArea=totalArea;
    }
    public void displayCommonInfo() {
        System.out.println("Address: " + this.address);
        System.out.println("Number of floors: " + this.numOfFloors);
        System.out.println("Total area: " + this.totalArea);
    }
}
