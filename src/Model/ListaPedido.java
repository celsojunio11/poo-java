
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

//Associacao

public class ListaPedido {
    private int id;
    private Cliente cliente;
    private Pedido pedido;
    private float valor;
    private Date data;
    private String observacao;
    
//polimorfismo
    
    public ListaPedido(int id, Cliente cliente, Pedido pedido, float valor, String data) {
        this.id = id;
        this.cliente = cliente;
        this.pedido = pedido;
        this.valor = valor;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
                    } catch (ParseException ex) {
            Logger.getLogger(ListaPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ListaPedido(int id, Cliente cliente, Pedido pedido, float valor, String data, String observacao) {
        
        this(id,cliente,pedido,valor,data);
        this.observacao = observacao;
        
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }
    
    public String getDataFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
    }
    
     public String getHoraFormatada(){
        return new SimpleDateFormat("HH:mm").format(data);
    }
     
    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void getTableListaPedido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
