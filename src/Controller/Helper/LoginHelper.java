
package Controller.Helper;

import Model.Usuario;
import view.login;


public class LoginHelper implements IHelper{
    
    private final login view;

    public LoginHelper(login view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
        String nome = view.getTextUsuario().getText(); 
        String senha = view.getTextSenha().getText(); 
        
        Usuario modelo = new Usuario(0, nome, senha);
        
        return modelo;
    }
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTextUsuario().setText(nome);
        view.getTextSenha().setText(senha);    
    }
    
    public void limparTela(){
        view.getTextUsuario().setText("");
        view.getTextSenha().setText("");
    }
}
