# Test stack for simple java application

---

## Description  
Repository contains  simple java application, docker-compose with Jenkins, Sonarqube, Artifactory, Tomcat and Nginx  
and Jenkins pipeline for deploy

### Infrastructure
In docker-compose creates stack for deploy simple java application:
* Jenkins - for CI/CD
* Sonarqube - for code analysis in pipeline
* Artifactory - repository for packages
* Tomcat - application server
* Nginx - reverse proxy for stack

### Services addresses
`http://example.com` - application  
`http://example.com/jenkins` - Jenkins  
`http://example.com/sonarqube` - Sonarqube  
`http://repo.example.com` - Artifactory  

### Environment Variables for docker-compose
This pipeline uses next environment variables: 
* for Jenkins:  
`JENKINS_USER`  - user for Jenkins container  
`JENKINS_PASS` - password for Jenkins user  
* for Tomcat:  
`DEPLOY_USERNAME` - username for deploy to Tomcat  
`DEPLOY_USER_PASS` - user password for deploy to Tomcat
