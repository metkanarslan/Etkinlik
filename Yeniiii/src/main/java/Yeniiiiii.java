import java.util.Scanner;

public class Yeniiiiii {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat = inp.nextInt();
        if (heat<5){
            System.out.println("Kayak Yapabilirsiniz.");
        }else if (heat>=5&&heat<=25) {
            if (heat <= 15) {
                System.out.println("Sinemaya Gidebilirsiniz");
            } else if (heat > 10) {
                System.out.println("Pikniğe Gidebilirsiniz");
            }
        }else if (heat>25){
            System.out.println("Yüzmeye Gidebilirsiniz");
        }
    }

}
