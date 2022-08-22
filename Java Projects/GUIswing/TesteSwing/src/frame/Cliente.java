package frame;

public class Cliente {
    
    private String cpf, nome, senha, email, nascimento;
    private int sexo, conta;
    private boolean noticias;
    
    public Cliente(String cpf, String nome, String senha,
                   String email, String nascimento, int sexo,
                   int conta, boolean noticias) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.conta = conta;
        this.noticias = noticias;
    }
    
//    public String toString() {
//        return cpf;
//    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public String getNascimento() {
        return nascimento;
    }

    public int getSexo() {
        return sexo;
    }

    public int getConta() {
        return conta;
    }

    public boolean isNoticias() {
        return noticias;
    }
    
}
