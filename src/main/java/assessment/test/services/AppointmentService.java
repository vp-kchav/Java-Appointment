/*
 * Created on March 17, 2018
 */
package assessment.test.services;

import java.util.List;

import assessment.test.domain.Appointment;

public interface AppointmentService {
    
    Appointment findById(Long id);
    
    Appointment save(Appointment serie);
    
    List<Appointment> getAll();
    
    List<Appointment> findByDescription(String searchText);
}
