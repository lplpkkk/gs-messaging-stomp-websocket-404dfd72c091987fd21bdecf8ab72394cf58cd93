package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Random;

@Controller
public class GreetingController {


    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
       
       	//  add random prefix of pass or fail
        Random rand = new Random();
        String data = null;
        boolean flag = (rand.nextInt(30) !=0);
        if(flag)
        {
        	data = "pass";
        }
        else
        {
        	data = "fail";
        }
        // getName: get the script name
        // getName2: get the class name
        return new Greeting(message.getName()+"__"+data,message.getName2());

    }

}
