package lista_monitoria;

import java.util.Scanner;

public class Pratica17 {

	public static void main(String[] args) {
		/*Fa�a um algoritmo para ler um n�mero que � um c�digo de usu�rio. Caso este
c�digo seja diferente de um c�digo armazenado internamente no algoritmo (igual a 1234)
deve ser apresentada a mensagem �Usu�rio inv�lido!�. Caso o C�digo seja correto, deve
ser lido outro valor que � a senha. Se esta senha estiver incorreta (a certa � 9999) deve ser
mostrada a mensagem �Acesso negado�. Caso a senha esteja correta, deve ser mostrada a
mensagem �Acesso permitido�.*/ 
		
		Scanner input = new Scanner(System.in); 
		//Declarando constante 
		final int COD = 1234, SENHA = 9999; 
		//Declarando vari�vel 
		int coduser, senhauser;
		//Impress�o
		System.out.println("Informe o c�digo do usu�rio e  a senha do usu�rio: ");
		//Obter user e senha
		coduser = input.nextInt();
		senhauser = input.nextInt();
		
		//Condi��o se coduser for igual a COD e senhauser for igual a SENHA ent�o, acesso permitido
		if (coduser == COD && senhauser == SENHA) {
			System.out.println("Acesso permitido");
		}
		//Condi��o se coduser for diferente de COD ent�o, usu�rio inv�lido 
		else if (coduser != COD) {
			System.out.println("Usu�rio inv�lido");
		}
		//Condi��o se senhauser for diferente de SENHA ent�o, acesso negado
		else if (senhauser != SENHA) {
			System.out.println("Acesso negado");
			 
			
		}

	}

}
