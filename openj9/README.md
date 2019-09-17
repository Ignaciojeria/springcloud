# ¿Qué es openj9?

Una JVM open source

# Enlaces interesantes con respecto a openj9

https://www.youtube.com/watch?v=LmmwtquTpQs

https://royvanrijn.com/blog/2018/05/openj9-jvm-shootout/

https://medium.com/karibu-blog/openj9-una-nueva-alternativa-para-la-jdk-de-oracle-e71d8f36a587

# Otros enlaces

https://royvanrijn.com/blog/2018/05/java-and-docker-memory-limits/

https://piotrminkowski.wordpress.com/2017/09/05/spring-cloud-apps-memory-management/

# adoptjdk/openj9 docker hub:

https://hub.docker.com/_/adoptopenjdk

# qué nececsitamos?

- maven 
- java 8
- docker
# instrucciones de ejecución

1) en la raiz del proyecto ejeutar: $mvn clean package (creará el .jar en la carpeta ./tarjet)
2) en la raiz del proyecto ejecutar $docker build . -t openj9-example
3) arrancar el contenedor ejecutando $docker run -p8080:8080 openj9-example
4) ir al endpoint http://{dominio}:8080/hello/world

# ¿Cómo ver la memoria que está utilizando la aplicación?

ejecutar $ docker stats

#Notas

se pueden hacer configuraciones interesantes para optimizar aún mas el footprint. La investigación quedará in-progress.