package model;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by alexggg99 on 11.08.15.
 */

@Transactional
public interface EmailDAO extends CrudRepository<Email, Long> {
    //public Email findByEmailFrom(String from);
    //public List<Email> findAll();
}
