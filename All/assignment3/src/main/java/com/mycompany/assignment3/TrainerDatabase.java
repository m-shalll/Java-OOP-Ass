package com.mycompany.assignment3;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class TrainerDatabase extends Database<Trainer> {
    public TrainerDatabase(String fileName){
        super(fileName);
    }
    @Override
    public Trainer createRecordFrom (String line){
        Trainer trainer;
        String[] part=line.split(",");
        String trainerId=part[0];
        String speciality=part[1];
        String phoneNumber=part[2];
        String name=part[3];
        String email=part[4];
        trainer=new Trainer(trainerId,name,email,speciality,phoneNumber);
        return(trainer);
     }
 }
