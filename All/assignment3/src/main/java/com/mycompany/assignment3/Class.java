
package com.mycompany.assignment3;

public class Class implements DataBaseClass {
    private final String classID;
    private final String className;
    private final String trainerID;
    private final int duration;
    int availableSeats;
    public Class(String classID,String className,String trainerID,int duration,int availableSeats){
        this.classID=classID;
        this.className=className;
        this.trainerID=trainerID;
        this.duration=duration;
        this.availableSeats=availableSeats;
    }
    @Override
    public String getSearchKey (){
        return(this.classID);
    }
    @Override
    public String lineRepresentation (){
        return(this.classID+","+this.className+","+this.trainerID+","+this.duration+","+this.availableSeats);
    }
    public int getAvailableSeats(){
        return this.availableSeats;
    }
    public void setAvailableSeats (int availableSeats){
        this.availableSeats=availableSeats;
    }
}
