
package com.mycompany.assignment3;

public class Member implements DataBaseClass {
    final private String memberId;
    final private String status;
    final private String name;
    final private String email;
    final private String phoneNumber;
    final private String membershipType;
    public Member(String memberId,String name,String membershipType,String email,String phoneNumber,String status){
        this.name=name;
        this.memberId=memberId;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.membershipType=membershipType;
        this.status=status;
    }
    @Override
    public String getSearchKey (){
        return(this.memberId);
    }
    @Override
    public String lineRepresentation (){
        return(this.memberId+","+this.name+","+this.membershipType+","+this.email+","+this.phoneNumber+","+this.status);
    }
}
