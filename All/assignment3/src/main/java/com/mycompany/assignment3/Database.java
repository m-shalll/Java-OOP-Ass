package com.mycompany.assignment3;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public abstract class Database<T extends DataBaseClass> {
    protected String fileName;
    protected ArrayList<T> records;
    public Database(String fileName){
        this.fileName=fileName;
        this.records = new ArrayList<>();
    }
    public abstract T createRecordFrom(String line);
    
    public T getRecord(String key) {
        key=key.trim();
        for (T record : records) {
            if (record.getSearchKey().equals(key)) {
                return record;
            }
        }
        return null;
    }
    public void saveToFile () throws FileNotFoundException, IOException{
        FileWriter writer=new FileWriter(fileName,true);
        String line;
        for(T record:records){
            line=record.lineRepresentation();
            writer.write(line+"\n");
        }
    }
    public boolean contains(String key) {
        return getRecord(key) != null;
    }
    public void deleteRecord (String key){
        T record = getRecord(key);
        if(records.contains(key))
        {
            records.remove(record);
        }
    }
    public void insertRecord (T record){
        if(!records.contains(record.getSearchKey()))
        {
            records.add(record);
        }
    }
    public List<T> returnAllRecords (){
         return records;
     }
    public void readFromFile () throws FileNotFoundException{
        T record;
        File file=new File(this.fileName);
        Scanner scan=new Scanner(file);
        while(scan.hasNextLine()){
            String line=scan.nextLine();
//            String[]  part=line.split(",");
//            String trainerId=part[0];
//            String speciality=part[1];
//            String phoneNumber=part[2];
//            String name=part[3];
//            String email=part[4];
//            trainer=new Trainer(trainerId,name,email,speciality,phoneNumber);
            record=createRecordFrom(line);
            records.add(record);
        }
    }
}
