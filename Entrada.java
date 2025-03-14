import java.util.Scanner;

public class Entrada{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

System.out.println("digite o seu nome");
String nome = scanner.nextLine();

System.err.println("digite a sua idade");
int idade = scanner.nextInt();

System.err.println("Olá" + nome + "voce tem " + idade + "anos, seja bem vinda/o");



}
}