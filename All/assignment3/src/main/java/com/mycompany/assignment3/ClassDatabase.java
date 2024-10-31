
package com.mycompany.assignment3;

public class ClassDatabase extends Database<Class> {
    public ClassDatabase(String fileName){
        super(fileName);
    }
    @Override
    public Class createRecordFrom (String line) {
        String[] part = line.split(",");
        String classID = part[1].trim(); // Correctly setting the classID first
        String className = part[0].trim();
        String trainerID = part[2].trim();
        int duration = Integer.parseInt(part[3]);
        int availableSeats = Integer.parseInt(part[4]);
        Class result=new Class(classID, className, trainerID, duration, availableSeats);
        return (result);
    }
}
