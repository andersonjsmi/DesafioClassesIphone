package me.dio.andersonjsmi;

public class Media {
    private byte content[];
    private byte thumbnail[];

    private byte[] getContent() {
        //retorna o conteudo da midia
        return this.content;
    };

    private byte[] getThumbnail() {
        //retorna a miniatura
        return this.thumbnail;
    }
}
