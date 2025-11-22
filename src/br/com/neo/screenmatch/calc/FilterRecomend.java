package br.com.neo.screenmatch.calc;

public class FilterRecomend {
    private String recomendation;

    public void filter(Classification classification) {
        if (classification.getClassification() >= 4) {
            this.recomendation = "Muito recomendado";
        } else if (classification.getClassification() >= 2) {
            this.recomendation = "Recomendado";
        } else {
            this.recomendation = "Não recomendado";
        }
        System.out.println(this.recomendation);
    }
}
