package com.mycompany.assignment2;
import java.util.List;
import java.util.ArrayList;
public class User {
    final String name;
    List<Review> reviews= new ArrayList<>();
    public User(String name){
        this.name=name;
        System.out.println("User '"+this.name+"' created");
    }
    public void getReviews(){
        System.out.println("User requests to see all reviews submitted by "+this.name);
        if(this.reviews.size()==0)
            System.out.println("No reviews by this user");
        else{
            for(Review review:this.reviews){
               System.out.println(review.text);
        }
        }
        
            
    }

}
