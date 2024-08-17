package main;

import java.util.ArrayList;

public abstract class Poligono extends FormaGeometrica {
    protected final ArrayList<Ponto> pontos;

    public Poligono(Ponto[] pontos) {
        this.pontos = new ArrayList<>();
        for(Ponto ponto : pontos){
            this.pontos.add(ponto);
        }
    }

    protected Ponto[] getPontos() {
        Ponto[] copia = new Ponto[pontos.size()];
        int i = 0;
        for(Ponto ponto : pontos){
            copia[i] = ponto;
            i+=1;
        }
        return copia;
    }
}