public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        System.out.println(a/b);
        b=0;

        try{
            System.out.println(a/b);
        }catch(ArithmeticException e) {
            System.err.println("No se puede dividir entre 0");
        }

        b=4;

        System.out.println(a/b);
    }
}
