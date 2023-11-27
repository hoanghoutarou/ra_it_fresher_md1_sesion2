import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số bất kì: ");
        int x = sc.nextInt();
        if (x%3==0&&x%5==0) {
            System.out.println("Chia hết cả 3 và 5");
        }else {
            System.out.println("không chia hết cho 3 và 5");
        }
    }
}
