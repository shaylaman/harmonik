import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,i=1;
        double result=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir pozitif tamsayı giriniz: ");
        n = inp.nextInt();
        while(i<=n){
            result+=1.0/i;
            i++;
        }
        System.out.println("Sonuç: " + result);
    }
}