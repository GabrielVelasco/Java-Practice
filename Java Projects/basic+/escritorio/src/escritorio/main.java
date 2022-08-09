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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario[] fArr = new Funcionario[5];
        
        fArr[0] = new Gerente("Joao Gay", "11921", 100);
        fArr[1] = new Assistente("Kaio Gay", "11922", 100);
        fArr[2] = new Gerente("Joao Lindo", "11921", 100);
        
        double totalSal = 0;
        for(Funcionario funcionario: fArr){
            if (funcionario != null)
                totalSal += funcionario.calcSal();
            else
                break;
        }
    
        System.out.println(totalSal);
    }
    
}
