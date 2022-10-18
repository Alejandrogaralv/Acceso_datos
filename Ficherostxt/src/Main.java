import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("./archivos/miFichero.txt");
        FileReader fr = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(fr);

        leer(fr);

        leerBufferReader(bufferedReader);

        fr.close();
        bufferedReader.close();
    }
    public static void leer(FileReader fileReader) throws IOException {
        int i;
        while ((i= fileReader.read())!=-1){
            System.out.print((char)i);
        }
    }
    public static void leerBufferReader(BufferedReader br) throws IOException {
        String linea;
        while((linea = br.readLine())!=null){
            System.out.println(linea);
        }

    }

}
