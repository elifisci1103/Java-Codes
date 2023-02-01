package day03;

import java.util.Scanner;

public class IfStatements2 {
    public static void main(String[] args) {


    // Kullanicidan bir sayi alip
    // pozitif ise "pozitif sayi",
    // 100 ile 999 arasinda ise(sinirlar dahil) "pozitif 3 basamakli sayi"
    // 3 ile bolunebiliyorsa "3'un kati"
    // birler basamagi 7 ise "Mukemmel"
    // seceneklerinden uygun olanlari yazdirin
    Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
    int sayi=scan.nextInt();
    // pozitif ise "pozitif sayi",
        if (0<sayi){
        System.out.println("pozitif sayi");
    }
    // 100 ile 999 arasinda ise(sinirlar dahil) "pozitif 3 basamakli sayi"
        if (100<=sayi && sayi<=999){
        System.out.println("pozitif 3 basamakli sayi");
    }
    // 3 ile bolunebiliyorsa "3'un kati"
        if (sayi%3==0){
        System.out.println("3'un kati");
    }
    // birler basamagi 7 ise "Mukemmel"
    // seceneklerinden uygun olanlari yazdirin
        if (sayi%10==7 || sayi%10==-7){
        System.out.println("Mukemmel");
    }
}}

