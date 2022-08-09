package arqPkg;

public class Funcionario {
    private final String cpf;
    private double salarioBruto;

    public Funcionario(String cpf, double salarioBruto){
        this.cpf = cpf;
        this.setSalarioBruto(salarioBruto);
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double calcSalLiquido(double valDesconto){
        return this.getSalarioBruto() - valDesconto;
    }
}
