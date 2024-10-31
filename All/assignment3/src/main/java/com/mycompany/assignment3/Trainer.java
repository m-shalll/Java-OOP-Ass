package com.mycompany.assignment3;

public class Trainer implements DataBaseClass{
    final private String trainerId;
    final private String speciality;
    final private String name;
    final private String email;
    final private String phoneNumber;
    public Trainer(String trainerId,String name,String email,String speciality,String phoneNumber){
        this.name=name;
        this.trainerId=trainerId;
        this.speciality=speciality;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }

    @Override
    public String getSearchKey (){
        return(this.trainerId);
    }
    @Override
    public String lineRepresentation (){
        return(this.name+","+this.trainerId+","+this.speciality+","+this.phoneNumber+","+this.email);
    }

}
