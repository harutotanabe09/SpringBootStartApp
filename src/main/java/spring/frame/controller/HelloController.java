package spring.frame.controller;

import com.slack.api.Slack;
import com.slack.api.webhook.Payload;
import com.slack.api.webhook.WebhookResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() throws IOException {
        return "Greetings from Spring Boot!";
    }
}
