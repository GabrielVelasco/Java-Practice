package FloatTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void entraFloat() throws InputMismatchException{
        Scanner sc = new Scanner(System.in);
        float f;

	// tirar o try/catch e testar..
        try {
            System.out.println("Digite valor: ");
            f = sc.nextFloat();
            System.out.println("Success: " + f);

        }catch (InputMismatchException e){
            throw e;
        }
    }

    public static void main(String[] args){

        int contaErrs = 0;
        while (contaErrs < 3){
            try{
                entraFloat();
                break;
            }catch (InputMismatchException e){
                System.out.println("Digite novamente: " + e.getMessage());
                contaErrs ++;
            }
        }
    }
}
