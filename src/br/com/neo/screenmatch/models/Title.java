package br.com.neo.screenmatch.models;

public class Title {
    private String name;
    private int releaseYear; // ano de lançamento
    private boolean incluidedOnPlan; // incluido no plano  
    private double sumEvaluation; // soma das avaliações
    private int totalReviews; // total de avaliações
    private int durationInMinutes; // duraçao em minutos


    // metodo para libera-lo a ser lido sem editar(get) 
    public int getTotalReviews(){
        return totalReviews;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    // metodos de estados
    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    
    public void setInclidedOnPlan(boolean incluidedOnPlan) {
        this.incluidedOnPlan = incluidedOnPlan;
    }
    
    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }    

    // metodo da class movie = printa na tela 
    public void onDisplay(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento do Filme: " + releaseYear);
        System.out.println("Duração do Filme: " + durationInMinutes);
        System.out.println("Incluido no plano? " + incluidedOnPlan);
    }

    // guarda as notas e soma
    public void evaluation(double nota) {
        sumEvaluation += nota;
        totalReviews++; 
    }

    //divide a soma das avaliaçoes pelo numero de avaliações
    public double medEvaluation(){
        return sumEvaluation / totalReviews;

    }
}
