package me.dio.andersonjsmi;

public class Player extends App {
    private boolean playing;
    private boolean showCover;
    private boolean landscape;

    public void play (Media media) {
        //reproduz a musica/video
        System.out.println("Reproduzindo media");
    }
    public void stop () {
        //para a reprodução
        System.out.println("Reprodução interrompida");
    }
    public void showCover () {
        //exibe o encarte/miniatura
        System.out.println("Exibindo encarte");
    }
    public void toggleCover () {
        //altera a visuzlização entre encarte e playlist
        if(this.showCover){
            System.out.println("Exibindo playlist");
            this.showCover = false;
        }else{
            this.showCover();
            this.showCover = true;
        }
    }
}