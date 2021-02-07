/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Pedido;
import java.util.ArrayList;

/**
 *
 
 */
public class PedidoDAO {
    
    
    /**
     * Insere um pedido dentro do banco de dados
     * @param Pedido exige que seja passado um objeto do tipo Pedido
     */
    public void insert(Pedido pedido){
        Banco.pedido.add(pedido);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param Pedido
     * @return 
     */
    public boolean update(Pedido pedido){
        
        for (int i = 0; i < Banco.pedido.size(); i++) {
            if(idSaoIguais(Banco.pedido.get(i),pedido)){
                Banco.pedido.set(i, pedido);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do pedido passado
     * @param pedido
     * @return 
     */
    public boolean delete(Pedido pedido){
        for (Pedido Lista : Banco.pedido) {
            if(idSaoIguais(Lista,pedido)){
                Banco.pedido.remove(Lista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os pedidos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Pedido> selectAll(){
        return Banco.pedido;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param pedido
     * @param pedidoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Pedido pedido, Pedido pedidoAComparar) {
        return pedido.getId() ==  pedidoAComparar.getId();
    }
    
}
