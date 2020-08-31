package tarefa;

import java.util.Scanner;

public class Teste {
	
	Scanner scan = new Scanner(System.in);
	
	void inserirNaAgenda() {
		
	}
	
	void consultarAgenda() {
		
	}
	
	void excluirDaAgenda() {
		
	}
	
	void listarAgenda() {
		
	}
	
	void sair() {
		
	}

	public static void main(String[] args) {
		Agenda[] agenda = new Agenda[10];
		
		while(true) {
			System.out.println("1 — Inserir na agenda");
			System.out.println("2 — Consultar agenda");
			System.out.println("3 — Excluir da agenda");
			System.out.println("4 — Listar a agenda");
			System.out.println("0 — Sair");
			
			System.out.println("Digite o dígito de uma opção e então ENTER");
			
			Scanner scan = new Scanner(System.in);
			
			switch (scan.nextInt()) {
			case 1:
				System.out.println("Opção 1!");
				break;
			case 2:
				System.out.println("Opção 2!");
				break;
			case 3:
				System.out.println("Opção 3!");
				break;
			case 4:
				System.out.println("Opção 4!");
				break;
			case 0:
				System.out.println("Obrigado por sair!");
			default:
				System.out.println("Por favor, insira algo válido!");
				break;
			}
			
			
			
		}
		
		
		
		

	}

}