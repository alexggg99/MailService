package model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Created by alexggg99 on 11.08.15.
 */

@Repository
public interface EmailDAO extends CrudRepository<Email, Long> {
//    Optional<Email> getById(long id);
//    Optional<Email> getBySubject(String subject);
}
