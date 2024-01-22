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
## CONTENIDO Y USO.
Una vez tenemos el proyecto instalado y acceso a la base de datos ejecutamos el programa, meteremos las contraseñas que nos soliciten y se desplegara una web.
Esta aplicacion nos permite: 
1. Registrar usuarios. Indicando su nombre, apellidos y DNI.
2. Crear Tramite. Indicando nombre del mismo , fecha y estado en el que se encuentra.
3. Filtro. En el cual se desplegara una tabla con los tramites y su cliente asociado aplicando el filtro de fecha y estado que indiquen.
4. Editar estado. Permite la modificacion de estado para cambiar de "en espara" a "ya atendido".
5. Elimitar Tramite. En caso de creacion erronea de un tramite podemos eliminarlo indicando el tramite selecionado.
     
## SUPUESTOS
  - Se ha interpretado que la aplicacion sera usada por un trabajador encargado de registrar y crear los tramites.
  - Se debe registrar siempre un Usuario antes de poder asignarle un Tramite.
  - En la creacion de tramites se presupone que sera siempre primero en espera por lo que la edicion directamente es "Ya atendido", aun asi se deja la opcion de crearlo como "Ya atendido" por si se debe crear algun despues de haberse realizado.
  - Al ser un proyecto usado por el trabajador tiene acceso a los datos para poder realizar los tramites de edicion y eliminar a traves del filtro. 
