import java.util.Scanner;
public class usluSayiHesaplama {

    static int power(int a, int b){
        int result = 1;
        for( int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayı : ");
        int a = inp.nextInt();
        System.out.print("Üs Olacak Sayı : ");
        int b = inp.nextInt();

        System.out.println("Sonuç : " + power(a,b));
    }
}
