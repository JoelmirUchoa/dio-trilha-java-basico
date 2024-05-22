public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status Tv Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status Tv Ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volume);
        smartTv.aumentaVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.mundarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);

    }
}
