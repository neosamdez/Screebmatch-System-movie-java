package br.com.neo.screenmatch.models;
import br.com.neo.screenmatch.calc.Classification;

// atributos da class movie
public class Movie extends Title implements Classification{
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        // Agora usamos o método da superclasse `medEvaluation()` que retorna a média
        // das avaliações (double). Convertendo para int após dividir por 2.
        // Ex: média 8.0 -> classificação (int)(8.0 / 2) = 4
        return (int) (medEvaluation() / 2);
    }

}
