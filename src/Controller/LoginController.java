
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import view.login;
import view.MenuPrincipal;



public class LoginController {

    private final login view;
    private LoginHelper helper;

    public LoginController(login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
         //pegar ususario na view
         Usuario usuario = helper.obterModelo();
        
        //pesquisar usuario no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        //se o ususrio da view tiver o mesmo ususario e senha que o ususario vindo do banco direcionar para o menu
        if (usuarioAutenticado != null){
            //volta para menu principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        //senao mostrar uma mensagem ao ususario "Usuario ou senha invalidos"
        }else{
            view.exibeMensagem("Usuario ou senha invalidos");
        }
        
    }
    public void fizTarefa(){
        System.out.println("Busquei algo do banco");
        this.view.exibeMensagem("Executei a tarefa");
    }
}
