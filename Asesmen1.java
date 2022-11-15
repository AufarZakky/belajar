import java.util.Scanner;

public class Asesmen1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ribuan = (((a / 1000) % 10) + 5) % 10;
        int ratusan = (((a / 100) % 10) + 5) % 10;
        int puluhan = (((a / 10) % 10) + 5) % 10;
        int satuan = (((a / 1) % 10) + 5) % 10;

        int ribuan1 = (((b / 1000) % 10) + 5) % 10;
        int ratusan1 = (((b / 100) % 10) + 5) % 10;
        int puluhan1 = (((b / 10) % 10) + 5) % 10;
        int satuan1 = (((b / 1) % 10) + 5) % 10;

        int ribuan2 = (((c / 1000) % 10) + 5) % 10;
        int ratusan2 = (((c / 100) % 10) + 5) % 10;
        int puluhan2 = (((c / 10) % 10) + 5) % 10;
        int satuan2 = (((c / 1) % 10) + 5) % 10;

        System.out.println(ribuan + "" + satuan + "" + puluhan + "" + ratusan);
        System.out.println(ribuan1 + "" + satuan1 + "" + puluhan1 + "" + ratusan1);
        System.out.println(ribuan2 + "" + satuan2 + "" + puluhan2 + "" + ratusan2);

    }
}
