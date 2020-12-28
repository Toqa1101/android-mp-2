package com.example.homework4;

public class Drama {
    private String name;
    private int episods;
    private double raiting;
    private String genre;
    private int year;
    private int img;

    public Drama(String name, int episods, double raiting, String genre, int year, int img) {
        this.name = name;
        this.episods = episods;
        this.raiting = raiting;
        this.genre = genre;
        this.year = year;
        this.img = img;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEpisods() {
        return episods;
    }

    public void setEpisods(int episods) {
        this.episods = episods;
    }

    public double getRaiting() {
        return raiting;
    }

    public void setRaiting(double raiting) {
        this.raiting = raiting;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
