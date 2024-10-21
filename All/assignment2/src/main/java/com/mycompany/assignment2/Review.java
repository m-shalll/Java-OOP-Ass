
package com.mycompany.assignment2;

import java.util.Scanner;

public class Review {
    final Movie movie;
    final User user;
    final int rating;
    String text;
    public Review(String text,int rating, User user, Movie movie){
        this.text=text;
        this.rating=rating;
        this.user=user;
        this.movie=movie;
    }
    public void addReview(){
//    Scanner scan= new Scanner(System.in);
//    System.out.print("Review: ");
//    String text=scan.nextLine();
//    System.out.print("Rating: ");
//    int rating=scan.nextInt();
    System.out.println("Review added by "+this.user.name+":"+this.text+" with rating "+this.rating);
    this.movie.reviews.add(this);
    this.user.reviews.add(this);
}
    public void deleteReview(){
    this.movie.reviews.remove(this);
    this.user.reviews.remove(this);
    System.out.println("Review deleted by: "+this.user.name+ ": "+this.text+" Movie: "+this.movie.title);
    }

}
