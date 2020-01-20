package yan;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		double X, Y, Z = 0;
		char OP;
		
		
		X = sc.nextDouble();
		OP = sc.next().charAt(0);
		Y = sc.nextDouble();
		
		//------------ se for String----------
		
		// if(OP.equals("+"){
		
		//TODO
		
	//}
		
		//------------------------------------------
		
//		if (OP == '+') {
//			Z = X + Y;
//			System.out.println(Z);
//		} else if (OP == '-') {
//			Z = X - Y;
//			System.out.println(Z);
//		} else if (OP == '*') {
//			Z = X * Y;
//			System.out.println(Z);
//		} else if (OP == '/') {
//			Z = X / Y;
//			System.out.println(Z);
//		} else {
//			System.out.println("Operacao invalida");
//		} 
		
		switch (OP) {
		case '+':
		Z = X + Y;
		System.out.println(Z);
		break;
		case '-':
		Z = X - Y;
		System.out.println(Z);
		break;
		case '*':
		Z = X * Y;
		System.out.println(Z);
		break;
		case '/':
		Z = X / Y;
		break;
		default: System.out.println("Operacao invalida");
		
		
		}
		
		
		
		
	}

}
