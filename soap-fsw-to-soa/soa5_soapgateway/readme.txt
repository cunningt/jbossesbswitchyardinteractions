Overview:
=========
  The purpose of the helloworld quickstart sample is to prove that the ESB can  
  consume files produced by FSW6.

To Run:
===========================
  1. Install the rosetta.jar within your local maven repository :

  %sh mvn org.apache.maven.plugins:maven-install-plugin:2.5.1:install-file -Dfile=/Users/tcunning/jboss-5.1.0.GA/server/default/deployers/esb.deployer/lib/jbossesb-rosetta.jar -DgroupId=org.jboss.soa.esb -DartifactId=rosetta -Dversion=4.12 -Dpackaging=jar

  2. Build the ESB package :
   
  mvn clean install 
     
  3. Start your jboss-5.1.0.GA instance with a secondary ports setting :

  %sh ./run.sh -c default -Djboss.service.binding.set=ports-02

  4. Deploy the fsw_soaprouter project to FSW6
  
  4. Start FSW6  
 
  5. Watch files SOAP requests from FSW6 being printed in the SOA-P 5 console. 
