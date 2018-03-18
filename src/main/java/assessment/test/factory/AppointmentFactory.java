/*
 * Created on Nov 17, 2017
 */
package assessment.test.factory;

import java.util.Date;

import assessment.test.domain.Appointment;
import assessment.test.domain.AppointmentDto;



public class AppointmentFactory {
    
    private static AppointmentFactory INSTANCE = null;
 
    // private constructor restricted to this class itself
    private AppointmentFactory()
    {
  
    }
    // static method to create instance of Singleton class
    public static AppointmentFactory getInstance()
    {
        if (INSTANCE == null)
            INSTANCE = new AppointmentFactory();
 
        return INSTANCE;
    }
    
     public Appointment createAppointmentFromDto(AppointmentDto dto) {
         Appointment appointment = new Appointment();
         appointment.setDescription(dto.getDescription());
         Date d = java.sql.Timestamp.valueOf(dto.getAppointmentDate());
         appointment.setAppointmentDate(d);
         appointment.setAppointmentTime(d);
         return appointment;
    }

}
