import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm html:");
        double html = sc.nextDouble();
        System.out.println("Nhâp điểm css:");
        double css = sc.nextDouble();
        System.out.println("Nhập điểm javascript:");
        double javascript = sc.nextDouble();;

        double tb = (html+css+javascript)/3;
        System.out.printf("Diem trung binh: %d",tb);
        if (0<=tb || tb<5){
            System.out.println("Xếp loại yếu");
        }else if (5<=tb && tb<7){
            System.out.println("Xếp loại trung bình");
        }else if (7<=tb && tb<8){
            System.out.println("Xếp loại kha");
        }else if (8<=tb && tb<9){
            System.out.println("Xếp loại gioi");
        }else if (9<=tb && tb<10 ){
            System.out.println("Xếp loại xuat sac");
        }
    }
}
