PROYECTO: FORMULARIO DE LOGIN CON VALIDACIÓN Y DISEÑO PERSONALIZADO EN JAVA

Este proyecto fue creado con el objetivo de diseñar una interfaz gráfica, implementando validaciones personalizadas tanto para correos como para contraseñas. Todo está construido en Java y organizado en clases reutilizables y bien estructuradas.

───────────────────────────────────────────────
¿QUÉ HACE ESTE PROYECTO?
───────────────────────────────────────────────
✔ Presenta un formulario visual limpio.
✔ Divide el formulario en dos paneles: uno visual con imagen, y otro con campos de entrada.
✔ Usa placeholders dinámicos para el correo y la contraseña.
✔ Valida que el correo tenga formato correcto y dominio válido.
✔ Valida que la contraseña sea segura (longitud, números, mayúsculas, símbolo, sin espacios).
✔ Muestra mensajes de error personalizados si hay campos inválidos.
✔ Permite acceder a otra ventana (VentanaPrincipal) cuando los datos son correctos.
✔ Permite reutilizar el formulario como un componente personalizado (JPanel).
✔ Permite personalizar imágenes e incluso colores de fondo desde otros formularios.

───────────────────────────────────────────────
CLASES PRINCIPALES DEL PROYECTO
───────────────────────────────────────────────

1) ValidadorTexto.java
-----------------------
Clase con métodos estáticos que validan cadenas de texto. No necesita ser instanciada.
Validaciones incluidas:

- Longitud mínima de 8 caracteres.
- Al menos una mayúscula.
- Al menos un número.
- Al menos un símbolo especial (!@#$%^&...).
- No debe contener espacios.
- Dominio de correo válido: solo se permiten @gmail.com o @hotmail.com

Métodos resumen:
- esCorreoValido()
- esContrasenaSegura()

Ideal para cualquier proyecto que requiera validar entradas de texto.

2) RegistroPanel.java
-----------------------
Es una ventana tipo JFrame que representa el formulario principal del login, fue la ventana diseño para poder hacer pruebas de cada cambio. 

Características:

- Fondo dividido con imagen a la izquierda y campos a la derecha.
- Textos sugeridos dentro de los campos que desaparecen al hacer clic.
- Validación visual con etiquetas de error.
- Botón para registrarse y botón para entrar.
- Abre VentanaPrincipal si los datos son correctos.

3) panelPrueba.java
-----------------------
Es la misma interfaz del formulario de login pero empaquetada como JPanel.
Esto permite:

- Registrarlo en la paleta de componentes de NetBeans.
- Reutilizarlo en otros proyectos o ventanas.
- Acceder a métodos públicos para modificar color de fondo y la imagen mostrada.

4) prueba1.java
-----------------------
Ventana de prueba donde se usa el panelPrueba como componente.
Aquí es importante hacer énfasis:

► Para que el login se vea correctamente centrado y sin barra superior,
   se recomienda incluir los siguientes comandos dentro del constructor
   `public prueba1()`:

   setUndecorated(true);
   setLocationRelativeTo(null);

Esto eliminará el borde superior (barra del sistema) y centrará el formulario en pantalla, haciendo la interfaz más amigable.

───────────────────────────────────────────────
REQUISITOS
───────────────────────────────────────────────
- NetBeans (se usó para diseño visual).
- Las imágenes deben estar en la ruta correcta y tener dimensiones de 408x505 px.
- Clase `VentanaPrincipal` debe existir para probar el ingreso exitoso.

───────────────────────────────────────────────
RECOMENDACIONES
───────────────────────────────────────────────
✔ Si vas a usar el componente como JPanel en otro proyecto, usa `panelPrueba`.
✔ Si prefieres una ventana completa que se abra sola, usa `RegistroPanel`.
✔ Puedes extender las validaciones o adaptarlas para otros dominios o reglas.
✔ Si personalizas colores o imágenes, asegúrate de usar los métodos públicos definidos.

───────────────────────────────────────────────
LINKS DE VIDEOS YOUTUBE
───────────────────────────────────────────────
✔ Funcinoamiento del componente: https://youtu.be/v8Ug0B_zdIo
✔ Video de libreria: https://youtu.be/Mm52PnpLf5I

───────────────────────────────────────────────
CRÉDITOS
───────────────────────────────────────────────
Este proyecto fue desarrollado por Yhudiel Mendoza Sanchez con fines educativos.
───────────────────────────────────────────────
