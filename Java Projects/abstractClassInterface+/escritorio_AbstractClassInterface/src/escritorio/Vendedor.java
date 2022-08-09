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
public class Vendedor extends Funcionario{
    private double comissao;
    
    public Vendedor(String nome, String mat, double salBase, double comissao){
        super(nome, mat, salBase);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }
        
    @Override
    public double calcSal(){
        return (this.getSalBase() + getComissao());
    }
}
