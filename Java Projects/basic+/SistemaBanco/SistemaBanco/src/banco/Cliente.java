package banco;

public class Cliente {
    static int ct = 0;
    private String nome, CPF, telefone,usr,sen;
    private int idade;
    private Conta conta;
    
    void cadastraCliente(String n, String cpf, String t, int i, String u, String s, Conta c) {
        nome = n;
        CPF = cpf;
        telefone = t;
        idade = i;
        usr = u;
        sen = s;
        conta = c;
        ct++;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getUsr() {
        return usr;
    }

    public String getSen() {
        return sen;
    }

    public int getIdade() {
        return idade;
    }

    public Conta getConta() {
        return conta;
    }
}