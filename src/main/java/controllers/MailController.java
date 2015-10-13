package controllers;

import model.Email;
import model.EmailDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by alexggg99 on 26.07.15.
 */

@Controller
public class MailController {

    @Autowired
    private EmailDAO emailDAO;

    @RequestMapping(value = "/getEmail")
    public ResponseEntity<List<Email>> getEmails() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String name = user.getUsername(); //get logged in username
        List<Email> result = (List<Email>) emailDAO.findAll();
        return new ResponseEntity<List<Email>>(result, HttpStatus.OK);
    }

//    @RequestMapping(value = "/api/send", method = RequestMethod.POST)
//    public ResponseEntity<Email> sendEmail(@RequestBody Email m) {
//        Email email = new Email(m.getEmailTo(), m.getEmailBody(), m.getSubject());
//        email.setSendAt(new Date());
//        email.setEmailFrom("test@gmail.com");
//        emailDAO.save(email);
//        return new ResponseEntity<Email>(email,HttpStatus.OK);
//    }

}
