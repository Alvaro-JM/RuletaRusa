public class IA {
    
    static public final String NOMBRE = "Vladimir";
    private int dificultad;
    private Revolver r;
    private int dinero = 300;
    private boolean vivo = true;
    
    public IA(int dificultad, Revolver r){
        this.dificultad = dificultad;
        this.r = r;
    }

    public int getDinero() {
        return dinero;
    }

    public boolean isVivo() {
        return vivo;
    }
    
    public boolean hacerTrampas(){
        int posBala = r.getPosRealBala();
        int posDisparo = r.getPosActualDisparo();
        
        if (dificultad > 0 && (posBala == posDisparo)) {
            dificultad --;
            System.out.println("Vladimir pasa, ganas 100€");
            pasar();
            return false;
        }else{
            System.out.println("Vladimir dispara"); 
            dispararse();
            return true;
        }
    }
    
    public void pasar(){
        this.dinero -=100;
    }
    
    public void ganar(){
        this.dinero += 100;
    }
    
    public void morir(){
        this.vivo = false;
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
