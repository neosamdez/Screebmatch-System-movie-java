package br.com.neo.screenmatch;
import br.com.neo.screenmatch.models.Movie;
import br.com.neo.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie(); // instacia da class movie = objeto
        myMovie.setName("O poderoso chefão");
        myMovie.setReleaseYear(1970);
        myMovie.setDurationInMinutes(180);


        myMovie.onDisplay(); // chamando metodo de views
        myMovie.evaluation(8); 
        myMovie.evaluation(10);
        myMovie.evaluation(7);

        System.out.println("Total de avaliações: " + myMovie.getTotalReviews());
        System.out.println("Media de Notas NBA: " + myMovie.medEvaluation());

        Serie twd = new Serie();
        twd.setName("the walking dead");
        twd.setReleaseYear(2015);
        twd.setInclidedOnPlan(false);
        twd.setSeasons(10);
        twd.setEpSeason(16);
        twd.setMinEpisode(50);

        System.out.println("Duração para maratonar Twd: " + twd.getDurationInMinutes());
        

    }

}
