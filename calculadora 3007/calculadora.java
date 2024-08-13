import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class calculadora {
    //se nao imprimir o valor fica avulso
    public static int somar(int x, int y){
        return x+y;
    }
    public static int subtrair(int x, int y){
        return x-y;
    }
    public static int multiplicar(int x, int y){
        return x*y;
    }
    public static int dividir(int x, int y){
        if(y>0)
            return x/y;
        else //ja que dividir por 0 da erro deve retornar algo quando é feita uma divisão por 0
            return 0;
    }
    public static void iniciar(){
        Scanner s = new Scanner(System.in);
        System.out.println("Escolha um número para x: ");
        int x = s.nextInt();
        System.out.println("Escolha um número para y: ");
        int y = s.nextInt();

        System.out.println(somar(x,y));
        System.out.println(subtrair(x,y));
        System.out.println(multiplicar(x,y));
        System.out.println(dividir(x,y));

    }
}

