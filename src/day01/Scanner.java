package day01;

public class Scanner {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan ismini, soyismini ve yasini alip,
        asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir.
         */
            java.util.Scanner scan = new java.util.Scanner(System.in);
            System.out.println("Lutfen isminizi giriniz");
            String girilenIsim = scan.nextLine();
            System.out.println("Lutfen soyisminizi giriniz");
            String girilenSoyisim= scan.nextLine();
            System.out.println("Lutfen Yasinizi giriniz");
            int girilenYas= scan.nextInt();
            System.out.println("isminiz : " + girilenIsim +
                    "\nSoyisminiz : " + girilenSoyisim +
                    "\nyasiniz : " + girilenYas +
                    "\nkaydiniz basariyla tamamlanmistir.");
        }
    }

