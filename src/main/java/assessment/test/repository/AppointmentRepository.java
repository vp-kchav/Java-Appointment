/*
 * Created on March 17, 2018
 */
package assessment.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import assessment.test.domain.Appointment;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
    
    @Query(value = "SELECT ap FROM Appointment ap Where ap.description like CONCAT('%',:des,'%')")
    List<Appointment> findByDescription(@Param("des") String des);
    
}
