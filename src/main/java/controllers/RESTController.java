package controllers;

import model.Email;
import model.EmailDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by alexggg99 on 26.07.15.
 */

@Controller
public class RESTController {

    private String REST = "{\"all\": [\n" +
            "  {\"body\": \"asdfasfdasdfas\",\n" +
            "   \"subject\": \"hey nice meeting ya\",\n" +
            "   \"to\": \"amy@me.me\",\n" +
            "   \"from\": \"harry@me.me\",\n" +
            "   \"sent_at\": \"2013-03-06T19:02:05\"},\n" +
            "  {\"body\": \"Hello\",\n" +
            "   \"subject\": \"there it goes\",\n" +
            "   \"to\": \"senovia@me.me\",\n" +
            "   \"from\": \"harry@me.me\", \n" +
            "   \"sent_at\": \"2014-03-06T19:02:05\"},\n" +
            "  {\"body\": \"Hey man!!!\",\n" +
            "   \"subject\": \"here it comes\",\n" +
            "   \"to\": \"tina@me.me\",\n" +
            "   \"from\":  \"morenoh149@me.me\" ,\n" +
            "   \"sent_at\": \"2011-03-06T19:02:05\"},\n" +
            "  {\"body\": \"Howare you?\",\n" +
            "   \"subject\": \"where'd it go?\",\n" +
            "   \"to\": \"jose@me.me\",\n" +
            "   \"from\": \"harry@me.me\" ,\n" +
            "   \"sent_at\": \"2011-03-06T19:02:05\"},\n" +
            "  {\"body\": \"howyyyy!!!!\",\n" +
            "   \"subject\": \"hey nice meeting ya\",\n" +
            "   \"to\": \"amy@me.me\",\n" +
            "   \"from\": \"harry@me.me\",\n" +
            "   \"sent_at\": \"2013-03-06T19:02:05\"},\n" +
            "  {\"body\": \"man)))\",\n" +
            "   \"subject\": \"hey nice meeting ya\",\n" +
            "   \"to\": \"amy@me.me\",\n" +
            "   \"from\": \"harry@me.me\",\n" +
            "   \"sent_at\": \"2013-03-06T19:02:05\"},\n" +
            "   {\"body\": \"bue\",\n" +
            "   \"subject\": \"hey nice meeting ya\",\n" +
            "   \"to\": \"amy@me.me\",\n" +
            "   \"from\": \"harry@me.me\",\n" +
            "   \"sent_at\": \"2013-03-06T19:02:05\"},\n" +
            "   {\"body\": \"fuck you\",\n" +
            "   \"subject\": \"hey nice meeting ya\",\n" +
            "   \"to\": \"amy@me.me\",\n" +
            "   \"from\": \"amy@me.me\",\n" +
            "   \"sent_at\": \"2013-03-06T19:02:05\"}\n" +
            "  ]\n" +
            "}";

//    @Autowired
//    private EmailDAO emailDAO;

//    @RequestMapping(value = "/api/mail")
//    public ResponseEntity<List<Email>> getEmails() {
//        List<Email> result = emailDAO.findAll();
//        return new ResponseEntity<List<Email>>(result, HttpStatus.OK);
//    }

//    @RequestMapping(value = "/api/send", method = RequestMethod.POST)
//    public ResponseEntity<Email> sendEmail(@RequestBody Email m) {
//        Email email = new Email(m.getEmailTo(), m.getEmailBody(), m.getSubject());
//        email.setSendAt(new Date());
//        email.setEmailFrom("test@gmail.com");
//        emailDAO.save(email);
//        return new ResponseEntity<Email>(email,HttpStatus.OK);
//    }

}
