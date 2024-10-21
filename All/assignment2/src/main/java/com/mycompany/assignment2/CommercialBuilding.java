
package com.mycompany.assignment2;

class CommercialBuilding extends Building{
        private double officeSpace;
        private double rentPerSquareMeter;
        public CommercialBuilding(String address,int numOfFloors,double totalArea,double officeSpace,double rentPerSquareMeter){
            super(address, numOfFloors,totalArea);
            this.officeSpace=officeSpace;
            this.rentPerSquareMeter=rentPerSquareMeter;
            
        }
        public void info(){
            displayCommonInfo();
            System.out.println("Office space: " + this.officeSpace);
            System.out.println("Rent per square meter: " + this.rentPerSquareMeter);
        }
    }
