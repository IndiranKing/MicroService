package resultRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import resultEntity.Result_Entity;

@Repository
public interface Result_Repository extends JpaRepository<Result_Entity, Long> {

}
