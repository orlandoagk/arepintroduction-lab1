# AREP Introduction - LAB 1
## Descripción
Este software esta hecho para leer de un archivo varios números así calcular la media y la desviación estándar de estos conjuntos de números flotantes. El archivo del cual lee los números se encuentra en la carpeta raiz del proyecto y se llama **ficherodedatos.txt** (Más abajo hay una nota donde se explica el formato del archivo) 

##Ejecución
###Código
1. `git clone https://github.com/orlandoagk/arepintroduction-lab1.git`
2. `cd arepintroduction-lab1`
3. `mvn package`
4. `java -cp target\arepintroduction-1.0-SNAPSHOT.jar Main`

**Nota: Para editar los valores puedes editar el archivo ficherodedatos.txt de manera que los números en la misma fila se calcularan en el mismo grupo y para hacer más de un calculo colocalos en diferentes filas**

###Pruebas
1. `mvn test`

##Stack de tecnologias
- [Java 8](https://www.java.com/es/download/)
- [Apache Maven](https://maven.apache.org/)
- [Github](https://www.github.com/)

##Autor
- [orlandoagk - Github](https://www.github.com/orlandoagk)
- [Orlando Gelves - Linkedin](https://www.linkedin.com/in/orlando-antonio-gelves-kerguelen-11445b1a5/)

##Referencias
- [PDF de Enunciado](http://campusvirtual.escuelaing.edu.co/moodle/pluginfile.php/181210/mod_resource/content/0/EnunciadoTallerEjercicioMVNGit.pdf)

##Licencia
This project is licensed under the GNU General Public License v3.0 - see the [LICENSE](https://github.com/orlandoagk/arepintroduction-lab1/blob/master/licencia/licencia.md) file for more details.