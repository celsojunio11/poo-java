/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.ListaPedido;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 *
 */
public class ListaPedidoDAO {
    
    /**
     * Insere um listapedido dentro do banco de dados
     * @param listapedido exige que seja passado um objeto do tipo agendamento
     */
    public void insert(ListaPedido listapedido){
          
        if(listapedido.getId() == 0){
            listapedido.setId(proximoId());
            Banco.listapedido.add(listapedido);
        }
        
        
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param listapedido
     * @return 
     */
    public boolean update(ListaPedido listapedido){
        
        for (int i = 0; i < Banco.listapedido.size(); i++) {
            if(idSaoIguais(Banco.listapedido.get(i),listapedido)){
                Banco.listapedido.set(i, listapedido);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do listapedido passado
     * @param listapedido
     * @return 
     */
    public boolean delete(ListaPedido listapedido){
        for (ListaPedido listaBanco : Banco.listapedido) {
            if(idSaoIguais(listaBanco,listapedido)){
                Banco.listapedido.remove(listaBanco);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os listapedido do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<ListaPedido> selectAll(){
        return Banco.listapedido;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param listapedido
     * @param listapedidoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(ListaPedido listapedido, ListaPedido listapedidoAComparar) {
        return listapedido.getId() ==  listapedidoAComparar.getId();
    }
    
    private int proximoId(){
        
        int maiorId = 0;
        
        for (ListaPedido listapedido : Banco.listapedido) {           
           int id = listapedido.getId();
            
            if(maiorId < id){
                maiorId = id;
            }
            
        }
        
        return maiorId + 1;
    }
    
}
