/*
 * Created on Dec 9, 2017
 */
package assessment.unit.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import assessment.test.services.AppointmentService;


public class AppointmentTest {

    public AppointmentTest() {
        // TODO Auto-generated constructor stub
    }

    @Autowired
    AppointmentService appointmentService;
    
    @Test
    @SuppressWarnings("resource")
    public void testAddSeries() { //seriesService
//        ApplicationContext context = new ClassPathXmlApplicationContext("DispatcherServlet-context-test.xml");
////        AppointmentService appointmentService = (AppointmentService) context.getBean("AppointmentService",AppointmentServiceImpl.class);
//        System.out.println("success" + appointmentService.getClass());
    }

}
