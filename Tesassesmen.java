import java.util.Scanner;

public class Tesassesmen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1 = input.nextInt();
        int angka2 = input.nextInt();

        int hasil = angka1 + angka2;
        
        int ratusan = (hasil / 100) % 10; 
        int puluhan = (hasil / 10) % 10; 
        int satuan = (hasil / 1) % 10;
        
        System.out.printf("%s ratus %s puluh %s",change(ratusan),change(puluhan),change(satuan));
    }
    private static String change(int a) {
        String b = "";
        switch (a) {
            case 1:
                b = "satu"; break;
            case 2:
                b = "dua"; break;
            case 3:
                b = "tiga"; break;
            case 4:
                b = "empat"; break;
            case 5:
                b = "lima"; break;
            case 6:
                b = "enam"; break;
            case 7:
                b = "tujuh"; break;
            case 8:
                b = "delapan"; break;
            case 9:
                b = "sembilan"; break;
        }
        return b;
    }
}