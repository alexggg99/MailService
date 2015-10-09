package model;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Created by alexggg99 on 11.08.15.
 */

@Transactional
public interface PriorityDAO extends CrudRepository<Priority, Long> {
    Optional<Priority> findByName(String name);
    Optional<Priority> findById(long id);
    Optional<Priority> findByPriority(int priority);
    List<Priority> findAll();
}
