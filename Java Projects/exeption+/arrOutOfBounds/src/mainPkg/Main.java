// outras ideias:
// arr como variavel da classe p/ agrupar comando do try/catch em funcao
//

package mainPkg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static int[] arr = new int[5];
    static Scanner sc = new Scanner(System.in);

    static void doThings() throws ArrayIndexOutOfBoundsException, InputMismatchException, Exception{
        int valor, pos;
        System.out.println("Digite valor: "); valor = sc.nextInt(); // if error, "returns" Exception...
        System.out.println("Digite pos: "); pos = sc.nextInt();
        if(pos == -1)
            throw new Exception("pos -1, saindo...");

        arr[pos] = valor;

        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args){

        while (true){
            try{
                doThings();

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Out of bounds");
            }catch (InputMismatchException e){
                System.out.println("Input missmatch!"); sc.next();
            }catch (Exception e){
                System.out.println(e.getMessage());
                break;
            }
        }

    }

}
