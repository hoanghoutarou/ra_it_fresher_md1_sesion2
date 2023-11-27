package BaiTap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Hiển thị hình chữ nhật");
        System.out.println("2. Hiển thị hình tam giác có cạnh góc vuông ở botton-left");
        System.out.println("3. Hiển thị hình tam giác vuông, có cạnh góc vuông ở top-left");
        System.out.println("3. Hiển thị hình tam giác cân");
        System.out.println("0. Thoát");
        int luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("*******");
                    System.out.println("*******");
                    System.out.println("*******");
                    break;
                case 2:
                    System.out.println("*");
                    System.out.println("**");
                    System.out.println("***");
                    System.out.println("****");
                    System.out.println("*****");
                    break;
                case 3:
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 4:
                    System.out.println("*******");
                    System.out.println(" ***** ");
                    System.out.println("  ***  ");
                    System.out.println("   *   ");

                    break;
                case 0:
                    System.out.println("Shut down");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }



    }
}
