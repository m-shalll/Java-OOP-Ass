package com.mycompany.assignment2;
import java.util.List;
import java.util.ArrayList;

public class Movie {
    final String title;
    final String director;
    final String actors;
    List<Review> reviews= new ArrayList<>();
    int rating=0;
    public Movie(String title, String director, String actors){
        this.title=title;
        this.director=director;
        this.actors=actors;
        System.out.println("Movie '"+this.title+"' created by '"+this.director+"' with actors: "+this.actors);
    }
    public void details(){
        System.out.println("User requests movie details for '"+this.title+"'");
        System.out.println("Movie: "+this.title);
        System.out.println("Director: "+this.director);
        System.out.println("Actors: "+this.actors);
        for(Review sample:this.reviews){
            this.rating+=sample.rating;
             System.out.print("-Reviews: "+sample.text+"| Rating: "+sample.rating);
        }
        System.out.println();
        this.rating=this.rating/this.reviews.size();
        System.out.println("Average rating: "+this.rating);
    }
}
