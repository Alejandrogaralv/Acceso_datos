public class Matriz {
    public static void main(String[] args) {
        int[][] matrix = new int [2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrix [i][j] = i+j;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("La fila es: " + i);
                System.out.println("la columna es: " + j);
                try{
                    int valorOperacionNumero = 5*matrix[i][j]/j;
                    String valorOperacion = valorOperacionNumero +"";
                    String digito = valorOperacion.substring(1);
                    System.out.println(valorOperacionNumero);
                    System.out.println("El segundo dígito del resultado de la operación es: " + digito);
                } catch (ArrayIndexOutOfBoundsException e){
                    e.printStackTrace();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
