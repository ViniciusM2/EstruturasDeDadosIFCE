package tarefa;

import java.util.Scanner;

public class Teste {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Agenda[] agenda = new Agenda[10];
		
		while(true) {
			System.out.println("1 — Inserir na agenda");
			System.out.println("2 — Consultar agenda");
			System.out.println("3 — Excluir da agenda");
			System.out.println("4 — Listar a agenda");
			System.out.println("0 — Sair");
			
			System.out.println("Digite um número");
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println(scan.next());
			
			
			
		}

	}

}