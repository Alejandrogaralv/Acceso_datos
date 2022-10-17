package ObjetosBinarios;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        File dir = new File("./archivos");
        File bin = new File(dir, "personas2.dat");
        if(!bin.exists()){
            try {
                bin.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Persona p1 = new Persona("Alejandro", 21);
        Persona p2 = new Persona("Fabio", 19);
        Persona p3 = new Persona("Marco", 21);
        HashMap<String, Integer> personas = new HashMap<>();
        personas.put("Alejandro", 21);
        personas.put("Fabio", 19);
        personas.put("Marco", 20);


        try {
            crearBinario(bin, p1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            leerBinario(bin);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" ");
        System.out.println(" ");
        try {
            crearBinarioMap(bin, personas);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            leerBinarioArray(bin);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void crearBinario(File f, Persona p) throws IOException {
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream oout = new ObjectOutputStream(fout);
        oout.writeObject(p);
        fout.close();
        oout.close();

    }
    public static void crearBinarioMap(File f, HashMap<String, Integer> mapa) throws IOException {
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream oout = new ObjectOutputStream(fout);
        for (Map.Entry<String, Integer> entry:mapa.entrySet()) {
            Persona p = new Persona(entry.getKey(), entry.getValue());
            oout.writeObject(p);
        }
        fout.close();
        oout.close();

    }
    public static void leerBinario(File f) throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream oin = new ObjectInputStream(fin);
        System.out.println(oin.readObject().toString());
        oin.close();
    }
    public static void leerBinarioArray(File f) throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream oin = new ObjectInputStream(fin);
            Persona p;
        try {
            while (true) {
                System.out.println(oin.readObject().toString());
            }
        }catch(EOFException eo){
            System.err.println(" ");
        }
        oin.close();
    }

}
