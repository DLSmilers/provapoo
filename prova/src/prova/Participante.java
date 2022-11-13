package prova;
import java.util.Scanner;

public class Participante {
	Scanner ler_teclado = new Scanner(System.in);
	String cpf;
	String nome;
	String data_nascimento;
	String titu_acad;
	String inst_vin;
	String senha;
	
	public void getDados() {
		System.out.println("Digite o CPF:");
		System.out.println("Digite o nome:");
		System.out.println("Digite a Data de Nascimento:");
		System.out.println("Digite a Titulação acadêmica:");
		System.out.println("Digite a Instituição de Vínculo:");
		System.out.println("Digite a senha:");
		
	}
	
	
}
