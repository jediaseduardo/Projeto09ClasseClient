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
public class Cliente {
    //Atributos que podem ser privados ou public (modificador)
    //Por definição no Java os atributos sempre serão PRIVADOS
    //atributos
    private String RG;
    private String NOME;
    private String CPF;
    private String CIDADE;
    private String ESTADO;
    
    //Metodos podem ser public ou privados (modificador)
    //Por definição no Java os metodos sempre serão PUBLIC
    //construtores 
    //vazio
    public Cliente(){
        
    }
    //cheio
    //parametros
    public Cliente(String RG, String NOME, String CPF, String CIDADE, String ESTADO){
        this.RG = RG;
        this.NOME = NOME;
        this.CPF = CPF;
        this.ESTADO = ESTADO;
        this.CIDADE = CIDADE; 
        
        //this acessa o atributo que recebe o parametro
    }
            
    //GETTERS // recupersar valor
    //SETTERS // atribuir valor
    
    public String getRG(){
        return this.RG;
    }
    public void setRG(String RG){
        this.RG = RG;
    }
     public String getNOME(){
        return this.NOME;
    }
    public void setNOME(String NOME){
        this.NOME = NOME;
    }
       public String getCPF(){
        return this.CPF;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
      public String getCIDADE(){
        return this.CIDADE;
    }
    public void setcidade(String CPF){
        this.CIDADE = CIDADE;
    }   
     public String getESTADO(){
        return this.ESTADO;
    }
    public void setestado(String CPF){
        this.ESTADO = ESTADO;
    }   
}
