package ClaseFile;

import java.io.File;
import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        System.out.println("Prueba");
        String ruta = "./archivos";
        File miArchivo = new File(ruta);

        System.out.println(miArchivo.exists());
        System.out.println(miArchivo.isDirectory());
        System.out.println(miArchivo.isFile());
        
        File miFichero = new File(ruta + "/afa.txt");


        System.out.println(miFichero.exists());
        System.out.println(miFichero.isDirectory());
        System.out.println(miFichero.isFile());

        nombresArchivos(miArchivo);
        stringsRutaArchivo(miArchivo);
        renombrarArchivosEspacios(miArchivo);

    }
    public static void stringsRutaArchivo(File archivo){
        System.out.println(Arrays.stream(archivo.listFiles()).toList());
    }
    public static void nombresArchivos(File archivo){

        File[] files = archivo.listFiles();

        for (File file : files) {
            System.out.println(file.getName());
        }
    }
    public static void renombrarArchivosEspacios(File archivo){
        File[] files = archivo.listFiles();
        for (File file : files) {
            String nombreArchivo = file.getName();
            String nombreNuevo = "";
            boolean hayEspacio=false;
            for (int i = 0; i < nombreArchivo.length(); i++) {
                char caracter = nombreArchivo.charAt(i);
                if(Character.compare(caracter, ' ')==0){
                    nombreNuevo=nombreNuevo + "_";
                    hayEspacio=true;
                }else{
                    nombreNuevo=nombreNuevo + caracter;
                }
            }
            if(hayEspacio == true){
                file.renameTo(new File("./archivos", nombreNuevo));
            }
        }
    }
}
