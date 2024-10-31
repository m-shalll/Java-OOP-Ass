package com.mycompany.assignment3;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class AdminRole {
    TrainerDatabase database;
    public AdminRole() {
         this.database = new TrainerDatabase("Trainers.txt");
    }
    public void addTrainer (String trainerId, String name, String email, String specialty, String phoneNumber){
        if(!this.database.contains(trainerId)){
            Trainer trainer=new Trainer(trainerId, name, email, specialty, phoneNumber);
            this.database.insertRecord(trainer);
        }
    }
    public void removeTrainer (String key){
        if(!this.database.contains(key)){
            this.database.deleteRecord(key);
        }
    }
    public List getListOfTrainers (){
        return(this.database.returnAllRecords());
    }
    public void logout () throws IOException{
        this.database.saveToFile();
    }

}
