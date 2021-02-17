package escaneate.com.registro;

import java.util.ArrayList;

import java.util.List;

/**
 * Proyecto escaneate - Clase Main
 * Proyecto que pretende capturar los datos de usuarios
 *
 * @author Edinson Jair Yara Rueda
 * @author Miguel David Ruiz Sanchez
 * @date 3/12/2020
 * @version 0.1
 */
public class Main {
    /**
     * Creación de lista para obtener datos de varios usuarios
     */
    public static List<Usuario> usuario = new ArrayList<>();

    public static String nombre;
    public static String tipoDNI;
    public static long DNI = 0;
    public static long phone = 0;
    public static String birth;
    public static String contact;
    public static String parent;
    public static String blood;
    public static String rh;
    public static String genre;
    public static String patology;

    public static void main(String[] args) {
        Usuario usuarios = new Usuario(nombre, tipoDNI, DNI, phone, birth, contact, parent, blood, rh, genre, patology);
        usuario.add(usuarios);
    }

    /**
     * Metodo obtenerNombre
     * @param name
     * @return
     */
    public static String obtenerNombre(String name) {
        nombre = name;
        return nombre;
    }

    /**
     * Metodo obtenerTipoDNI
     * @param tipo
     * @return
     */
    public static String obtenerTipoDNI(String tipo) {
        tipoDNI = tipo;
        return tipoDNI;
    }

    /**
     * Metodo obtenerDNI
     * @param numeroDNI
     * @return
     */
    public static long obtenerDNI(long numeroDNI) {
        DNI = numeroDNI;
        return DNI;
    }

    /**
     * Metodo obtenerTel
     * @param numeroTel
     * @return
     */
    public static long obtenerTel(long numeroTel) {
        phone = numeroTel;
        return phone;
    }

    /**
     * Metodo obtenerFNac
     * @param fnac
     * @return
     */
    public static String obtenerFnac(String fnac) {
        birth = fnac;
        return birth;
    }

    /**
     * Metodo obtenerContacto
     * @param contacto
     * @return
     */
    public static String obtenerContacto(String contacto) {
        contact = contacto;
        return contact;
    }

    /**
     * obtenerParentesco
     * @param parentesco
     * @return
     */
    public static  String obtenerParent(String parentesco) {
        parent = parentesco;
        return parent;
    }

    /**
     * Metodo obtenerSang
     * @param gSang
     * @return
     */
    public static String obtenerSang(String gSang) {
        blood = gSang;
        return blood;
    }

    /**
     * Metodo obtenerRH
     * @param obtRH
     * @return
     */
    public static String obtenerRH(String obtRH) {
        rh = obtRH;
        return rh;
    }

    /**
     * Metodo obtenerPatol
     * @param patol
     * @return
     */
    public static String obtenerPatol(String patol) {
        patology = patol;
        return  patology;
    }

    /**
     * Metodo obtenerGenero
     * @param genero
     * @return
     */
    public static String obtenerGenero(String genero) {
        genre = genero;
        return genre;
    }
}