/*
 * Created on March 17, 2018
 */
package assessment.test.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import assessment.test.domain.Appointment;
import assessment.test.domain.AppointmentDto;
import assessment.test.factory.AppointmentFactory;
import assessment.test.repository.AppointmentRepository;


@Controller
public class AppointmentController {

    @Autowired
    AppointmentRepository appointmentRepository;
    
    public AppointmentController() {
    }
        
    @RequestMapping(value ="/ajaxSearchAppointement", method=RequestMethod.POST)
    public @ResponseBody List<Appointment> searchMovie(Model model, @RequestBody String textSearch) {
        List<Appointment> result = new  ArrayList<Appointment>();
        result = appointmentRepository.findByDescription(textSearch);
        return result;
    }

   @PostMapping(value="/addAppointment")
   public String addAppointment(@Valid @ModelAttribute("appointmentDto") AppointmentDto appointmentDto, BindingResult result,Model model ) {
       if(result.hasErrors()) {
           return "home";
       }
       Appointment app = AppointmentFactory.getInstance().createAppointmentFromDto(appointmentDto);
       appointmentRepository.save(app);
       return "redirect:/home";
   }
   
}
