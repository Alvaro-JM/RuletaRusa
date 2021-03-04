
# Ruleta Rusa

Juego conversacional por consola que simula el enfrentamiento entre dos personas jugando a la ruleta rusa. 
Siente la emoción de jugar contra una IA que no tiene ~casi~ nada que perder.  
Cada ronda pondrás en juego dinero y jugaréis uno tras otro hasta que uno se retire perdiendo el dinero apostado o muera.  
El juego continúa hasta que uno de los dos muera o se arruine.  


## Descarga de archivos
Para descargar los archivos desde gitHub, en el enlace del proyecto [RuletaRusa], hacer click en `Code` y seleccionar la opción `Download ZIP`.  
Se descargarán todos los archivos en un ZIP. Los archivos que nos interesan descomprimir son los 4 archivos con extensión `.java`:
~~~
RuletaRusa.java
Jugador.java
Revolver.java
IA.java
~~~

[RuletaRusa]: https://github.com/AlvaroJimenezMedina/RuletaRusa


## CMD
Este juego funciona a través de la consola de comandos de windows.  
Para abrir la consola, o  **CMD**, click derecho en el menú `Inicio` `Ejecutar`, o bien `Windows + R`, y ejecutar cmd.


## Java
Para comprovar si Java está instalado puedes escribir en consola 
~~~
java -version
~~~
Esto nos devuelve la versión de Java que está instalada, como por ejemplo:
~~~
java version "15" 2020-09-15
Java(TM) SE Runtime Environment (build 15+36-1562)
Java HotSpot(TM) 64-Bit Server VM (build 15+36-1562, mixed mode, sharing)
~~~
O bien nos devuelve un mensaje de error si no lo tiene instalado:
~~~
"java" no se reconoce como un comando interno o externo,
programa o archivo por lotes ejecutable.
~~~

## Instalar Java
El primer paso es descargar el **jdk** de la página oficial de [Oracle] e instalarlo siguiendo las indicaciones.  
El siguiente paso es poder compilar y ejecutar JAVA desde la consola.
En `Variables de entorno` dentro de `Propiedades del sistema`

![](/Imagenes/1.png)  

Le damos a `Nueva` en la sección inferior `Variables del sistema` , ponemos la ruta donde está instalado el jdk y le damos un nombre.

![](/Imagenes/2.png)

En la parte superior `Variables de usuario` click en el botón  `Editar` .  
Añadimos uno `Nuevo` dándole el nombre que le pusimos entre `%` y seguido de `\bin\`. Por ejemplo:
~~~
%JAVA_HOME%\bin\
~~~
![](/Imagenes/3.png)


[Oracle]: https://www.oracle.com/es/java/technologies/javase-downloads.html
## Compilar
Para jugar necesitamos compilar los archivos previamente.  
Para compilar los archivos, en la consola nos situamos en la ruta de los archivos y escribimos los siguientes comandos:
~~~
javac IA.java
javac Jugador.java
javac Revolver.java
javac RuletaRusa.java
~~~

Una vez compilados y situados en la ruta de los archivos lanzamos el juego con el siguiente comando:
~~~
java RuletaRusa
~~~

## Cómo jugar
El juego es conversacional, no tiene gráficos ni botones, pero tiene opciones.  
Funciona leyendo el texto el que nos imprime la pantalla y escribiendo nuestras selecciones por teclado.  
  
  
Nada más empezar, el juego nos propone una dificultad  

1. Fácil
2. Media
3. Difícil


La cual elegiremos introduciendo el número correspondiente.  
A continuación nos solicita un nombre de jugador.

Cada ronda comienza mostrando el dinero que dispone cada uno:  
  

El jugador humano siempre será el que comience la ronda. El juego nos ofrece dos opciones: 

1. Pasar
2. Disparar

Seleccionaremos **Pasar** para retirarnos de esta ronda. Perderemos el dinero apostado (100) pero conservaremos la vida.   


Seleccionaremos **Disparar** para probar suerte.  
En caso de que la bala esté situada en la posición de disparo esta te matará haciéndote perder la vida, y por ende el juego.  

En caso de que la bala no sea disparada, el tambor se moverá una posición (acercando la bala una posición a la fatalidad) y el turno pasará al contrincante. 
 
Vladimir podrá disparar 

---
Si ambos siguen vivos y aún les queda dinero una ronda nueva dará comienzo, apostando 100 cada uno y comenzando siempre por el jugador humano.  
¡Espero que te diviertas!
