package lista_monitoria;

import java.util.Scanner;

public class Pratica17 {

	public static void main(String[] args) {
		/*Faça um algoritmo para ler um número que é um código de usuário. Caso este
código seja diferente de um código armazenado internamente no algoritmo (igual a 1234)
deve ser apresentada a mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve
ser lido outro valor que é a senha. Se esta senha estiver incorreta (a certa é 9999) deve ser
mostrada a mensagem ‘Acesso negado’. Caso a senha esteja correta, deve ser mostrada a
mensagem ‘Acesso permitido’.*/ 
		
		Scanner input = new Scanner(System.in); 
		//Declarando constante 
		final int COD = 1234, SENHA = 9999; 
		//Declarando variável 
		int coduser, senhauser;
		//Impressão
		System.out.println("Informe o código do usuário e  a senha do usuário: ");
		//Obter user e senha
		coduser = input.nextInt();
		senhauser = input.nextInt();
		
		//Condição se coduser for igual a COD e senhauser for igual a SENHA então, acesso permitido
		if (coduser == COD && senhauser == SENHA) {
			System.out.println("Acesso permitido");
		}
		//Condição se coduser for diferente de COD então, usuário inválido 
		else if (coduser != COD) {
			System.out.println("Usuário inválido");
		}
		//Condição se senhauser for diferente de SENHA então, acesso negado
		else if (senhauser != SENHA) {
			System.out.println("Acesso negado");
			 
			
		}

	}

}
