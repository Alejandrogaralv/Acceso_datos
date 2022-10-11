package FlujosDatos_Binarios;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File dir = new File("./archivos");
        File bin = new File(dir, "binario.dat");
        if(!bin.exists()){
            try {
                bin.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            EscribirBinario(bin, 101);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            LeerBinario(bin);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void EscribirBinario(File file, int max) throws IOException {
        FileOutputStream fout = new FileOutputStream(file);
        for (int i = 0; i < max; i++) {
            try {
                fout.write(i);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        fout.close();
    }
    public static void LeerBinario(File file) throws IOException {
        FileInputStream fin = new FileInputStream(file);
        int i;
        while((i=fin.read())!=-1){
            System.out.println(i);
        }
        fin.close();
    }
}
