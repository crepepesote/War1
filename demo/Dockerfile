# Usar una imagen base de Tomcat
FROM tomcat:latest

# Definir el directorio de trabajo dentro del contenedor
WORKDIR /usr/local/tomcat/webapps/

# Copiar el archivo WAR desde el directorio target de tu proyecto al directorio de despliegue de Tomcat
COPY target/demo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/demo-0.0.1-SNAPSHOT.war

# Exponer el puerto en el que Tomcat se ejecutará (puerto predeterminado: 8080)
EXPOSE 8080
