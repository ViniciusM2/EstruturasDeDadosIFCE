package tarefa;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Agenda[] agenda = new Agenda[10];

		Helper.mostrarMenu();
		Scanner scan = new Scanner(System.in);
		String op = scan.next();
		while (op != "9") {
			Helper.clear();
			switch (op) {
			case "1":
				Agenda contato1 = new Agenda();

				System.out.println("Inserir contato:\n\n");

				System.out.println("Nome: ");

				contato1.setNome(scan.next());

				System.out.println("Telefone: ");

				contato1.setTelefone(scan.next());

				System.out.println("Email: ");

				contato1.setEmail(scan.next());

				for (int i = 0; i < agenda.length; i++) {
					if (agenda[i] == null) {
						agenda[i] = contato1;
						break;
					}
				}

				break;
			case "2":
				System.out.println("Consultar na agenda:\n");

				System.out.println("Nome :");

				String nome2 = scan.next();

				Agenda contato2 = null;

				System.out.println();

				for (int i = 0; i < agenda.length; i++) {
					if (agenda[i] != null) {
						if (agenda[i].getNome().equals(nome2)) {
							contato2 = agenda[i];
							break;
						}
					}

				}

				if (contato2 != null) {
					System.out.println(contato2);
				} else {
					System.out.println("Contato não cadastrado");
				}

				break;
			case "3":
				System.out.println("Excluir da agenda:\n");
				System.out.println("Nome:");
				String nome3 = scan.next();

				Agenda contato3 = new Agenda();
				int posicao = 0;

				System.out.println();

				for (int i = 0; i < agenda.length; i++) {
					if (agenda[i] != null) {
						if (agenda[i].getNome().equals(nome3)) {
							contato3 = agenda[i];
							posicao = i;
							break;
						}
					}
				}

				if (contato3 != null) {
					System.out.println(contato3);
					System.out.println();
					for (int i = posicao; i < agenda.length - 1; i++) {
						agenda[i] = agenda[i + 1];
					}
					System.out.println("O contato foi excluído. \n\n");
				} else {
					System.out.println("Contato não cadastrado.\n\n");
				}
				break;
			case "4":
				for (int i = 0; i < agenda.length; i++) {
					if (agenda[i] != null) {
						System.out.println(agenda[i]);
					}
				}
				break;
			case "9":
				System.exit(0);
			default:
				System.out.println("Opção inválida!\n\n");
				break;
			}
			System.out.println("\n\n");
			System.out.println("[Enter] - Menu Principal\n\n");

			try {
				System.in.read();
			} catch (IOException e) {

				e.printStackTrace();
			}
			Helper.clear();
			Helper.mostrarMenu();
			// System.out.println("pegando op");
			op = scan.next();

		}

		scan.close();

	}

}

class Agenda {

	private String telefone;
	private String email;
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {

		return "Dados:\n\n\n" + "Nome:" + nome + "\n\n\n" + "Telefone:" + telefone + "\n\n\n" + "Email:" + email
				+ "\n\n\n" + "==========================================\n\n\n";
	}

}

class Helper {
	static void mostrarMenu() {
		System.out.println("1 - Inserir na agenda");
		System.out.println("2 - Consultar na agenda");
		System.out.println("3 - Excluir da agenda");
		System.out.println("4 - Listar a genda");
		System.out.println("9 - Sair\n\n");
	}

	static void clear() {
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}
	}

}
