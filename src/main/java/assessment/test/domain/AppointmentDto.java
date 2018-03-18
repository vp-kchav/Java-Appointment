/*
 * Created on Mar 17, 2018
 */
package assessment.test.domain;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class AppointmentDto {
    
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    @NotNull
    private LocalDateTime appointmentDate;
    
    @NotBlank
    private String description;

    
    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    
    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    
    public String getDescription() {
        return description;
    }

    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public AppointmentDto() {
        
    }
}
