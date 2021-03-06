
package data_en_crypto.flujos.entrada;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Flujo de Entrada que es un archivo.
 * @author nyx
 */
public class E_Archivo extends Entrada{
    /**
     * Directorio en donde se encuentra el archivo.
     */
    private final String DIR;
    /**
     * Nombre del archivo.
     */
    private final String NOM;
    /**
     * Extension del archivo.
     */
    private final String EXT;
    /**
     * Muestra si escribimos el archivo a RAM o no.
     */
    private final boolean ESTA_EN_RAM;
    /**
     * un contador global del clase.
     */
    private int pos = 0;
    /**
     * un string para almacenar un poco del archivo en RAM.
     */
    private String prox = "";

    /**
     * Constructor para abrir un nuevo archivo de entrada.
     * @param dir Directorio en donde se encuentra el archivo.
     * @param nom Nombre del archivo.
     * @param ext Extension del archivo.
     * @param leerAlRAM ¿Debemos copiar todo el contenido del archivo al RAM?
     * @throws FileNotFoundException si el archivo no fue encontrado
     */
    public E_Archivo(String dir, String nom, String ext, boolean leerAlRAM) throws FileNotFoundException {
        super(dir + nom + ext);
        this.DIR = dir;
        this.NOM = nom;
        this.EXT = ext;
        if(leerAlRAM){
            data = this.leerData();
            ESTA_EN_RAM = true;
        } else {
            ESTA_EN_RAM = false;
        }
    }

    /**
     * Crea un flujo de archivo de entrada con todo el path completo
     * @param path todo el path completo
     * @param leerAlRAM si debemos leer al RAM o no
     * @throws FileNotFoundException si el archivo no fue encontrado
     */
    public E_Archivo(String path, boolean leerAlRAM) throws FileNotFoundException {
        super(path);
        String sep = System.getProperty("file.separator");
        this.DIR = path.substring(0, path.lastIndexOf(sep) + 1);
        this.NOM = path.substring(path.lastIndexOf(sep) + 1, path.lastIndexOf("."));
        this.EXT = path.substring(path.lastIndexOf(".") + 1);
        if(leerAlRAM){
            data = this.leerData();
            ESTA_EN_RAM = true;
        } else {
            ESTA_EN_RAM = false;
        }
    }

    /**
     * Crea un nuevo flujo de entrada con datos ya leidos.
     *
     * @param data   datos para almacenar en este objeto
     * @param lector el scanner que este entrada debe usar para leer
     *               mas datos si es necessario
     */
    public E_Archivo(String data, Scanner lector) {
        super(data, lector);
        this.DIR = null;
        this.NOM = null;
        this.EXT = null;
        this.ESTA_EN_RAM = true;
    }

    /**
     * Leer todos los datos en un archivo y los devuelve en forma de un String
     * @return todo el contenido del archivo
     */
    private String leerData() {
        String leer = "";
        while(lector.hasNextLine()){
            leer += lector.nextLine();
            if(lector.hasNextLine()){
                leer += "\n";
            }
        }
        return leer;
    }
    
    /**
     * Leer el proximo caracter del archivo.
     * @return el proximo caracter del archivo
     */
    public char leerDato() {
        char dato;
        if(isESTA_EN_RAM()){
            if(pos < data.length()){
                dato = data.charAt(pos);
            } else {
                throw new IndexOutOfBoundsException();
            }
        } else {
            if("".equals(prox) && lector.hasNext()){
                prox = lector.next();
            } else if ("".equals(prox)) {
                throw new IndexOutOfBoundsException();
            } else if (pos >= prox.length()){
                pos = 0;
                if(lector.hasNext()){
                    prox = lector.next();
                } else {
                    throw new IndexOutOfBoundsException();
                }
            }
            dato = prox.charAt(pos);
        }
        pos++;
        return dato;
    }

    /**
     * Directorio en donde se encuentra el archivo.
     * @return DIR - Directorio del archivo
     */
    public String getDIR() {
        return DIR;
    }

    /**
     * Nombre del archivo.
     * @return NOM - Nombre del archivo
     */
    public String getNOM() {
        return NOM;
    }

    /**
     * Extension del archivo.
     * @return EXT - Extension del archivo
     */
    public String getEXT() {
        return EXT;
    }

    /**
     * Muestra si escribimos el archivo a RAM o no.
     * @return ESTA_EN_RAM
     */
    public boolean isESTA_EN_RAM() {
        return ESTA_EN_RAM;
    }

    /**
     * Cierre el escanner sobre este archivo.
     */
    public void cerrar() {
        super.lector.close();
    }
    
}
