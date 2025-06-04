public class Usuario {
    
    public static void main(String[] args) {
        
        MetodosSistemaSmart smartTv = new MetodosSistemaSmart();

        smartTv.diminuirvolume();
        smartTv.diminuirvolume();
        smartTv.diminuirvolume();
        smartTv.aumentarvolume();

        smartTv.diminuircanal();
        smartTv.diminuircanal();
        smartTv.diminuircanal();
        smartTv.diminuircanal();

        System.out.println("tv ligada : " + smartTv.ligada);   
        System.out.println("canal atual : " + smartTv.canal);
        System.out.println("volume atual : " + smartTv.volume);   

        smartTv.ligar();
        System.out.println("novo estatos -> tv ligada : " + smartTv.ligada);   

         smartTv.desligar();
        System.out.println("novo estatos -> tv ligada : " + smartTv.ligada);

        smartTv.mudarcanal(13);
        System.out.println("canal atual : " + smartTv.canal);

    }

}
