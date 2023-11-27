import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên 1:");
        int a = sc.nextInt();
        System.out.println("Nhập số nguyên 2:");
        int b = sc.nextInt();
        System.out.println("Nhập số nguyên 3:");
        int c = sc.nextInt();
        System.out.println("Nhập số nguyên 4:");
        int d = sc.nextInt();

        // tim max min
        int max=a,min=a;
        if (max<b){
            y=max;
        }
        if (max<c){
            max=c;
        }
        if(min>b){
            min=b;
        }
        if(min>c){
            min=c;
        }
        int other= (a+b+c)-(max=min);

    }
}
