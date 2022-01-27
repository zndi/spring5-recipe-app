package guru.springframework.repository;

import guru.springframework.entity.Notes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NotesRepository extends CrudRepository<Notes, Long> {
}
