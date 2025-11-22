package br.com.neo.screenmatch.models;

public class Title {
    private String name;
    private int releaseYear; // ano de lançamento
    private boolean includedOnPlan; // incluido no plano  
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

    public void setIncludedOnPlan(boolean includedOnPlan) {
        this.includedOnPlan = includedOnPlan;
    }


    public boolean isIncludedOnPlan() {
        return includedOnPlan;
    }
    
    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }    

    // metodo da class movie = printa na tela 
    public void onDisplay(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento do Filme: " + releaseYear);
        System.out.println("Duração do Filme: " + durationInMinutes + " min");
        // Usar o campo padronizado
        System.out.println("Incluido no plano? " + includedOnPlan);
    }

    // guarda as notas e soma
    public void evaluation(double nota) {
        sumEvaluation += nota;
        totalReviews++; 
    }

    //divide a soma das avaliaçoes pelo numero de avaliações
    public double medEvaluation(){
        // Proteção contra divisão por zero: se não houve avaliações, retorna 0.
        if (totalReviews == 0) {
            return 0.0;
        }
        return sumEvaluation / totalReviews;

    }
}
