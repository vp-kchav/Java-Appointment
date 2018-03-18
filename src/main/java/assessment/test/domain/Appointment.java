/*
 * Created on March 17, 2018
 */
package assessment.test.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    
    @Column(name="appointment_date")
    @Temporal(TemporalType.DATE)
    private Date appointmentDate;

    @Column(name="appointment_time")
    @Temporal(TemporalType.TIME)
    private Date appointmentTime;
    
    @Column(name="description")
    @NotBlank
    private String description;

    
    public Long getId() {
        return id;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    
    public Date getAppointmentDate() {
        return appointmentDate;
    }

    
    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    
    public Date getAppointmentTime() {
        return appointmentTime;
    }

    
    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    
    public String getDescription() {
        return description;
    }

    
    public void setDescription(String description) {
        this.description = description;
    }

    public Appointment() {
        
    }
    
    public Appointment(Long id, Date appointmentDate, Date appointmentTime, String description) {
        super();
        this.id = id;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.description = description;
    }
   
    
}
