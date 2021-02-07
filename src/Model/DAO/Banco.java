/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.ListaPedido;
import Model.Cliente;
import Model.Pedido;
import Model.Usuario;
import java.util.ArrayList;

/**
 *
 *
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Pedido> pedido;
    public static ArrayList<ListaPedido> listapedido;
    
    /**
     *
     */
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        pedido = new ArrayList<Pedido>();
        listapedido = new ArrayList<ListaPedido>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "chef", 'M', "09/05/1996", "30212121", "chef@.com", "521454123", "chef", "administrador");
        Usuario usuario2 = new Usuario(2, "funcionario", 'M', "09/05/1996", "30212122", "funcionario@.com", "451244123", "funcionario", "funcionario");
         
        Cliente cliente1 = new Cliente(1, "Alan Figueiredo", 'M', "30/01/1995", "30212126", "tiagoluz.h607@gmail.com", "5142487", "Rua jaboti 35 Canudos NH",  "93300012");
        Cliente cliente2 = new Cliente(2, "Judite Oliveira", 'F', "30/08/1994", "30212127", "juditeoliveirapet@gmail.com", "5142487745", "Rua campo bom 78 Centro NH",  "93300045");
        Cliente cliente3 = new Cliente(3, "Paulo Ricado", 'M', "24/04/1997", "30212128", "pauloricardopet@gmail.com", "78451458", "Rua Tres Irmaos 30 Vila Nova - NH",  "933007496");
        Cliente cliente4 = new Cliente(4, "Neymar Santos", 'M', "20/08/1995", "30212130", "neymarsantospet@gmail.com", "2745487", "Rua Lombardi 40 Canudos NH",  "93300748");
        Cliente cliente5 = new Cliente(5, "Debruine Pipoqueiro", 'M', "13/09/1992", "30212131", "debruinepet@gmail.com", "4742487", "Rua pedro quaresma 784 Canudos Belgica",  "933000847");
        Cliente cliente6 = new Cliente(6, "Matuidi Pareira", 'M', "17/08/1994", "302122324", "matuidipet@gmail.com", "78512457", "Rua champions 10 Kephas Franca",  "933000782");
        Cliente cliente7 = new Cliente(7, "Marta de Souza", 'F', "25/03/1993", "302121292", "martasouzapet@gmail.com", "4658237314", "Rua tesla 215 Canudos NH",  "93352012");
        Cliente cliente9 = new Cliente(9, "Samuel Coltinho", 'M', "09/02/1998", "302121189", "samuelcoltinhopet@gmail.com", "74595142487", "Rua floresta 12 Canudos NH",  "9330046364");
        Cliente cliente10 = new Cliente(10, "Felipe Luis", 'M', "12/06/1999", "3021212478", "felipeluispet@gmail.com", "845713647", "Rua marechal 1023 Canudos NH",  "933000874");
        
        Pedido pedido1 = new Pedido(1, "Coca", 18);
        Pedido pedido2 = new Pedido(2, "arroz", 30);
        Pedido pedido3 = new Pedido(3, "feijao", 15);
        Pedido pedido4 = new Pedido(4, "carne", 25);
        Pedido pedido5 = new Pedido(5, "cerveja", 10);
        Pedido pedido6 = new Pedido(6, "pizza", 3);

        ListaPedido listapedido1 = new ListaPedido(1, cliente1, pedido2, 30, "15/07/2018 09:30");
        ListaPedido listapedido2 = new ListaPedido(2, cliente3, pedido4, 40, "14/07/2018 10:00");
        ListaPedido listapedido3 = new ListaPedido(3, cliente4, pedido1, 18, "14/07/2018 10:30");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);
        
        cliente.add(cliente9);
        cliente.add(cliente10);
        
        pedido.add( pedido1);
        pedido.add( pedido2);
        pedido.add( pedido3);
        pedido.add( pedido4);
        pedido.add( pedido5);
        pedido.add( pedido6);
        
        listapedido.add(listapedido1);
        listapedido.add(listapedido2);
        listapedido.add(listapedido3);
        
    }
    
    
}
