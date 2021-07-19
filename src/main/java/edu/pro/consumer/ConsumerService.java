package edu.pro.consumer;/*
  @author   george
  @project   kafka-consumer
  @class  ConsumerService
  @version  1.0.0 
  @since 17.07.21 - 20.34
*/

import edu.pro.model.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @KafkaListener(topics = "messages", groupId = "message_group_id")
    public void consume(Message message){
        System.out.println("Consuming the message: " + message);
    }
}
