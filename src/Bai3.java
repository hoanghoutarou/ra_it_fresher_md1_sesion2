import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số thứ nhất: ");
        int x = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int y = scanner.nextInt();

        // 1. Tính tổng, hiệu, tích, thương, phép chia lấy dư của 2 số đó.
        int tong = x + y;
        System.out.println(x + " + " + y + " = " + tong);

        int hieu = x - y;
        System.out.println(x + " - " + y + " = " + hieu);

        int tich = x * y;
        System.out.println(x + " * " + y + " = " + tich);

        float thuong = (float) x / y;
        System.out.println(x + " / " + y + " = " + thuong);


    }
}
