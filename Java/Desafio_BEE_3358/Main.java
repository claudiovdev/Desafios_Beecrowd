package Desafio_BEE_3358;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int contadorConsoantes = 0;
        int maiorNumeroConstoantes = 0;


        for(int i = 0; i < n; i++){
            String nome = in.next();

            for(char c: nome.toCharArray()){
                if(Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) == 'i' || Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'u'){
                    contadorConsoantes = 0;
                }else{
                    contadorConsoantes = contadorConsoantes +1;
                    if(contadorConsoantes > maiorNumeroConstoantes){
                        maiorNumeroConstoantes = maiorNumeroConstoantes + 1;
                    }
                }

            }            if (maiorNumeroConstoantes >= 3){
                System.out.println(nome + " nao eh facil");
            }else{
                System.out.println(nome + "eh facil");
            }
            maiorNumeroConstoantes = 0;

        }

        in.close();
    }
}
