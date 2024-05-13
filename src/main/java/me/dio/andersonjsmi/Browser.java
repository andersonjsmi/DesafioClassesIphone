package me.dio.andersonjsmi;

import java.util.List;

public class Browser {
    private int currentTab;
    private List<Tab> tabs;

    public void refreshTab (int tab) {
        //recarrega pagina
        System.out.println("Reccaregando página");
        tabs.get(tab).refresh();
    }

    public void newTab () {
        //cria nova pagina
        Tab tab = new Tab();
        this.tabs.add(tab);
        System.out.println("Nova aba criada");
    }

    public void showPage (int tabIndex) {
        //renderiza pagina
        System.out.println("Pagina " + this.tabs.get(tabIndex) + "renderizada");
    }
}
