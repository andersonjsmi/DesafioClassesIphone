package me.dio.andersonjsmi;

import java.util.List;

public class Gallery {
    private List<Media> medias;

    public List<Media> getMediaList () {
        //retorna a lista de imagens/videos da galeria
        return this.medias;
    }

    public void showMedia (Media media) {
        //exibe a midia
        System.out.println("Exibindo media");
    }

    public void setWallpaper (Media media) {
        //define a media como imagem de fundo
        System.out.println("Papel de parede definido");
    }
}
