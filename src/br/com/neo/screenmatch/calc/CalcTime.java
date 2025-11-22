package br.com.neo.screenmatch.calc;
import br.com.neo.screenmatch.models.Title;

    public class CalcTime {
        private int totalTime;


    public int getTotalTime() {
        return this.totalTime;
    }

    // Renomeado para `include` (inglês correto) para maior clareza.
    public void include(Title titulo) {
        this.totalTime += titulo.getDurationInMinutes();
    }

    // Removidos métodos comentados: eram duplicatas do método genérico `include(Title)`.
    // Mantemos apenas a versão genérica que aceita `Title` para evitar duplicação.
}