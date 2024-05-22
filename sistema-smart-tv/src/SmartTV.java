public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
 
    //Ligar tv
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    //volume
    public void aumentaVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    //Canal
    public void mundarCanal( int novoCanal) {
        canal = novoCanal;
    }
    public void aumentaCanal() {
        canal++;
    }
    public void diminuirCanal() {
        canal--;
    }
}
