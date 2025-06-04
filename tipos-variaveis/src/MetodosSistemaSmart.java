public class MetodosSistemaSmart {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarvolume(){
        volume++;
    }

     public void diminuirvolume(){
        volume--;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void almentarcanal(){
        canal++;
    }

    public void diminuircanal(){
        canal--;
    }

    public void mudarcanal(int novocanal){
        canal = novocanal;
    }

}
