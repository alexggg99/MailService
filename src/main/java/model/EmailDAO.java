package model;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Created by alexggg99 on 11.08.15.
 */

@Transactional
public interface EmailDAO extends CrudRepository<Email, Long> {
    Optional<Email> getEmailById(long id);
    Optional<Email> getEmailBySubject(String subject);
    List<Email> getAllEmail();
}
