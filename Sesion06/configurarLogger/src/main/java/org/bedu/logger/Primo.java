package org.bedu.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Primo implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(Primo.class);

    @Override
    public void run(String args[]){
        int num =-4;
        if(esPrimo(num))
            logger.info("El numero {} es primo",num);
        else
            logger.warn("El numero {} NO es primo",num);
        if(num < 0)
            logger.error("El numero {} es negativo",num);
    }
    private boolean esPrimo(int numero){
        // El 0, 1 y 4 no son primos
        if(numero <0 )
            return false;
        if (numero == 0 || numero == 1 || numero == 4)
            return false;
        for (int x = 2; x < numero / 2; x++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (numero % x == 0)
                return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }
}
