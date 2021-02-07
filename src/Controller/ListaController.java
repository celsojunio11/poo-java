
package Controller;

import Controller.Helper.ListaPedidoHelper;
import Model.Cliente;
import Model.DAO.ClienteDAO;
import Model.DAO.ListaPedidoDAO;
import Model.DAO.PedidoDAO;
import Model.ListaPedido;
import Model.Pedido;
import View.Lista;
import java.util.ArrayList;


public class ListaController {
    private final Lista view;
    private final ListaPedidoHelper helper;

    public ListaController(Lista view) {
        this.view = view;
        this.helper = new ListaPedidoHelper(view);
        
    }
    
    public void atualizaTabela(){
     //buscara lista com os agendamentos do banco de dados  
     ListaPedidoDAO listapedidoDAO = new ListaPedidoDAO();
     ArrayList <ListaPedido> listapedidos = listapedidoDAO.selectAll();
     
     //exibe lista na view
     helper.preencherTabela(listapedidos);
     
    }
    
    public void atualizaCliente(){
        //buscar clientes do bancos de dados
        ClienteDAO clienteDAO =  new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        //exibir clientes no combobox
        helper.preencherClientes(clientes);
        
    }
    
    public void atualizaPedido(){
        PedidoDAO pedidoDAO = new PedidoDAO();
        ArrayList<Pedido> pedidos = pedidoDAO.selectAll();
        
        helper.preencherPedidos(pedidos);
                
    }
    
    public void atualizaValor(){
        Pedido pedido = helper.obterPedido();
        helper.setarValor(pedido.getValor());
    }
    
    
    public void realizarPedido(){
        //buscar objeto da tela
        ListaPedido listapedido = helper.obterModelo();
        
        //buscar objeto no banco de dados
        new ListaPedidoDAO().insert(listapedido);
        
        //inseriri elementos no banco  
        atualizaTabela();
        helper.limparTela();
    }
}
