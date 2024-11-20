/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public abstract class Database {

    private String filename;
    private ArrayList<Type> records;

    public Database(String filename) {
        this.filename = filename;
        records = new ArrayList<>();
    }

    public ArrayList<Type> returnAllRecords() {
        return records;
    }

    public void readFromFile() {
        File file = new File(filename);
        if (!file.exists()) {
            System.err.println("File doesn't exist.");
        } else {
            try {
                Scanner reader = new Scanner(file);
                while (reader.hasNextLine()) {
                    String line = reader.nextLine();
                    records.add(createRecordFrom(line));
                }
                reader.close();
            } catch (FileNotFoundException e) {
                System.err.println("File not found!");
            }
        }
    }

    public boolean contains(String key) {
        for (int i=0; i<records.size() ; i++) {
            if (records.get(i).getSearchKey().equalsIgnoreCase(key)) {
                return true;
            }
        }
        return false;
    }

    public abstract Type createRecordFrom(String line);
    
    
        public Type getRecord(String key){
        if(contains(key)){
            for(Type record:records){
                if(record.getSearchKey().equalsIgnoreCase(key)){
                    return record;
                }
            }
        }
        return null;
    }
        
    public void insertRecord(Type record){
        if(contains(record.getSearchKey())){
            System.err.println("Record already exists.");
            return;
        }
        records.add(record);
    }

    public void saveToFile() {
        File file = new File(filename);
        try {
            PrintWriter printwriter = new PrintWriter(file);
            for (Type record : records) {
                printwriter.println(record.lineRepresentation());
            }
            printwriter.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File not found.");
        }
    }
    
    
    public void deleteRecord(String key){
        if(contains(key)){
            records.remove(getRecord(key));
            return;
        }
        System.err.println("Record not found.");
    }
    
    
}
