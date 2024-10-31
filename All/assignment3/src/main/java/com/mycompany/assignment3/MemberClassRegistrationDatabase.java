
package com.mycompany.assignment3;
import java.time.LocalDate;
public class MemberClassRegistrationDatabase extends Database<MemberClassRegistration> {
    public MemberClassRegistrationDatabase(String fileName){
        super(fileName);
    }
    @Override
    public MemberClassRegistration createRecordFrom (String line){
        MemberClassRegistration MemberClassRegistration;
        String[] part=line.split(",");
        String memberId=part[0].trim();
        String classId=part[1].trim();
        String status=part[2].trim();
        LocalDate registrationDate=LocalDate.parse(part[3].trim());
        MemberClassRegistration=new MemberClassRegistration(memberId,classId,status,registrationDate);
        return(MemberClassRegistration);
     }
}
