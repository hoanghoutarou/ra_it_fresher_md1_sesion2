import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("Là số chẵn");
        }else {
            System.out.println("Là số lẻ ");
        }
    }
}
