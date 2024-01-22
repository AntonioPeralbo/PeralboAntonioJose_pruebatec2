# PRUEBA TÉCNICA 2 ANTONIO JOSÉ PERALBO
Ejercicio practico en el que el proyecto permite hacer una creacion de usuario a la que se le asignaran los tramites que se creen a traves de su DNI.Ademas se podra modificar el estado o eliminar en caso de que sea necesario.
Todo ello se registrara en la base de datos a traves de JPA.
## INSTALACIÓN E INICIO DEL PROYECTO
Para ello debemos segir los sieguientes pasos:
- Clonar el repositorio.
- Iniciar el gestor de bases de datos (En este caso Xampp usuario "root" y contraseña en blanco).
- Importar la base de datos subida al repositorio (goverment.sql).
- Tener instalado Apache Tomcat (En este caso version 9.0.83 ).
- Autentificacion de Tomcact : Usuario admin Contraseña: 123 ( lo usamos por defecto al no ser un proyecto que necesite seguridad)
- Abrir en el IDE que vayan a usar el poryecto y ejecutarlo (En este caso Neetbeans).
- 
## CONTENIDO Y USO.
  
     
## SUPUESTOS
  - Al ser una aplicación de empleados entendemos que el id se equipara al numero de empleado por lo que al ser un número unico no habria duplicados.
  - El formato de la fecha es dd/MM/yyyy , en caso de no intruducirse asi saltara el error y la aplicación volvera a solicitar que introduzca los datos de inicio.
