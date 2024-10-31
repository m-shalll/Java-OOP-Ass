package com.mycompany.assignment3;
import java.time.LocalDate; 
public class MemberClassRegistration implements DataBaseClass {
    final String memberId;
    final String classId;
    String status;
    LocalDate registrationDate;
    public MemberClassRegistration(String memberId,String classId,String status,LocalDate registrationDate){
        this.memberId=memberId;
        this.classId=classId;
        this.status=status;
        this.registrationDate = registrationDate; 
    }
    @Override
    public String getSearchKey (){
        return(this.memberId+","+this.classId);
    }
    @Override
    public String lineRepresentation (){
        return(this.memberId+","+this.classId+","+this.status+","+this.registrationDate);
    }
    public String getMemberID (){
        return(this.memberId);
    }
    public String getClassID (){
        return(this.classId);
    }
    public LocalDate getRegistrationDate (){
        return(this.registrationDate);
    }
}
