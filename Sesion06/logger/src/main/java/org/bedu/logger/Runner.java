package org.bedu.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    private static Logger logger = LoggerFactory.getLogger(Runner.class);

    /*
    DEBUG: Mensajes no tan importantes
    INFO: Cosas importantes que pasan en el código
    WARN: Alertas o problemas recuperables
    ERROR: Problemas irrecuperables de la app
     */
    @Override
    public void run(String args[]){
        /*String name = "Demo de loggers";
        logger.info("Aplicacion de Spring Boot inicializada");
        logger.warn("El metodo debe recibir una cadena no vacia");
        logger.error("Hubo un problema critico en la app");
        logger.debug("App {}", name);*/

    }

}
