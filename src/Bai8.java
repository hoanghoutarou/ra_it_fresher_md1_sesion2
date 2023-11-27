import java.util.Scanner;

public class Bai8 {
    public static boolean checkYear(int nam) {
        return (nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tháng: ");
        int month = input.nextInt();
        System.out.print("Nhập năm: ");
        int year = input.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.print("Month " + month + "có 31 ngày.");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.print("Month " + month + "có 30 ngày");
        } else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.print("Month " + month + "có 29 ngày.");
            } else {
                System.out.print("Month " + month + "có 28 ngày.");
            }
        } else {
            System.out.print("không hợp lệ");
        }
    }
}
