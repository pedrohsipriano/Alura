
import java.util.Scanner;

class exercicios01 {
    public static void main(String[] args) throws Exception {
        //Cria um objeto Scanner
        Scanner scanner = new Scanner(System.in);

        double nota1 = 8.9;
        double nota2 = 7.5;
        double media = (nota1 + nota2) / 2;
        System.out.println("A media do aluno e: " + media);

        scanner.close();
    }
}

class exercicios02 {
    public static void main(String[] args) throws Exception {
        double numero= 8.9;
        int numero1 = 32;

        System.out.println((int) numero);
        System.out.println((double) numero1);
    }
    
}

class exercicios03 {
    public static void main(String[] args) throws Exception {
        char letra = 'p';
        String frase = "meu nome comeca coma a letra ";
        System.out.println(frase + letra);
    }
}