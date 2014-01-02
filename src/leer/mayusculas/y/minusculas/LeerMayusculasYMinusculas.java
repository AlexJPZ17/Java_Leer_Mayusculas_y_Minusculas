
package leer.mayusculas.y.minusculas;

import javax.swing.JOptionPane;


public class LeerMayusculasYMinusculas {
//Método de tipo static llamada Mayúsculas
    public static int Mayusculas(String cadena){
        //Declaramos una variable de tipo entero 
        int numero = 0;
        //Ciclo for para obtener la longitud de la cadena
        //length se usa para calcular la longitud de una cadena 
        for (int i = 0; i < cadena.length(); i++) {
            /* Condición para evaluar el charAt para obtener un carácter de 
            cualquier cadena de caracteres que el usuario introduce 
            en caso de los Caracteres de la ASCII imprimibles 65 = A hasta 90 = Z */
            if (cadena.charAt(i)>= 65 && cadena.charAt(i)<= 90) {
                //incrementamos la variable numero 
                numero++;
            }
        }
        return numero;
    }
    //Método de tipo static llamada Minuscula
    public static int Minuscula(String cadena){
        //Declaramos una variable de tipo entero 
        int numero = 0;
        //Ciclo for para obtener la longitud de la cadena
        //length se usa para calcular la longitud de una cadena 
        for (int i = 0; i < cadena.length(); i++) {
            /* Condición para evaluar el charAt para obtener un carácter de 
            cualquier cadena de caracteres que el usuario introduce 
            en caso de los Caracteres de la ASCII imprimibles 95 = a hasta 122 = z */
            if (cadena.charAt(i)>= 95 && cadena.charAt(i)<= 122) {
                //incrementamos la variable numero 
                numero++;
            }
        }
        return numero;
    }
    public static void main(String[] args) {
        //Declaramos una variable de tipo String
        String entrada;
        
        //Método para introducir una cadena de texto 
        entrada = JOptionPane.showInputDialog(null, "Ingrese una cadena de texto ");
        
        //Mensajes para mostrar el resultado 
        JOptionPane.showMessageDialog(null, "El numero de mayusculas de la cadena es " +
                Mayusculas(entrada));
        JOptionPane.showMessageDialog(null, "El numero de minusculas de la cadena es " +
                Minuscula(entrada));
    }
}
