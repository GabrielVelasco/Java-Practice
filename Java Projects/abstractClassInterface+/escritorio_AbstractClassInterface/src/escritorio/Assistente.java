/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritorio;

/**
 *
 * @author facom
 */
public class Assistente extends Funcionario {
    public Assistente(String nome, String mat, double salBase){
        super(nome, mat, salBase);
    }
    
    @Override
    public double calcSal(){
        return this.getSalBase();
    }
}
