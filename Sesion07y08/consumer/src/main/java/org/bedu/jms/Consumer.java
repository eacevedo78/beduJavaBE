package org.bedu.jms;

import lombok.extern.slf4j.Slf4j;
import org.bedu.jms.model.Email;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Consumer {
    @RabbitListener(queues = {"${hsbc.queue}"})
    public void consume(Email email){
        log.info("Mensaje recibido....");
        log.info(email.toString());
    }
}
