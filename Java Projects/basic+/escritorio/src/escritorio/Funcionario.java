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
public abstract class Funcionario {
    private String nome, mat;
    private double salBase;
    
    public Funcionario(String nome, String mat, double salBase){
        this.nome = nome;
        this.mat = mat;
        this.salBase = salBase;
    }

    public String getNome() {
        return nome;
    }

    public String getMat() {
        return mat;
    }

    public double getSalBase() {
        return salBase;
    }
    
    public abstract double calcSal();
}
