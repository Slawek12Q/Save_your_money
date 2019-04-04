package pl.slawek.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.slawek.model.Book;


public interface BookRepository extends JpaRepository<Book, Long> {
}