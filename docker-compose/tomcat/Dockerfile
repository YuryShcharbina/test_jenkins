FROM tomcat:9.0
ENV  TZ Europe/Minsk

COPY server.xml /usr/local/tomcat/conf/
COPY tomcat-users.xml /usr/local/tomcat/conf/ 
COPY context.xml /usr/local/tomcat/webapps.dist/manager/META-INF/
COPY catalina.properties /usr/local/tomcat/conf/

RUN ln -s /usr/local/tomcat/webapps.dist/manager webapps/manager
RUN ln -s /usr/local/tomcat/webapps.dist/host-manager webapps/host-manager
RUN ln -s /usr/local/tomcat/webapps.dist/ROOT webapps/ROOT

#CMD ["catalina.sh","run"]
