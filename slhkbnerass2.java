import java.util.Scanner;

class slhkbnrass2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kalimat = input.nextLine();
        String[] kalimat_baru = kalimat.split(" ");
        String result = "";
        for (String item : kalimat_baru) {
            result += (item.substring(0,item.length()-2) + " ");
        }
        System.out.println(result);
    }
}