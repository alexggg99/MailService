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
    Optional<Person> getPersonById(long id);
    Optional<Person> getPersonByName(String name);
    Optional<Person> getPersonByNickname(String nickname);
    List<Person> getAllPerson();
}
