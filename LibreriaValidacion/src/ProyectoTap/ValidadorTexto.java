/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoTap;

/**
 *clase para validar cadenas, en este caso contrasenas y correos electronicos;
 * 
 * @author Yhudiel Mendoza
 */
public class ValidadorTexto {
    
     /**
     * Constructor privado para evitar instanciación.
     */
     private ValidadorTexto(){}
     
     /**
     * Verifica si la contraseña tiene al menos 8 caracteres.
     * 
     * @param pass La contraseña a validar.
     * @return true si la longitud es igual o mayor a 8 caracteres, false si no.
     */
     public static boolean tieneLongitudValida(String pass) 
     {return pass != null && pass.length() >= 8;}
     
     /**
     * Verifica si la contraseña contiene al menos una letra mayúscula.
     * 
     * @param pass La contraseña a validar.
     * @return true si contiene al menos una letra mayúscula, false si no.
     */
     public static boolean contieneMayuscula(String pass) 
     {
         if (pass == null) return false;
         
         for (char c : pass.toCharArray()) 
         { if (Character.isUpperCase(c)) 
         {return true;}
         }
         return false;
     }
     
    /**
     * Verifica si la contraseña contiene al menos un carácter especial.
     * 
     * Los caracteres especiales permitidos son: !@#$%^&amp;*()-_=+
     * 
     * @param pass La contraseña a validar.
     * @return true si contiene al menos uno de los caracteres especiales definidos, false si no.
     */ 
    public static boolean contieneCaracter(String pass) 
    {if (pass == null) return false;

    String especiales = "!@#$%^&*()-_=+";
    for (char c : pass.toCharArray()) {
        if (especiales.indexOf(c) >= 0) {
            return true;
        }
    }
    return false;
    }
    
    /**
     * Verifica si la contraseña contiene al menos un número.
     * 
     * @param pass La contraseña a validar.
     * @return true si contiene al menos un dígito numérico, false si no.
     */
    public static boolean contieneNumero(String pass) 
    {if (pass == null) return false;

    for (char c : pass.toCharArray()) {
        if (Character.isDigit(c)) {
            return true;
        }
    }
    return false;
    }
    
    /**
     * Verifica si el correo electrónico contiene el símbolo '@'.
     * 
     * 
     * @param correo El correo electrónico a validar.
     * @return true si contiene '@', false si no.
     */
    public static boolean contieneArroba(String correo) 
    {
        return correo != null && correo.contains("@");
    }
    
    /**
     * Verifica que el correo electrónico o la contrasena no contenga un espacio ' '.
     * 
     * @param pass la el valor a validar.
     * @return true si no contiene ' ', false si lo contiene.
     */
    public static boolean noContieneEspacio(String pass)
    {
        return pass != null && !pass.contains(" ");
    }
    
    /**
 * Verifica si el correo termina en "@gmail.com" o "@hotmail.com".
 * 
 * @param correo El correo a validar.
 * @return true si tiene un dominio válido, false si no.
 */
public static boolean contieneDominio(String correo) {
    if (correo == null) return false;
    return correo.matches("^[\\w.-]+@(gmail|hotmail)\\.com$");
}

    
    /**
     * verifica si el correo cumple con los siguientes requisitos:
     * <ul>
     *   <li>No contiene espacios</li>
     *   <li>Contiene el caracter "@" </li>
     *   <li>contenga un dominio y se estructure de manera correcta</li>
     * </ul>
     * @param correo el correo a validar
     * @return true si cumple todos los requisitos, false si al menos uno no se cumple
     */
    public static boolean esCorreoValido(String correo){
        return noContieneEspacio(correo) &&
               contieneDominio(correo);
    }
    
    /**
     * verifica si una contrasena cumple con los siguientes requisitos:
     * <ul>
     *   <li>Al menos 8 caracteres </li>
     *   <li>Una letra mayuscula </li>
     *   <li>Al menos un numero </li>
     *   <li>Al menos un caracter especial </li>
     *   <li>No debe contener espacios </li>
     * </ul>
     * @param pass la contrasena a validar
     * @return true si cumple todos los requisitos, false si al menos uno no se cumple
     */
    public static boolean esContrasenaSegura(String pass) 
    {return tieneLongitudValida(pass) &&
           contieneMayuscula(pass) &&
           contieneCaracter(pass) && 
           noContieneEspacio(pass) &&
           contieneNumero(pass);
    }


}