Para hacer un proyecto spring debemos lo primero importar las librerias de spring, es decir, los .jar

para crear un jar
1) boton derecho sobre el proyeco y export
2) exportar como jarfile
3) elegir el destino
4) finish

Para usar el jar en un proyecto
1) crear en el proyecto la carpet lib
2) meter dichi .jar en el clashpath, que es un fichero donde la vm de java va a buscar todas las clases para usar en el proyecto
3) boton derecho --> pulsar configure buildpath --> add la libreria 

En la industria actual para descargar librerias en un proyecto java se suele utilizar MAVEN
MAVEN es un software ampliamente utilizado en el desarroyo de software que nos ayuda a llevar el ciclo de vida de un programa entero desde que empiezas hasta que lo pones en produccion.
Una de las partes mas importantes que tiene MAVEN es para las dependencias de las libreriasde nuestra app

Para crear un proyecto MAVEN podemos hacerl:
1) boton derecho sobre el proyecto
2) configure
3) convertir a proyecto MAVEN

Una vez hecho esto podemos empezar a configurar las dependencias en el fichero pom.xml

Siempre debemos ir al repositorio central de maven y copiar las dependencias en nuestro pom.xml



SPRING
------------------

Lo primero que tenemos que hacer es crear el contexto de springm podemos hacerlo de varias maneras, una es mediante ficheros xml, pasos:
1) crear paquete recursos
2) sobre recursos new file --> Spring bean configuration file





















