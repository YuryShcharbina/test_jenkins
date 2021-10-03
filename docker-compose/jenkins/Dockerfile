FROM jenkins/jenkins:lts-jdk11
ENV TZ Europe/Minsk

COPY install-plugins.txt /usr/share/jenkins/ref/install-plugins.txt
RUN jenkins-plugin-cli -f /usr/share/jenkins/ref/install-plugins.txt

ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false

COPY groovy-scripts/ /usr/share/jenkins/ref/init.groovy.d/
