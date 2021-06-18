import java.util.Scanner;

public class Teste {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("----Sing up----");
		System.out.println();
		System.out.println("Cadastre seu email: ");
		String email = scanner.nextLine();
		
		System.out.println("Cadastre sua senha: ");
		String senha1 = scanner.nextLine();
		
		System.out.println();
		System.out.println();
		System.out.println("-- Cadastro realizado --");
		System.out.println();
		System.out.println();
		System.out.println("Email cadastrado :" + email);
		System.out.println();
		System.out.println("Senha cadastrada :" + senha1);
	}
}