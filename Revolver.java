package pacalcompany.juego_ruletarusa;

import java.util.Random;

public class Revolver {
    
    public final int POSICIONES = 6;
    private int posRealBala;
    private int posActualDisparo;
    
    public Revolver() {
        Random r = new Random();
        posRealBala = r.nextInt(POSICIONES);
        girarCilindro();
    }

    public int getPosRealBala() {
        return posRealBala;
    }
    public int getPosActualDisparo() {
        return posActualDisparo;
    }
    
    public boolean disparar() {
        boolean exito = false;
        if (posRealBala == posActualDisparo) {
            System.out.println("MUERTE");
            exito = true;
        }else{
            System.out.println("Que suerte, la partida sigue");
        }
        avanzarCilindro();
        return exito;
    }
    
    private void avanzarCilindro() {
        posActualDisparo++;
        if (posActualDisparo == 6) {
            posActualDisparo = 0;
        }
    }
    
    public void girarCilindro() {
        Random r = new Random();
        posActualDisparo = r.nextInt(POSICIONES);
    }
    
}
