package me.dio.andersonjsmi;

import java.util.List;

public class Phone {
    private boolean calling;
    private List<Contact> favorites;
    private List<Media> voicemail;

    public void openCall (Contact contato) {
        //inicia chamada
        System.out.println("Ligando para " + contato.getName());
    }

    public void createConference () {
        //cria conferencia com duas chamadas simultaneas
        System.out.println("Chamadas concatenadas");
    }

    public void closeCall() {
        //encerra todas as chamadas
        System.out.println("Chamada encerrada!");
    }

    public void addFavorite(Contact contact) {
        //adiciona um favorito a lista de favoritos
        this.favorites.add(contact);
    }

    public List<Contact> getFavorites() {
        //retorna lista de favoritos
        return this.favorites;
    }

    public void showPhoneKeyboard () {
        //exibe teclado do telefone
        System.out.println("Exibindo teclado");
    }

    public void callForNumber (int number) {
        //fazer chamada com o numero exibido no teclado
        System.out.println("Realizando chamada para " + number);
    }

    public List<Media> getVoiceMail () {
        //retorna a lista com o correio de voz
        return this.voicemail;
    }

    public void playVoiceMail (Media message) {
        //reproduz a mensagem de voz selecionada
        System.out.println("Reproduzindo menssagem");
    }

}
