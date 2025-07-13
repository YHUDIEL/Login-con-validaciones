/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoTap;
import ProyectoTap.ValidadorTexto;

public class MainApp {
    public static void main(String[] args) {
        // Datos de prueba
        String correo = "usuario@gmail.com";
        String contrasena = "Clave$123";

        // Validaciones
        boolean correoValido = ValidadorTexto.esCorreoValido(correo);
        boolean contrasenaValida = ValidadorTexto.esContrasenaSegura(contrasena);

        // Mostrar resultados
        System.out.println("=== Prueba de ValidadorTexto ===");
        System.out.println("Correo ingresado: " + correo);
        System.out.println("¿Correo válido?: " + (correoValido ? "Sí" : "No"));

        System.out.println("Contraseña ingresada: " + contrasena);
        System.out.println("¿Contraseña segura?: " + (contrasenaValida ? "Sí" : "No"));

        if (correoValido && contrasenaValida) {
            System.out.println("✅ ¡Validación exitosa! Puedes registrarte.");
        } else {
            System.out.println("❌ Validación fallida. Revisa los campos.");
        }
    }
}
