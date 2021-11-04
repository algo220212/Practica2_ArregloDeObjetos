/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import Modelo.Tarjeta;
import Modelo.Usuario;
import Modelo.UsuarioArreglo;

/**
 *
 * @author OCA-UIE
 */
public class App {
    
    public static  void main (String[] args){
        Tarjeta t1, t2,t3;
        Usuario usuario;
        UsuarioArreglo usuarios;
        usuario = new Usuario("Díaz", "Perez", "Jose", "9080706050", "DNI");
        usuarios = new UsuarioArreglo();
        usuarios.agregar(usuario);
        usuario = new Usuario("Rios", "Rodrigez", "Francisco","1020304050","DNI");
        usuarios.agregar(usuario);
        usuario = new Usuario("Casas", "Perez", "Carlos","1020304050","DNI");
        usuarios.agregar(usuario);
        
        usuarios.getUsuario("20304587").recargar(100.0f);
        
        System.out.println(usuarios);
        
        /*
        t1 = new Tarjeta();
        t2 = new Tarjeta(true);
        t3 = new Tarjeta(20.0f, 2.5f);
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    
        System.out.println("Consumir T1 "+ t1.consumir());
        System.out.println("Consumir T2 "+ t2.consumir());
        System.out.println("Consumir T3 "+ t3.consumir());

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
*/        
    }
    
   
}
