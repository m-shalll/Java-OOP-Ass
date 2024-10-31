
package com.mycompany.assignment3;

public class MemberDatabase extends Database<Member> {
     public MemberDatabase(String fileName){
        super(fileName);
    }
    @Override
    public Member createRecordFrom (String line){
        Member member;
        String[] part=line.split(",");
        String name=part[0].trim();
        String memberId=part[1].trim();
        String phoneNumber=part[2].trim();
        String email=part[3].trim();
        String membershipType=part[4].trim();
        String status=part[5].trim();
        member=new Member(name,memberId,phoneNumber,email,membershipType,status);
        return(member);
     }
}
