/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //el void  no tendra una valor de retorno
        //String miCiudad = obtenerCiudadMayuscula("Loja");
        //System.out.printf("%s\n", miCiudad);
        // Procedimiento para volver a la tabla original
        obtenerMultiplicacion(7,50);
       String miMensaje =obtenerMultiplicaciondos(7,50);
       String miMensajeFinal =obtenerMultiplicaciondos(7,50);
       
        System.out.printf("%s\n",miMensaje);

        System.out.printf("%s\n", miMensaje);
        System.out.printf("%s\n", miMensajeFinal);

    }

    public static String obtenerCiudadMayuscula(String m) {
        String m2 = m.toUpperCase();
        return m2;
    }
    //aquial final se puso un return para que pueda de volver una cadena 
     public static String obtenerMultiplicaciondos(int tabla, int limite) {
        int multiplicacion = 0 ;
        String cadenaFinal = "";
        for (int i = 0; i < limite; i++) {
            multiplicacion = tabla * i;
            cadenaFinal = String.format("%s%d * %d = %d\n",
                     cadenaFinal, tabla, i,
                    multiplicacion);
        }
        return cadenaFinal;
  }


    public static void obtenerMultiplicacion(int tabla, int limite) {
        int multiplicacion = 0 ;
        String cadenaFinal = "";
        for (int i = 0; i < limite; i++) {
            multiplicacion = tabla * i;
            cadenaFinal = String.format("%s%d * %d = %d\n",
                     cadenaFinal, tabla, i,
                    multiplicacion);
        }
        System.out.printf("%s\n", cadenaFinal);
    }

    public static String obtenerNombre() {
        return "Luis";
    }

}
