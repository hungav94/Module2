import java.util.Scanner;

public class UseClassIllegaltriangleException{
    public static void isTriangle(int num1, int num2, int num3) {
        if ((num1 + num2 > num3) || (num1 + num3 > num2) || (num2 + num3 > num1)) {
            System.out.println(num1 + ", " + num2 + ", " + num3 + " la 3 canh cua 1 tam giac");
        }
    }

    public String IllegaltriangleException(int num1, int num2, int num3) {
        String mes = "";
        if ((num1 + num2 < num3) || (num1 + num3 < num2) || (num2 + num3 < num1) || num1 < 0 || num2 < 0 || num3 < 0){
            mes = num1 + ", " + num2 + ", " + num3 + " khong la 3 canh cua 1 tam giac";
        }
        return mes;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhap canh 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Nhap canh 3: ");
        int num3 = scanner.nextInt();

        try {
            isTriangle(num1, num2, num3);
        } catch (IllegaltriangleException e) {

        }
    }
}