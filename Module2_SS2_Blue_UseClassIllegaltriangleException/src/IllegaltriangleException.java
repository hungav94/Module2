public class IllegaltriangleException extends Exception {
    public String IllegaltriangleException(int num1, int num2, int num3) {
        String mes = "";
        if ((num1 + num2 < num3) || (num1 + num3 < num2) || (num2 + num3 < num1) || num1 < 0 || num2 < 0 || num3 < 0){
            mes = num1 + ", " + num2 + ", " + num3 + " khong la 3 canh cua 1 tam giac";
        }
        return mes;
    }
}
