package contaPkg;

public class ContaMain {
    public static void main(String[] args){
        Conta[] arrContas = new Conta[5];

        try{
            for(int i = 0; i < arrContas.length; i++)
                arrContas[i] = new Conta("conta "+String.valueOf(i), i+1, i*2);

            for(Conta c: arrContas){
                if(c != null){
                    System.out.println(c.getNome() + ", " + c.getNumero() + ", " + c.getSaldo());
                }
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try{
            arrContas[0].depositar(100);
            arrContas[0].sacar(50);
            arrContas[4].depositar(10000);
            arrContas[4].sacar(10000);
            arrContas[4].sacar(50);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        for(Conta c: arrContas){
            if(c != null){
                System.out.println(c.getNome() + ", " + c.getNumero() + ", " + c.getSaldo());
            }
        }
    }
}
