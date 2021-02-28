
package pacalcompany.juego_ruletarusa;

public class Jugador {
    
    public final String NOMBRE;
    private Revolver r;
    private int dinero = 300;
    private boolean vivo = true;

    public Jugador(String nombre, Revolver r) {
        this.NOMBRE = nombre;
        this.r = r;
    }

    public int getDinero() {
        return dinero;
    }

    public boolean isVivo() {
        return vivo;
    }
    
    public boolean pasar(){
        this.dinero -= 100;
        return false;
    }
    
    public void ganar(){
        this.dinero += 100;
    }
    
    public void dispararse(){
        boolean exito = r.disparar();
        morir(exito);
    }
    
    public void morir(boolean exito){
        if(exito){
            this.vivo = false;
        }
    }
    
        
    
    
   
}
