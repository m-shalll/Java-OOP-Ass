/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class AdminRole {
    
    private TrainerDatabase database = new TrainerDatabase("Trainers.txt");

    public AdminRole() {
    }
    
    public void addTrainer(String trainerId, String name,String email, String specialty, String phoneNumber)
    {        
        if(!database.contains(trainerId))
        {
            Trainer trainer = new Trainer(trainerId, name, email, specialty, phoneNumber);
             database.insertRecord(trainer);
        }  
        else
        {
            System.err.println("Record already saved.");
        }
    }
    
    public ArrayList<Trainer> getListOfTrainers()
    {
        ArrayList<Type> type = database.returnAllRecords();
        ArrayList<Trainer> trainers = new ArrayList<>();
       for (Type a : type) {
            trainers.add((Trainer) a);

        }
       return trainers;
    }
            
    public void removeTrainer(String key)
    {
        database.deleteRecord(key);
    }
    
    public void logout()
    {
        database.saveToFile();
    }
    
    
    
    
}
