package br.com.neo.screenmatch.models;
import br.com.neo.screenmatch.calc.Classification;

public class Episode implements Classification{
    private int number;
    private String name;
    private Serie serie;
    private int totalViews;
    private int durationInMinutes;
    private int season;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Alias/compatibilidade: Main.java usa setTitle/getTitle
    public String getTitle() {
        return name;
    }

    public void setTitle(String title) {
        this.name = title;
    }

    // Duração do episódio em minutos
    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    // Temporada do episódio (season)
    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassification() {
        if (totalViews >= 1000) {
            return 5;
        } else if (totalViews >= 500) {
            return 4;
        } else if (totalViews >= 100) {
            return 3;
        } else if (totalViews >= 50) {
            return 2;
        } else if (totalViews >= 10) {
            return 1;
        } else {
            return 0;
        }
    }
}
