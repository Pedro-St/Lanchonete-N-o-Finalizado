package app;

import java.util.Scanner;

import entities.Lanchonete;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Double total = 0.0;

		System.out.println("Codigos ---- Especificação ----  Preço "
				+ "\n 1          Cachorro quente      R$ 4,00"
				+ "\n 2             X-Salada          R$ 4,50" 
				+ "\n 3             X-Bacon           R$ 5,00"
				+ "\n 4          Torrada Simples      R$ 2,00" 
				+ "\n 5           Refrigerante        R$ 1,50");
		System.out.println("  -------------------------------------");
		int code = 0;
		int quant = 0;

		System.out.print("Quantos pedidos vão ser: ");
		int n = sc.nextInt();
		Lanchonete lanche = new Lanchonete(code, quant, total);

		for (int i = 0; i < n; i++) {

			System.out.print("Digite o codigo: ");
			code = sc.nextInt();

			System.out.print("Digite a quantidade: ");
			quant = sc.nextInt();

			if (code == 1) {
				total = quant * 4.00;
			}

			else if (code == 2) {
				total = quant * 4.50;
			}

			else if (code == 3) {
				total = quant * 5.00;
			}

			else if (code == 4) {
				total = quant * 2.00;
			}
			if (code == 5) {
				total = quant * 1.50;
			}
			System.out.println();

			System.out.println("Valor total: $" + lanche.totalfinal(total));
		}
		
			
		
		sc.close();

	}

}
