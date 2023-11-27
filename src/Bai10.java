import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap luong co ban: ");
        double luong = scanner.nextDouble();
        System.out.println("Nhap ngay cong thuc te: ");
        int ngay = scanner.nextInt();
        int tongngaycong = 26;
        double tongluong;
        if(tongngaycong >=ngay){
            tongluong = luong+ (luong*1.5*(ngay-tongngaycong)/tongngaycong);
        }
        else {
            tongluong = luong * ngay / tongngaycong;
        }
        System.out.printf("Tien luong la: %.2f",tongluong);
    }
}
