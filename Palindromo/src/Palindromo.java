import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a palavra: ");
        String palavra = scanner.nextLine();

        String reverse = "";

        for (int i = (palavra.length() - 1); i >= 0; i--){
            reverse = reverse + palavra.charAt(i);
        }

        if(reverse.toLowerCase().equals(palavra.toLowerCase())){
            System.out.println("É Palíndromo.");
        } else{
            System.out.println("Não é um Palíndromo.");
        }
    }
}
