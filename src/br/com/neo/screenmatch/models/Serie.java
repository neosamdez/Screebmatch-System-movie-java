package br.com.neo.screenmatch.models;

public class Serie extends Title{
    private int seasons;
    private boolean active;
    private int epSeason;
    private int minEpisode;


    public int getSeasons(){
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean getActive(){
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpSeason(){
        return epSeason;
    }

    public void setEpSeason(int epSeason) {
        this.epSeason = epSeason;
    }

    public int getMinEpisode() {
        return minEpisode;
    }

    public void setMinEpisode(int minEpisode) {
        this.minEpisode = minEpisode;
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * epSeason * minEpisode;
    }

    
    
    
    
    

}
