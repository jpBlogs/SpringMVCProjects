FROM java
MAINTAINER Jairaj

RUN curl -O http://archive.apache.org/dist/tomcat/tomcat-7/v7.0.55/bin/apache-tomcat-7.0.55.tar.gz
RUN curl -O http://jairaj-phase.com/documents/SpringApiProject-0.0.1-SNAPSHOT.war
RUN tar xzf apache-tomcat-7.0.55.tar.gz
ADD SpringApiProject-0.0.1-SNAPSHOT.war apache-tomcat-7.0.55/webapps/
CMD apache-tomcat-7.0.55/bin/startup.sh && tail -f apache-tomcat-7.0.55/logs/catalina.out
EXPOSE 8080
