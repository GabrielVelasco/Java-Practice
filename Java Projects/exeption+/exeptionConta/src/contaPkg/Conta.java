// organizar funcoes que estao abertas

package contaPkg;

public class Conta {
    private String nome;
    private int numero;
    private double saldo;

    public Conta(String nome, int numero, double saldo) throws Exception{
        setNome(nome);
        setNumero(numero);
        setSaldo(saldo);
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setNome(String nome) throws Exception{
        if(nome.length() > 0)
            this.nome = nome;
        else
            throw new Exception("Nome invalido!");
    }

    private void setNumero(int numero) throws Exception{
        if(numero > 0)
            this.numero = numero;
        else
            throw new Exception("Numero da conta invalido!");
    }

    private void setSaldo(double saldo) throws Exception{
        if(saldo >= 0)
            this.saldo = saldo;
        else
            throw new Exception("Saldo invalido para criacao da conta");
    }

    // other methods
    private void setNovoSaldo(double valorSaque){
        double novoSaldo = this.getSaldo() - valorSaque;
        try {
            this.setSaldo(novoSaldo);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private boolean ehPossivelSacar(double valorSaque){
        return valorSaque <= this.getSaldo();
    }

    public void sacar(double valorSaque) throws Exception {
        if(ehPossivelSacar(valorSaque))
            setNovoSaldo(valorSaque);
        else
            throw new Exception("Valor de saque maior que saldo!");
    }

    private boolean ehPossivelDepositar(double valorDeposito) {
        return valorDeposito > 0;
    }

    private void depositarAction(double valorDeposito){
        double novoSaldo = this.getSaldo() + valorDeposito;
        try {
            this.setSaldo(novoSaldo);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void depositar(double valorDeposito) throws Exception {
        if(ehPossivelDepositar(valorDeposito)){
            depositarAction(valorDeposito);
        }else
            throw new Exception("Valor de deposito tem que ser maior que zero.");
    }
}
