/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MemberClassRegistrationDatabase extends Database{
    

    public MemberClassRegistrationDatabase(String filename) {
        super(filename);
        readFromFile();
    }
        
    @Override
    public  Type createRecordFrom(String line)
    {
       String arr[] = new String[4];
       arr = line.split(",");
       return new MemberClassRegistration(arr[0].trim(),arr[1].trim(),arr[3].trim(),LocalDate.parse(arr[2].trim()));
    }
          
//        public void readFromFile(){
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
//        
//    public  ArrayList<MemberClassRegistration> returnAllRecords()
//    {
//        return records;
//    }
//    
//    public  boolean contains(String key)
//    {
//        for(int i=0;i<records.size();i++)   
//        {
//            if(records.get(i).getSearchKey().equalsIgnoreCase(key))
//                return true;
//            
//            
//        }
//        return false;
//    }
//    
//    
//    public MemberClassRegistration getRecord(String key)
//    {
//        if(contains(key))
//        {
//            for(int i=0; i<records.size(); i++)
//            {
//                if(records.get(i).getSearchKey().equalsIgnoreCase(key))
//                {
//                    return records.get(i);
//                }
//            }
//        }
//        return null;
//    }
//    
//    
//        public void insertRecord(MemberClassRegistration record)
//    {
//        if(contains(record.getSearchKey()))
//        {
//            System.err.println("Trainer already exists !!");
//        }
//        
//        else 
//        {
//            records.add(record);
//            saveToFile();
//        }
//    }
//    
//        
//    public  void deleteRecord(String key)
//    {
//        
//        if(contains(key))
//        {
//            for(int i=0;i<records.size();i++)   
//            {
//                if(records.get(i).getSearchKey().equalsIgnoreCase(key))
//                {
//                    records.remove(i);
//                    break;
//                }   
//            }
//            saveToFile();
//            return;
//        }
//        System.err.println("Record not found!!");
//    }
//   
//        public void saveToFile()
//    {
//        File file = new File(filename);
//        try {
//            PrintWriter printwriter =  new PrintWriter(file);
//            for(int i=0; i<records.size();i++)
//            {
//                printwriter.println(records.get(i).lineRepresentation());
//            }
//            printwriter.close();
//            
//        } catch (FileNotFoundException ex) {
//            System.err.println("File not found!!");
//        }
//        
//    }
        
}
