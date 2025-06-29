package nl.inholland.oop3.assignment700645.model;

public class MovieDTO {
    private String title;
    private int year;
    private String director;
    private String genre;

    // Constructors
    public MovieDTO() {}

    public MovieDTO(String title, int year, String director, String genre) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.genre = genre;
    }

    // Getters and setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
}


