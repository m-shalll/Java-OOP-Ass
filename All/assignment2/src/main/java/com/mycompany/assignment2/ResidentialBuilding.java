
package com.mycompany.assignment2;

    class ResidentialBuilding extends Building{
        private int numberOfApartments;
        private double rentPerApartment;
        public ResidentialBuilding(String address,int numOfFloors,double totalArea,int numberOfApartments,double rentPerApartment){
            super(address, numOfFloors,totalArea);
            this.numberOfApartments= numberOfApartments;
            this.rentPerApartment=rentPerApartment;
        }
        public void info(){
            displayCommonInfo();
            System.out.println("Number of apartments: " + this.numberOfApartments);
            System.out.println("Rent per apartment: " + this.rentPerApartment);
        }
    }