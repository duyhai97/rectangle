import java.util.Scanner;
public class Exxx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai: ");
        double width = sc.nextDouble();
        System.out.println("nhap chieu rong: ");
        double height = sc.nextDouble();

        Rectangle b = new Rectangle(width, height);

        System.out.println("chu vi la: " + b.Chuvi());
        System.out.println("dien tich la: " + b.Aria());
    }

}
