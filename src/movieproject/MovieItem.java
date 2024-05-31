/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieproject;

/**
 *
 * @author Simona
 */
public class MovieItem {

   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simona
 */
  
    private String movies;
    private double price;
    private String genre;
    private String country;
    private int year;
    private String director;

   
    public String getMovies() {
        return movies;
    }

    public void setMovies(String movies) {
        this.movies = movies;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
      public MovieItem(String movies,double price,String genre,String country,int year,String director) {
      
        setMovies(movies);
        setPrice(price);
        setGenre(genre);
        setCountry(country);
        setYear(year);
        setDirector(director);
    }

    public MovieItem() {
        this("American Psycho",7.5,"horror","USA",2000,"Mary Harron");
        

    }
    

    
}


