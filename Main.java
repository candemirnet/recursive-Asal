import java.util.Scanner;
public class Main {
    static int asalMi(int sayi, int sinir){
        if(sayi < 2){
            return 0;
        }
        if (sinir==1){
            return 1;
        }
        if(sayi%sinir==0){
            return 0;
        }
        return asalMi(sayi,sinir-1);
    }
    public static void main(String[] args) {
       Scanner imp = new Scanner(System.in);
       System.out.print("Lütfen Sayı Giriniz: ");
       int numb = imp.nextInt();
       int asal = asalMi(numb,numb/2);
       if(asal==0){
           System.out.println(numb + " bir Asal Sayı Değildir");
       }else{
           System.out.println(numb + " bir Asal Sayıdır");
       }
    }
}