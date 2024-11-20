/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class TrainerRole {

    private MemberDatabase memberDatabase;
    private ClassDatabase classDatabase;
    private MemberClassRegistrationDatabase registrationDatabase;

    public TrainerRole() {
        memberDatabase = new MemberDatabase("Members.txt");
        classDatabase = new ClassDatabase("Class.txt");
        registrationDatabase = new MemberClassRegistrationDatabase("Registration.txt");
    }

    public void addMember(String MemberId, String name, String email, String membershipType, String phoneNumber, String status) {
        if (!memberDatabase.contains(MemberId)) {
            Member member = new Member(MemberId, name, membershipType, email, phoneNumber, status);
            memberDatabase.insertRecord(member);
        } else {
            System.err.println("Record already saved.");
        }
    }

    public ArrayList<Member> getListOfMembers() {
        ArrayList<Type> type = memberDatabase.returnAllRecords();
        ArrayList<Member> members = new ArrayList<>();
        for (Type a : type) {
            members.add((Member) a);

        }
        return members;
    }

    public void addClass(String classID, String trainerID, String className, int duration, int maxParticipants) {
        if (!classDatabase.contains(classID)) {
            Class cl = new Class(classID, className, trainerID, duration, maxParticipants);
            classDatabase.insertRecord(cl);
        } else {
            System.err.println("Record already saved.");
        }
    }

    public ArrayList<Class> getListOfClasses() {
        ArrayList<Type> type = classDatabase.returnAllRecords();
        ArrayList<Class> classes = new ArrayList<>();
        for (Type a : type) {
            classes.add((Class) a);

        }
        return classes;
    }

    public boolean registerMemberForClass(String memberID, String classID, LocalDate registrationDate) {
       if (!classDatabase.contains(classID)) {
        System.err.println("Class not found.");
        return false;
        }
       Class cls = (Class) classDatabase.getRecord(classID);
       
        if (cls.getAvailableSeats() <= 0) {
        System.err.println("Class is full.");
        return false;
        }
        

        
        if (registrationDatabase.contains(memberID +"-"+classID)) {
        System.err.println("Member is already registered for this class.");
        return false; 
        }
        

        registrationDatabase.insertRecord(new MemberClassRegistration(memberID, classID, "active", registrationDate));

    
         cls.setAvailableSeats((cls.getAvailableSeats())-1);
                 
        return true;
    }
    
    
    
    
    public boolean cancelRegistration(String memberID, String classID)
    {
        if(registrationDatabase.contains(memberID+"-"+classID))
        {
            MemberClassRegistration registration = (MemberClassRegistration) registrationDatabase.getRecord(memberID + "-"+classID);
            if(ChronoUnit.DAYS.between(registration.getRegistrationDate(),LocalDate.now()) < 3)
            {
                registrationDatabase.deleteRecord(memberID+"-"+classID);
                ((Class)classDatabase.getRecord(classID)).setAvailableSeats(((Class)classDatabase.getRecord(classID)).getAvailableSeats() + 1);
                System.out.println("Refund and cancellation were succeful.");
                return true;
            }
        }
        System.err.println("Refund and cancellation were unsucceful.");
        return false;

    }

    public ArrayList<MemberClassRegistration> getListOfRegistrations()
    {
        ArrayList<Type> type = registrationDatabase.returnAllRecords();
        ArrayList<MemberClassRegistration> registrations = new ArrayList<>();
        for (Type a : type) {
            registrations.add((MemberClassRegistration) a);

        }
        return registrations;
    }
    
    
    public void logout() {
        memberDatabase.saveToFile();
        classDatabase.saveToFile();
        registrationDatabase.saveToFile();
    }

}
