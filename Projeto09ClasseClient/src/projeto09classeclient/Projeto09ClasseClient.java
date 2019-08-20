/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto09classeclient;

/**
 *
 * @author aluno
 */
public class Projeto09ClasseClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //um objeto c1 do tipo classe clente
        //sendo instanciado por meio do operador new
        //que chama o metodo construtor cliente()
        Cliente C1 = new Cliente("1122","Moraes","8877-04","Lin","SP");
        C1.setRG("55661");
        System.out.println(C1.getRG());//metodo
    }
    
}
