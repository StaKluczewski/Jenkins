package pl.zajecia.Laboratorium3.dao.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.zajecia.Laboratorium3.dao.entity.VideoCassete;

@Repository
public interface VideoCassetteRepo extends CrudRepository<VideoCassete, Long> {

}
