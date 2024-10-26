import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Exercício 08 Condicional
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//    
//		double salario = sc.nextDouble();
//  	double imposto;
//    
//		if (salario <= 2000.00) {
//			System.out.println("Isento");
//		}
//		else if (salario <= 3000.00) {
//			double imposto = (salario - 2000.00) * 0.08;
//			System.out.printf("R$ %.2f%n", imposto);
//		}
//		else if (salario <= 4500.00) {
//			double imposto = (1000.00 * 0.08) + ((salario - 3000.00) * 0.18);
//			System.out.printf("R$ %.2f%n", imposto);
//		}
//		else {
//			double imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + ((salario - 4500.00) * 0.28);
//			System.out.printf("R$ %.2f%n", imposto);
//		}
//    
//		sc.close();
	
	
	// Exercício 07 Condicional
//	Locale.setDefault(Locale.US);
//	Scanner sc = new Scanner(System.in);	
//	
//	double x = sc.nextDouble();
//	double y = sc.nextDouble();
//	
//	
//	if (x == 0.0 && y == 0.0) {
//		System.out.println("ORIGEM");		
//	}
//	else if (x == 0.0) {
//		System.out.println("Eixo Y");
//	}
//	else if (y == 0.0) {
//		System.out.println("Eixo X");
//	}
//	else if (x > 0.0 && y > 0.0) {
//		System.out.println("Q1");
//	}
//	else if (x < 0.0 && y > 0.0 ) {
//		System.out.println("Q2");		
//	}
//	else if (x < 0.0 && y < 0.0) {
//		System.out.println("Q3");		
//	}
//	else {
//		System.out.println("Q4");		
//	}
//	
//	
//	sc.close();
	
	
		// Exercício 06 Condicional
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//
//		double numero = sc.nextDouble();
//		
//		if (numero < 0.0 || numero > 100.0) {
//			System.out.println("Fora de intervalo");
//		}
//		else if (numero <= 25.0) {
//			System.out.println("Intervalo [0,25]");
//		}
//		else if (numero <= 50.0) {
//			System.out.println("Intervalo (25,50]");
//		}
//		else if (numero <= 75.0) {
//			System.out.println("Intervalo (50,75]");
//		}		
//		else {
//			System.out.println("Intervalo (75,100]");
//		}
//		
//		sc.close();
		
		
		// Exercício 05 Condicional
//		Scanner sc = new Scanner(System.in);	
//		
//		int codigo = sc.nextInt();
//		int quantidade = sc.nextInt();
//		
//		double total = 0.0;
//		boolean validCode = true;
//		
//		if (codigo == 1) {
//				total = quantidade * 4.00;			
//		}
//		else if (codigo == 2) {
//				total = quantidade * 4.50;
//		}
//		else if (codigo == 3) {
//				total = quantidade * 5.00;
//		}
//		else if (codigo == 4) {
//				total = quantidade * 2.00;
//		}
//		else if (codigo == 5) {
//				total = quantidade * 1.50;
//		}
//		else {
//			validCode = false;
//			System.out.println("DIGITE O CÓDIGO CORRETO...");
//		}
//		if (validCode) {
//		System.out.printf("TOTAL: R$ %.2f%n", total);
//		}	
//		
//		sc.close();
		
		// Exercício 04 Condicional
//	Scanner sc = new Scanner(System.in);	
//	
//	int horaInicial = sc.nextInt();
//	int horaFinal = sc.nextInt();	
//	
//	
//	
//	if(horaInicial < horaFinal) {
//		
//		System.out.println("O JOGO DUROU " + (horaFinal - horaInicial) + " HORA(S)");
//	}
//	else {
//		
//		int horaJogo = (24 - horaInicial) + horaFinal;
//	
//		System.out.println("O JOGO DUROU " + horaJogo + " HORA(S)");
//	}
//	sc.close();
	
	
		
		// Exercício 03 Condicional
//	Scanner sc = new Scanner(System.in);
//		
//	int A = sc.nextInt();
//	int B = sc.nextInt();
//	
//	if(A % B == 0 || B % A == 0) {
//		
//		System.out.println("SÂO MULTIPLOS");
//	}
//	else {
//		System.out.println("NÂO SÂO MULTIPLOS");
//	}
//	
//	sc.close();

		
		// Exercício 02 Condicional
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		
//		if(N % 2 == 0) {
//			
//			System.out.println("PAR");
//		}
//		else {
//			
//			System.out.println("IMPAR");
//		}
//		
//		sc.close();
		
	
		// Exercício 01 Condicional 
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//			
//		if(N < 0) {
//			
//			System.out.println("NEGATIVO");			
//		}
//		else {
//			System.out.println("NÂO NEGATIVO");
//		}
//			
//		
//		
//		sc.close();
		
//		 Exercício 06
		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		double A = sc.nextDouble();
//		double B = sc.nextDouble();
//		double C = sc.nextDouble();
//		double pi = 3.14159;
//		
//		double areaTriangulo = A * C / 2.0;
//		double areaCirculo = pi * C * C;
//		double areaTrapezio = (A + B) / 2.0 * C;
//		double areaQuadrado = B * B;
//		double areaRetangulo = A * B;
//		
//		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
//		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
//		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
//		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
//		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
//		sc.close();
		
//		 Exercício 05
		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		int codigoP1 = sc.nextInt();
//		int quantidadeP1 = sc.nextInt();
//		double valorP1 = sc.nextDouble();
//		int codigoP2 = sc.nextInt();
//		int quantidadeP2 = sc.nextInt();
//		double valorP2 = sc.nextDouble();
//		
//		double valorTotal = quantidadeP1 * valorP1 + quantidadeP2 * valorP2; 
//		
//		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
//		sc.close();		
		
		
//		Exercício 04
		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		int numeroFuncionario = sc.nextInt();
//		int horasTrabalhadas = sc.nextInt();
//		double valorHora = sc.nextDouble();
//		
//		double salario = horasTrabalhadas * valorHora;
//		
//		System.out.println("NUMBER = " + numeroFuncionario);
//		System.out.printf("SALARY = U$ %.2f%n", salario);
//		sc.close();		
		
		
//		Exercício 03
		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		int C = sc.nextInt();
//		int D = sc.nextInt();
//		int diferenca = A * B - C * D;
//		
//		System.out.println("DIFERENCA = " + diferenca);
//		sc.close();				
				
		
//		Exercício 02
		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		double raio = sc.nextDouble();
//		double pi = 3.14159;
//		double area = pi * raio * raio;
//		
//		System.out.printf("A = %.4f%n", area);
//		sc.close();
		
		
//		Exercício 01
		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
		
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		
//		int soma = x + y;
//		
//		System.out.println("SOMA = " + soma);
//		sc.close();
		
			 
//		Exercício resolvido
		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		double largura = sc.nextDouble();
//		double comprimento = sc.nextDouble();		
//		double metroQuadrado = sc.nextDouble();
//		double area = largura * comprimento;
//		double preco = metroQuadrado * area;
//		
//		System.out.printf("Area = %.2f%n", area);
//		System.out.printf("Preco = %.2f%n", preco);
//				
//		sc.close();
		
	}

}
