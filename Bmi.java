import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kelamin = sc.nextLine();
        int berat = sc.nextInt();
        double tinggi = sc.nextDouble() / 100.0;
        
        double bmi = berat / (tinggi * tinggi);
switch (kelamin) {
        case "pria" :
        if (bmi < 18 ) {
            System.out.printf("BMI anda adalah %.2f. Termasuk kategori Underweight", bmi);
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.printf("BMI anda adalah %.2f. Termasuk kategori Normal", bmi);
        } else if (bmi >= 25 && bmi < 30){
            System.out.printf("BMI anda adalah %.2f. Termasuk kategori Overweight", bmi);
        } else {
            System.out.printf("BMI anda adalah %.2f. Termasuk kategori Obesitas", bmi);
        }break;
        case "wanita" :
        if (bmi < 18 ) {
            System.out.printf("BMI anda adalah %.2f. Termasuk kategori Underweight", bmi);
        } else if (bmi >= 18.5) {
            System.out.printf("BMI anda adalah %.2f. Termasuk kategori Normal", bmi);
        } else if (bmi >= 25){
            System.out.printf("BMI anda adalah %.2f. Termasuk kategori Overweight", bmi);
        } else {
            System.out.printf("BMI anda adalah %.2f. Termasuk kategori Obesitas", bmi);
        }
    }
    }
}
