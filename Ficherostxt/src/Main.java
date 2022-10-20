import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("./archivos/miFichero.txt");
        FileReader fr = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(fr);
        escribirDatos(f, "Palabra");
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
    public static void  escribirDatos(File f, String palabra) throws IOException {
        FileWriter fw = new FileWriter(f, true);
        fw.write(palabra + "\n");
        fw.close();
    }
}
