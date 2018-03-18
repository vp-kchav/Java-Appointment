/*
 * Created on March 17, 2018
 */
package assessment.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import assessment.test.domain.AppointmentDto;
import assessment.test.services.AppointmentService;

@Controller
@SessionAttributes("currentUser")
public class HomeController {

    @Autowired
    public AppointmentService appointmentService;

    @RequestMapping(value = { "/", "/index", "/home" }, method = RequestMethod.GET)
    public String index(@ModelAttribute("appointmentDto") AppointmentDto appointment,Model model) {
       System.out.println(appointmentService.getClass());
//       Appointment app = new Appointment();
//       app.setDescription("something 2");
//       app.setAppointmenDate(new Date());
//       app.setAppointmentTime(new Date());
//       appointmentService.save(app);
       return "home";
    }
    
}
