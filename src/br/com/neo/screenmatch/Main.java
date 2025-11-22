package br.com.neo.screenmatch;
import br.com.neo.screenmatch.calc.CalcTime;
import br.com.neo.screenmatch.calc.FilterRecomend;
import br.com.neo.screenmatch.models.Episode;
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
        twd.setIncludedOnPlan(false);
        twd.setSeasons(12);
        twd.setEpSeason(16);
        twd.setMinEpisode(50);

        System.out.println("Duração para maratonar Twd: " + twd.getDurationInMinutes());
        
        CalcTime calculator = new CalcTime();
        System.out.println("Tempo total calculado (min): " + calculator.getTotalTime());

        FilterRecomend filter = new FilterRecomend();
        filter.filter(myMovie);

        Episode episode =  new Episode();
        episode.setNumber(1);
        episode.setSerie(twd);
        episode.setTitle("Pilot");
        episode.setDurationInMinutes(50);
        episode.setSeason(1);
        episode.setTotalViews(4000);

    }

}
