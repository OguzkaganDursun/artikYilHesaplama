import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenler tanimlandi.
        int yil;

        //Kullanicidan veri alindi ve geri bildirim yapildi.
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir Yil Giriniz : ");
        yil = scan.nextInt();

        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0))
        {
            System.out.println("---------------------");
            System.out.println(yil + " yili artik yildir.");
        }
        else
        {
            System.out.println("---------------------");
            System.out.println(yil + " yili artik yil degildir.");
        }
    }
}
