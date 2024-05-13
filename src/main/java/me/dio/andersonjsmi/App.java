package me.dio.andersonjsmi;

public class App {
    private boolean show;
    private boolean runInBackground;
    private boolean screen;
    private boolean screenMode;

    public Boolean getScreenMode () {
        if(this.screenMode){
            System.out.println("Tela em modo retrato");
        }else{
            System.out.println("Tela em modo paisagem");
        }
        return this.screenMode;
    }
    public void showKeyboard () {
        //exibe o teclado
    };

    public void hideKeyboard () {
        //esconde o teclado
    };

    public void toogleScreen () {
        //habilita e desabilita a tela
        if(screen){
            disableScreen();
        }else{
            enableScreen();
        }
    }

    private void disableScreen(){
        //desabilita a tela
        this.screen = false;
        System.out.println("Display desabilitado");
    }

    private void enableScreen(){
        //habilitar a tela
        this.screen = true;
        System.out.println("Display habilitado");
    }
}
