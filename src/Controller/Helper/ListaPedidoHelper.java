
package Controller.Helper;

import Model.Cliente;
import Model.ListaPedido;
import Model.Pedido;
import View.Lista;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class ListaPedidoHelper implements IHelper {
    private final Lista view;

    public ListaPedidoHelper(Lista view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<ListaPedido> listapedidos) {
     DefaultTableModel tableModel = (DefaultTableModel) view.getTableListaPedido().getModel();
     tableModel.setNumRows(0);
        
        //preencher a lista preenchendo o table model
        for (ListaPedido listapedido : listapedidos) {
           tableModel.addRow(new Object[]{
               
               listapedido.getId(),
               listapedido.getCliente().getNome(),
               listapedido.getPedido().getDescricao(),
               listapedido.getValor(),
               listapedido.getDataFormatada(),
               listapedido.getHoraFormatada(),
               listapedido.getObservacao()
            
           });
           
        }
    }  

    public void preencherClientes(ArrayList<Cliente> clientes) {
      DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getJComboBoxCliente().getModel();
      
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente);
            
        }
        
    }

    public void preencherPedidos(ArrayList<Pedido> pedidos) {
       DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getJComboBoxPedido().getModel();
       
        for (Pedido pedido : pedidos) {
            comboBoxModel.addElement(pedido);
            
        }
     
    }

    public Cliente obterCliente() {
       return (Cliente) view.getJComboBoxCliente().getSelectedItem();
    }
    public Pedido obterPedido() {
       return (Pedido) view.getJComboBoxPedido().getSelectedItem();
    }

    public void setarValor(float valor) {
     view.getTextValor().setText(valor+"");
    }

    @Override
    public  ListaPedido obterModelo() {
        
       String idString = view.getTextId().getText();
       int id = Integer.parseInt(idString);
       Cliente cliente = obterCliente();
       Pedido pedido = obterPedido();
       String valorString = view.getTextValor().getText();
       float valor = Float.parseFloat(valorString);
       String data = view.getTextFormatedData().getText();
       String hora = view.getTextFormatedHora().getText();
       String dataHora = data +" "+ hora;
       String observacao = view.getTextObservacao().getText();
       
       ListaPedido listapedido = new ListaPedido(id, cliente, pedido, valor, dataHora, observacao);
       return listapedido;
       //new ListaPedido();
    }

    @Override
    public void limparTela() {
       view.getTextId().setText("");
       view.getTextFormatedData().setText("");
       view.getTextFormatedHora().setText("");
       view.getTextObservacao().setText("");
       
    }
    
    
}
