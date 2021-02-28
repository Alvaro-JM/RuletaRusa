package pacalcompany.juego_ruletarusa;

import java.util.Scanner;

public class Juego_RuletaRusa {
    
    public static void menuString(){
        System.out.println("Elija acción: "
                + "\n\t1: Pasar"
                + "\n\t2: Disparar");
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //Se elige DIFICULTAD
        int dificultad = 0;
        while (dificultad < 1 || dificultad > 3) {
            System.out.println("Seleccione dificultad: "
                + "\n\t1: Fácil"
                + "\n\t2: Media"
                + "\n\t3: Difícil");
            dificultad = scan.nextInt();
        }
        
        //Se crean REVOLVER, IA
        Revolver r = new Revolver();
        IA ia = new IA (dificultad, r);
        
        //Se crea JUGADOR
        System.out.println("Introduzca nombre de jugador:");
        String nombre = scan.next();
        while (nombre.equals("Vladimir")) {
            System.out.println("Nombre no válido, elije otro");
            nombre = scan.next();
        }
        Jugador j = new Jugador (nombre, r);
        
        
        boolean seguirJuego = true;
        while (seguirJuego) {
            
            System.out.println("\n--------------------------"
                    + "\nDinero " + j.NOMBRE + ": " + j.getDinero() +
                    "\nDinero " + IA.NOMBRE + ": " + ia.getDinero()+
                    "\n--------------------------"
                    + "\nAmbos apostais 100€, y el cilindro vuelve a girar");
            
            r.girarCilindro();
            
            boolean noPasa = true;
            boolean noPasaIA = true;
            
            boolean seguirRonda = true;
            while (seguirRonda) {
                System.out.println("\nTurno de " + j.NOMBRE);
                
                /*
                Trampas que permiten ver al jugador las posición de la bala
                System.out.println("La posición de la bala es :" + r.getPosRealBala()
                        + "\nLa posición de disparo es : " + r.getPosActualDisparo());
                */
                
                int eleccion = 0;
                while (eleccion < 1 || eleccion > 3 ) {
                    menuString(); 
                    eleccion = scan.nextInt();
                }
                switch (eleccion) {
                    case 1:
                        noPasa = j.pasar();
                        break;
                    case 2:
                        j.dispararse();
                        break;
                    default:
                        System.out.println("Elección incorrecta");;
                } 
                
                //Turno de IA, depende de si jugador pasa o muere
                if (j.isVivo() && noPasa) {
                    System.out.println("\nTurno de " + IA.NOMBRE);
                    noPasaIA = ia.hacerTrampas();
                }
                
                //Si alguno pasa el otro gana la apuesta
                if (!noPasa) {
                    ia.ganar();
                }else if(!noPasaIA){
                    j.ganar();
                }
                //La ronda sigue si ambos siguen vivos y no han pasado
                seguirRonda = ia.isVivo() && j.isVivo() && noPasa && noPasaIA;
            }
            //El juego continúa si ambos están vivos y tienen dinero suficiente
            seguirJuego = ia.isVivo() && j.isVivo() && ia.getDinero() >= 100 && j.getDinero() >= 100;
        }
        
        //Mensaje final
        System.out.println("\n ---FIN---");
        if (j.isVivo()) {
            if (j.getDinero() > 0) {
                System.out.println("Has ganado " + j.getDinero() +
                        "€, y más importante, sigues VIVO");
            }else
                System.out.println("Te has arruinado, pero aún sigues VIVO");
        }else{
            System.out.println("Lo sentimos, has MUERTO");
        }
    }
}
