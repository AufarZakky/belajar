import java.util.Scanner;

public class enkripsiass2 {
    private static String caesar(String kalimat,int k){
        String newEncrypt = "";
        for(int i=0;i<kalimat.length();i++){
            if(kalimat.charAt(i) == 32) {
                newEncrypt += " ";
                continue;
            }
            int getAscii = kalimat.charAt(i) - 97;
            if(getAscii + k > 25) {
                getAscii = (getAscii+k) - 26;
            } else {
                getAscii = getAscii + k;
            }
            newEncrypt +=  (char) (getAscii + 97);
        }
        return newEncrypt;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat = input.nextLine();
        int k = input.nextInt();
        System.out.println(caesar(kalimat, k));
        input.close();
    }
}