import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("./archivos/miFichero.txt");
        FileReader fr = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(fr);
        escribirDatos(f, "Palabra");
        escribirConBuffer(f, "Buffer");
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
    public static void escribirConBuffer(File f, String texto) throws IOException {
        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(texto);
        bw.newLine();

        bw.close();
        fw.close();
    }
}
