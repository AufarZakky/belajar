import java.util.Scanner;

public class Bmi {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner sc = new Scanner(System.in);
		String kelamin = sc.nextLine();
		int berat = sc.nextInt();
		double tinggi = sc.nextDouble() / 100;

		double bmi = berat / (tinggi * tinggi);

		switch (kelamin) {
			case "pria":
				if (bmi < 18.50) {
					System.out.printf("%.2f, Kurus", bmi);
				} else if (bmi >= 18.50 && bmi < 26.00) {
					System.out.printf("%.2f, Ideal", bmi);
				} else if (bmi >= 26.00 && bmi < 32.00) {
					System.out.printf("%.2f, Overweight", bmi);
				} else {
					System.out.printf("%.2f, Obesitas", bmi);
				}
				break;
			case "wanita":
				if (bmi < 20.50) {
					System.out.printf("%.2f, Kurus", bmi);
				} else if (bmi >= 20.50 && bmi < 27.00) {
					System.out.printf("%.2f, Ideal", bmi);
				} else if (bmi >= 27.00 && bmi < 35.00) {
					System.out.printf("%.2f, Overweight", bmi);
				} else  {
					System.out.printf("%.2f, Obesitas", bmi);
				}

		}
	}
} 