import java.util.Scanner;

public class CountCoincide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 1 chuoi: ");
        String str = sc.nextLine();
        System.out.print("Nhap 1 ky tu: ");
        String c = sc.nextLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            String strChar = Character.toString(str.charAt(i));
            if (c.equals(strChar)) {
                count++;
            }
        }
        System.out.println("So lan xuat hien cua ky tu '" + c + "' trong chuoi '" + str + "' la: " + count);
    }
}
