package model;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Created by alexggg99 on 11.08.15.
 */

@Transactional
public interface PersonDAO extends CrudRepository<Person, Long> {
    Optional<Person> findById(long id);
    Optional<Person> findByName(String name);
    Optional<Person> findByNickname(String nickname);
    List<Person> findAll();
}
