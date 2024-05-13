package me.dio.andersonjsmi;

public class Tab {
    public String source;

    public void loadPage(String page){
        //carrega a pagina na tab
        this.source = page;
        System.out.println("Pagina carregada");
    }

    public void refresh () {
        //recarrega pagina
        System.out.println("Pagina recarregada");
    }
}
