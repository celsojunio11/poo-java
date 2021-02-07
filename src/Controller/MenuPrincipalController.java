
package Controller;

import View.Lista;
import view.MenuPrincipal;


public class MenuPrincipalController {
    private final MenuPrincipal view;
    
    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
        
        
    }
    
    public void navegarParaLista(){
        Lista lista = new Lista();
        lista.setVisible(true);
        
    }
    
    
}
