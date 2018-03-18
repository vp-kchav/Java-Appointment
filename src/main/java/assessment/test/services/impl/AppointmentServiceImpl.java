/*
 * Created on March 17, 2018
 */
package assessment.test.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import assessment.test.domain.Appointment;
import assessment.test.repository.AppointmentRepository;
import assessment.test.services.AppointmentService;


@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public AppointmentServiceImpl() {
    }

    public Appointment findById(Long id) {
        return appointmentRepository.findOne(id);
    }

    public Appointment save(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }
    
    public List<Appointment> getAll() {
        return (List<Appointment>) appointmentRepository.findAll();
    }
    
    public List<Appointment> findByDescription(String searchText) {
        return (List<Appointment>) appointmentRepository.findByDescription(searchText);
    }

}
