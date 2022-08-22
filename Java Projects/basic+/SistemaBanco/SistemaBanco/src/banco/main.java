package banco;

import java.util.Scanner;

public class main {
//    static int test; // class atribute
    
    static Cliente[] clientes = new Cliente[10];
    
    static Cliente logar(Scanner sc) {
        System.out.print("Usuario: ");
        String usr = sc.nextLine();
        System.out.print("Senha: ");
        String sen = sc.nextLine();
        for (int i=0;i<Cliente.ct;i++)
            if ((clientes[i].getUsr().equals(usr))&&(clientes[i].getSen().equals(sen)))
                return clientes[i];
        return null;
    }
    
    static Conta buscaConta(int num) {
        for (int i=0;i<Cliente.ct;i++)
            if (clientes[i].getConta().getNum() == num)
                return clientes[i].getConta();
        return null;
    }
    
    // clientes negativados
    static boolean retornaNeg(){
        boolean found = false;
        for(int i = 0; i < Cliente.ct; i++){
            if(clientes[i].getConta().ehNegativo()){
                found = true;
                System.out.println("Num conta: "+clientes[i].getConta().getNum());
                System.out.println("Nome: "+clientes[i].getNome());
                System.out.println("Safado ta devendo: "+clientes[i].getConta().getSaldo());
            }
        }
        
        return found;
    }
    
    static boolean rangeAge(int ini, int f){
        boolean found = false;
        for(int i = 0; i < Cliente.ct; i++){
            if(clientes[i].getIdade() >= ini && clientes[i].getIdade() <= f){
                found = true;
                System.out.println("Num conta: "+clientes[i].getConta().getNum());
                System.out.println("Nome: "+clientes[i].getNome());
                System.out.println("Safado tem idade: "+clientes[i].getIdade());
            }
        }
        
        return found;
    }
    
    static void cleanBuffer(Scanner sc){
        sc.nextLine();
    }
    
    public static void main(String a[]) {
        int op = -1;
        Scanner sc = new Scanner(System.in);
        
        while (op != 7) {
            System.out.println("=== MENU ===");
            System.out.println("0 - Devedores");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Saldo");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("5 - Transferir");
            System.out.println("6 - Relatorio");
            System.out.println("7 - Sair");
            op = sc.nextInt();
            cleanBuffer(sc);
            String tipo;
            float saldo;
            String nome, CPF, telefone;
            int idade;
            String usr,sen;
            Cliente c;
            
            switch(op) {
                case 0:
                    if(!retornaNeg()){
                        System.out.println("Ninguem devendo o agiota");
                    }
                    break;
                case 1:
                    System.out.print("Tipo da Conta: "); tipo = sc.nextLine();
                    System.out.print("Saldo inicial: "); saldo = sc.nextFloat();                   
                    System.out.print("Nome: "); cleanBuffer(sc); nome = sc.nextLine();
                    System.out.print("CPF: "); CPF = sc.nextLine();
                    System.out.print("Telefone: "); telefone = sc.nextLine();
                    System.out.print("Idade: "); idade = sc.nextInt();
                    System.out.print("Usuario: "); cleanBuffer(sc); usr = sc.nextLine();
                    System.out.print("Senha: "); sen = sc.nextLine();
                    
                    Conta c1 = new Conta();
                    c1.cadastraConta(tipo, saldo);
                    
                    Cliente cli1 = new Cliente();
                    cli1.cadastraCliente(nome, CPF, telefone, idade, usr, sen, c1);
                    
                    clientes[Cliente.ct-1] = cli1; // add no array
                    
                    break;
                    
                case 2:
                    c = logar(sc);
                    if (c != null) {
                        System.out.println(c.getConta().mostraSaldo());
                    }else
                        System.out.println("Acesso negado.");
                    break;
                    
                case 3:
                    c = logar(sc);
                    if (c != null) {
                        System.out.print("Valor: ");
                        Float valor = sc.nextFloat();
                        if (c.getConta().sacar(valor))
                            System.out.println("Saque realizado com sucesso.");
                        else
                            System.out.println("Erro ao realizar o saque.");
                    }
                    break;
                case 4:
                    c = logar(sc);
                    if (c != null) {
                        System.out.print("Valor: ");
                        Float valor = sc.nextFloat();
                        if (c.getConta().depositar(valor))
                            System.out.println("Deposito realizado com sucesso.");
                        else
                            System.out.println("Erro ao realizar o saque.");
                    }
                    break;
                    
                case 5:
                    c = logar(sc);
                    if (c != null) {
                        System.out.print("Num conta destino: ");
                        int n = sc.nextInt();
                        System.out.print("Valor: ");
                        Float valor = sc.nextFloat();
                        Conta temp = buscaConta(n);
                        if (temp != null)
                            c.getConta().transferir(valor,temp);
                        else
                            System.out.println("Conta destino inexistente!");
                    }
                    break;
                    
                case 6:
                    for (int i=0;i<Cliente.ct;i++) {
                        System.out.print(clientes[i].getConta().getNum()+" ");
                        System.out.print(clientes[i].getNome()+" ");
                        System.out.println(clientes[i].getConta().getSaldo());
                    }
                     
                case 8:
                    int ini = sc.nextInt(), fim = sc.nextInt();
                    
                    if(!rangeAge(ini, fim))
                        System.out.println("N tem cliente nesse intervalo!");
                    break;
            }
        }
    }
}