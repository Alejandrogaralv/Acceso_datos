package DatosRandom;

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
            escribirNuemrosRandom(bin, 1, 10, 10);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            LeerBinario(bin);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            mediaArray(bin);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void escribirNuemrosRandom(File f, int min, int max, int total) throws RuntimeException, IOException {
        FileOutputStream fout = new FileOutputStream(f);
        for (int i = 0; i < total; i++) {
            int random = (int)(Math.random()*(max-min+1)+min);
            try {
                fout.write(random);
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
    public static void mediaArray(File file) throws IOException {
        FileInputStream fin = new FileInputStream(file);
        byte[] array = fin.readAllBytes();
        double total = 0;
        for (int j = 0; j < array.length; j++) {
            total = total+j;

        }
        double media = total/array.length;
        System.out.println(media);
        fin.close();
    }
}
