package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Student;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Digite seu nome:");
		student.nome = sc.nextLine();
		System.out.println("Digite a nota 1: ");
		student.nota1 = sc.nextDouble();
		System.out.println("Digite a nota 2: ");
		student.nota2 = sc.nextDouble();
		System.out.println("Digite a nota 3: ");
		student.nota3 = sc.nextDouble();
		
		System.out.printf("Final Grade %.2f%n", student.finalGrade());
		
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED!");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		}
		else {
			System.out.println("PASS!");
		}
		
		sc.close();

	}

}
