
package com.mycompany.assignment2;
import java.util.Scanner;
public class MoviesMain {
    public static void main(String[] args){
        User user1=new User("Ahmed");
        User user2=new User("Belal");
        Movie movie1=new Movie("The Dark Knight","Christopher Nolan", "Christian Bale,Heath Ledger, Aaron Eckhart" );
        Review review1=new Review("A brilliant movie with outstanding performances!",5,user1,movie1);
        Review review2=new Review("Good, but a bit too dark for me.",4,user2,movie1);
        review1.addReview();
        review2.addReview();
        movie1.details();
        user1.getReviews();
        review1.deleteReview();
        user1.getReviews();
    }
}
