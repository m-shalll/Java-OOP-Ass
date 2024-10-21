package com.mycompany.assignment2;

public class BuildingMain {
    public static void main(String[] args){
        ResidentialBuilding building1=new ResidentialBuilding("123 Main St",5,1500.0,10,1200.0 );
        CommercialBuilding building2= new CommercialBuilding("456 Market St",10,5000.0 ,4000.0,25.0);
        building1.info();
        building2.info();
    }
}
