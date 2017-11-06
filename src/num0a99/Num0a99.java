package num0a99;

import java.util.Scanner;

public class Num0a99 {

	public static void main(String[] args) {
		
		String decenas = null;
		String unidades = null;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese un numero de 0 a 99");
		int num1 = sc.nextInt();

		switch (num1) {
		case 20:
			System.out.println("Veinte");
			break;
		case 30:
			System.out.println("Treinta");
			break;
		case 40:
			System.out.println("Cuarenta");
			break;
		case 50:
			System.out.println("Cincuenta");
			break;
		case 60:
			System.out.println("Sesenta");
			break;
		case 70:
			System.out.println("Setenta");
			break;
		case 80:
			System.out.println("Ochenta");
			break;
		case 90:
			System.out.println("Noventa");
			break;
		default:
			break;
		}

		int decena = num1 / 10;
		int unidad = num1 % 10;

		switch (unidad) {
		case 0:
			unidades = "Cero";
			break;
		case 1:
			unidades = "uno";
			break;
		case 2:
			unidades = "dos";
			break;
		case 3:
			unidades = "tres";
			break;
		case 4:
			unidades = "cuatro";
			break;
		case 5:
			unidades = "cinco";
			break;
		case 6:
			unidades = "seis";
			break;
		case 7:
			unidades = "siete";
			break;
		case 8:
			unidades = "ocho";
			break;
		case 9:
			unidades = "nueve";
			break;
		default:
			break;
		}
		switch (decena) {
		case 1:
			decenas = "dieci";
			break;
		case 2:
			decenas = "veinti";
			break;
		case 3:
			decenas = "treinta y ";
			break;
		case 4:
			decenas = "cuarenta y ";
			break;
		case 5:
			decenas = "cincuenta y ";
			break;
		case 6:
			decenas = "sesenta y ";
			break;
		case 7:
			decenas = "setenta y ";
			break;
		case 8:
			decenas = "ochenta y ";
			break;
		case 9:
			decenas = "noventa y ";
			break;
		default:
			break;
		}
		switch (num1) {
		case 10:
			System.out.println("diez");
			break;
		case 11:
			System.out.println("once");
			break;
		case 12:
			System.out.println("doce");
			break;
		case 13:
			System.out.println("trece");
			break;
		case 14:
			System.out.println("catorce");
			break;
		case 15:
			System.out.println("quince");
		default:
			break;
		}

		if (!(num1 == 11 || num1 == 12 || num1 == 13 || num1 == 14 || num1 == 15)) {
			if (decenas == null) {
				System.out.println(unidades);
			}
			if (!(num1 == 10 || num1 == 20 || num1 == 30 || num1 == 40 || num1 == 50 || num1 == 60 || num1 == 70
					|| num1 == 80 || num1 == 90 || num1 == 0 || num1 == 1 || num1 == 2 || num1 == 3 || num1 == 4
					|| num1 == 5 || num1 == 6 || num1 == 7 || num1 == 8 || num1 == 9)) {
				if (decenas == null) {
					System.out.println(unidades);
				} else {
					System.out.println(decenas + unidades);
				}
			}

		}

	}
}