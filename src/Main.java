import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int inputSayi,sayi,max=0,min=0;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        inputSayi=input.nextInt();
        for (int i = 1; i <=inputSayi ; i++) {
            System.out.print(i+". Sayıyı Giriniz: ");
            sayi=input.nextInt();
            if (i == 1) {
                max=sayi;
                min=sayi;
            }
            if (max< sayi) {
                max=sayi;
            }
            if (min> sayi) {
                min=sayi;
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}