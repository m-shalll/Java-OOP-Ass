/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class MemberClassRegistration implements Type{
    
    private String memberID;
    private String classID;
    private String registrationStatus;
    
    private LocalDate registrationDate;

    public MemberClassRegistration(String memberID, String classID, String status, LocalDate registrationDate) {
        this.memberID = memberID;
        this.classID = classID;
        this.registrationStatus = status;
        this.registrationDate = registrationDate;
    }

    

    public String getMemberID() {
        return memberID;
    }

    public String getClassID() {
        return classID;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }
    
    @Override
    public String getSearchKey()
    {
        return this.memberID + "-" +this.classID;
    }
    
    @Override
    public String lineRepresentation()
    {
        return this.memberID + "," + this.classID + "," + this.registrationDate + "," + this.registrationStatus;
    }
    
    
    
}
