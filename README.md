# ws_fiap_roteiro-3.0
Trabalho sobre ESB Apache Camel, do curso de MBA - Desenvolvimento Java, SOA e IoT.

Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s mvn:com.fiap/banco/1.0.7-SNAPSHOT
    
    osgi:install -s mvn:com.fiap/cobranca/1.2.7-SNAPSHOT
    
    osgi:update --force 314 mvn:com.fiap/cobranca/1.2.7-SNAPSHOT

For more help see the Apache Camel documentation

    http://camel.apache.org/
