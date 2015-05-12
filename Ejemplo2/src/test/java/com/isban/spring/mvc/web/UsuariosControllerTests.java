package com.isban.spring.mvc.web;
 
import static org.junit.Assert.*;
 
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;
 
 
public class UsuariosControllerTests {
 
    @Test
    public void testHandleRequestView() throws Exception{		
    	UsuariosController controller = new UsuariosController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull(nowValue);
 
    }
 
}

