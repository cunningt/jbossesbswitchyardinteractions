Overview:
=========
  The purpose of the httpgateway quickstart sample is to prove that the ESB can  
  receive HTTP requests produced by FSW6.

To Run:
===========================
  1. Install the rosetta.jar within your local maven repository :

  %sh mvn org.apache.maven.plugins:maven-install-plugin:2.5.1:install-file -Dfile=/Users/tcunning/jboss-5.1.0.GA/server/default/deployers/esb.deployer/lib/jbossesb-rosetta.jar -DgroupId=org.jboss.soa.esb -DartifactId=rosetta -Dversion=4.12 -Dpackaging=jar

  2. Build the ESB package :
   
  mvn clean install 
  
  3. Start your jboss-5.1.0.GA instance with a secondary ports setting :

  %sh ./run.sh -c default -Djboss.service.binding.set=ports-02

  4. This http gateway application will respond to requests such 
  addressed to http://[host]:[port]/[esb-name]/http/[url-pattern]/*,
  such as :
 
  http://localhost:8280/soa5_httpgateway-0.0.1-SNAPSHOT/http/example/a/b/c

  5. Follow the directions in fsw6_httprouter, and start your EAP server 

  6. Watch requests produced by FSW6 be consumed in the console. 
