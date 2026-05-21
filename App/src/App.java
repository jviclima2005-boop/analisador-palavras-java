import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 1;

        while(opcao !=0){
            System.out.println("== menu ==");
            System.out.println("1 - vogais e consoantes");
            System.out.println("2 - inverter a palavra");
            System.out.println("0 - sair");
            opcao = sc.nextInt(); sc.nextLine();

            if(opcao == 1){
                String palavra = "";
                int contadorconsoante = 0;
                int contadorvogal = 0;

                System.out.println("escreva sua palavra:");
                palavra = sc.nextLine();

                palavra = palavra.toLowerCase();

                for(int i = 0; i < palavra.length();i++){
                    char letra = palavra.charAt(i);

                    if(letra == 'a' || letra == 'e' || letra =='i' || letra == 'o' || letra == 'u'){
                        contadorvogal++;
                    }else if(Character.isLetter(letra)){
                        contadorconsoante++;
                    }
                }
                System.out.println("essa palavra contém " + contadorvogal + " vogais");
                System.out.println("essa palavra contém " + contadorconsoante + " consoantes");
            }

            if(opcao == 2){
                String palavrainvertida = "";
                String invertida = "";
                System.out.println("escreva a palavra que vai ser invertida:");
                palavrainvertida = sc.nextLine();

                palavrainvertida = palavrainvertida.toLowerCase();

                for(int i = palavrainvertida.length() -1; i >=0;i--){
                    invertida+=palavrainvertida.charAt(i);
                }

                System.out.println("a palavra invertida [" + invertida + "]");
                
            }


            if(opcao == 0){
                    System.out.println("encerrando...");
            }
        }
        sc.close();
    }
}