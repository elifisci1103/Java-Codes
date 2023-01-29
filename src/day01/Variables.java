package day01;

public class Variables {
    public static void main(String[] args) {
        //Java'da kodlarimizi class'larda olustururuz
        //Class'lar ihtiyac duyuldugunda obje olusturmak icin de kullanilir
        //Java'nin baslangic noktasi(entry point) main method'dur
        //variable'lari datalarimizi saklamak (store) icin olustururuz

        System.out.println("Java Candir");
        String          ogrenciIsmi             =             "Matrix      .";
        // Data turu     variable ismi       assignment(atama)    deger
        System.out.println(ogrenciIsmi); // Matrix      .
        ogrenciIsmi="Tayfur Eğribacak";
        System.out.println(ogrenciIsmi); // Tayfur
    }
}
