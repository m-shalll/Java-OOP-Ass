
package com.mycompany.assignment3;
import java.io.IOException;
import java.util.List;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class TrainerRole {
    private MemberDatabase memberDatabase;
    private ClassDatabase classDatabase;
    private MemberClassRegistrationDatabase registrationDatabase;
    
    public TrainerRole(){
        this.memberDatabase=new MemberDatabase("memberDatabase.txt");
        this.classDatabase=new ClassDatabase("classDatabase");
        this.registrationDatabase=new MemberClassRegistrationDatabase("registrationDatabase");   
    }
    public void addMember (String memberID, String name, String membershipType, String email, String phoneNumber, String status){
        if(!this.memberDatabase.contains(memberID)){
            Member member=new Member( memberID, name, membershipType, email, phoneNumber, status);
            this.memberDatabase.insertRecord(member);
        }
    }
    public List<Member> getListOfMembers (){
        return(this.memberDatabase.returnAllRecords());
    }
    public void addClass (String classID, String className, String trainerID, int duration, int maxParticipants){
        Class classs=new Class(classID,  className,  trainerID,  duration, maxParticipants);
        this.classDatabase.insertRecord(classs);
    }
    public List<Class> getListOfClasses(){
        return(this.classDatabase.returnAllRecords());
    }
    public boolean registerMemberForClass (String memberID, String classID, LocalDate registrationDate){
        int available=this.classDatabase.getRecord(classID).getAvailableSeats();
        if(available!=0){
            this.classDatabase.getRecord(classID).setAvailableSeats(available-1);
            String status="active";
            MemberClassRegistration regis=new MemberClassRegistration(memberID,classID,status,registrationDate);
            this.registrationDatabase.insertRecord(regis);
            return true;
        }
        return false;
    }
    public boolean cancelRegistration(String memberId,String classId){
        
        LocalDate currentDate = LocalDate.now();
        LocalDate registrationDate =this.registrationDatabase.getRecord(classId).getRegistrationDate() ;
        long daysBetween = ChronoUnit.DAYS.between(registrationDate, currentDate);
        if(daysBetween<=3){
            int available=this.classDatabase.getRecord(classId).getAvailableSeats();
            this.classDatabase.getRecord(classId).setAvailableSeats(available+1);
            this.registrationDatabase.getRecord(classId).status="canceled";
            return true;
        }
        return false;
    }
    public List<MemberClassRegistration> getListOfRegistrations(){
        return this.registrationDatabase.returnAllRecords();
    }
    public void logout() throws IOException{
        this.memberDatabase.saveToFile();
        this.classDatabase.saveToFile();
        this.registrationDatabase.saveToFile();
    }
}
