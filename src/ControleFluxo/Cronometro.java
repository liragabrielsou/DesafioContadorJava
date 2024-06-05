package ControleFluxo;

import java.util.Timer;
import java.util.TimerTask;

public class Cronometro {
    public static void main(String[] args) {
        Timer cronometro = new Timer();
        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
                // Ação a ser executada aqui
                System.out.println("Cronômetro executando...");
            }
        };

        int milissegundos = 1000; // Tempo de espera antes da primeira execução (1 segundo)
        cronometro.schedule(tarefa, milissegundos);
    }
}