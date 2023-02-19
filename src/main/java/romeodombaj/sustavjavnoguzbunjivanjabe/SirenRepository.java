package romeodombaj.sustavjavnoguzbunjivanjabe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SirenRepository extends JpaRepository<Siren, Integer> {
}
