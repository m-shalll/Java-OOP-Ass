/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;
import java.util.*;
import java.io.*;

public class MemberDatabase extends Database{

    
    public MemberDatabase(String filename){
        super(filename);
        readFromFile();
    }
    
    @Override
    public Type createRecordFrom(String line){
        String arr[]= new String[6];
        arr= line.split(",");
        return new Member(arr[0].trim(),arr[1].trim(),arr[2].trim(),arr[3].trim(),arr[4].trim(),arr[5].trim());
    } 
    
//    public void readFromFile(){
//        File file=new File(filename);
//        if(!file.exists()){
//            System.err.println("File doesn't exist.");
//        }
//        else{
//            try{
//                Scanner reader=new Scanner(file);
//                while(reader.hasNextLine()){
//                    String line=reader.nextLine();
//                    records.add(createRecordFrom(line));
//                }
//                reader.close();
//            }
//            catch(FileNotFoundException e){
//                System.err.println("File not found!");
//            }    
//            }
//    }
//    
//    public ArrayList<Member> returnAllRecords(){
//        return records;
//    }
//    
//    public boolean contains(String key){
//        for(Member record:records){
//            if(record.getSearchKey().equalsIgnoreCase(key)){
//                return true;
//            }
//        }
//        return false;
//    }
//    
//    public Member getRecord(String key){
//        if(contains(key)){
//            for(Member record:records){
//                if(record.getSearchKey().equalsIgnoreCase(key)){
//                    return record;
//                }
//            }
//        }
//        return null;
//    }
//    
//    public void insertRecord(Member record){
//        if(contains(record.getSearchKey())){
//            System.err.println("Record already exists.");
//            return;
//        }
//        records.add(record);
//        saveToFile();
//    }
//    
//    public void deleteRecord(String key){
//        if(contains(key)){
//            records.remove(getRecord(key));
//            saveToFile();
//            return;
//        }
//        System.err.println("Record not found.");
//    }
//    
//    public void saveToFile(){
//        File file=new File(filename);
//        try{
//            PrintWriter printwriter=new PrintWriter(file);
//            for(Member record:records){
//                printwriter.println(record.lineRepresentation());
//            }
//            printwriter.close();
//        }
//        catch(FileNotFoundException ex){
//            System.err.println("File not found.");
//        }
//    }
//    
}

