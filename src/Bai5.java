import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh 1 tam giác:");
        int x = sc.nextInt();
        System.out.println("Nhập cạnh 2 tam giác:");
        int y = sc.nextInt();
        System.out.println("Nhập cạnh 3 tam giác:");
        int z = sc.nextInt();
        if (x == y && y == z && x == z) {
            System.out.println("đây là tam giác đều");
        } else if (x * x == y * y + z * z || y * y == x * x + z * z || z * z == y * y + x * x) {
            if (x==y||x==z||y==z){
                System.out.println("Đây là tam giác vuông cân");
            }
            System.out.println("đây là tam giác vuông");
        } else if (x==y||x==z||y==z) {
            System.out.println("Đây là tam giác cân");
        } else {
            System.out.println("Dây là tam giác thường");
        }
    }
}
