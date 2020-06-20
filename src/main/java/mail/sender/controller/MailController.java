package mail.sender.controller;

import lombok.AllArgsConstructor;
import mail.sender.entity.Mail;
import mail.sender.service.Sender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController("/")
public class MailController {
    private Sender sender;

    @PostMapping("/send")
    public void sendMessage(@RequestBody Mail mail) {
        sender.sendMail(mail.to, mail.subject, mail.text);
    }
}
