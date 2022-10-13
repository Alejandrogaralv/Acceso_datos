import java.io.*;

public class Main {
    public static void main(String[] args) {
        File dir = new File("./archivos");
        File bin = new File(dir, "personas.dat");
        if(!bin.exists()){
            try {
                bin.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        String[] nombres = {"Ana", "Luis", "Alicia", "Pedro", "Manuel", "Sara", "Sofía"};
        int[] edad = {19, 21, 24, 32, 18, 22, 24};
        try {
            crearBinarioConArrays(bin, nombres, edad);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            leerBin(bin);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void crearBinarioConArrays (File f, String[] nom, int[]ed) throws IOException {
        FileOutputStream fout = new FileOutputStream(f);
        DataOutputStream dout = new DataOutputStream(fout);
        for (int i = 0; i <nom.length; i++) {
            dout.writeUTF(nom[i]);
            dout.writeInt(ed[i]);
        }
        fout.close();
        dout.close();
    }
    public static void leerBin(File f) throws IOException {
        FileInputStream fin = new FileInputStream(f);
        DataInputStream din = new DataInputStream(fin);
        int e;
        String n;
        try {
            while (true) {
                n = din.readUTF();
                e = din.readInt();
                System.out.println("La edad de " + n + " es: " + e);

            }
        }catch(EOFException eo){
            System.err.println(" ");
        }
        fin.close();
        din.close();
    }
}
