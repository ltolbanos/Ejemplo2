package com.isban.spring.mvc.web;
 
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.isban.spring.mvc.domain.Usuario;
import com.isban.spring.mvc.service.IGuerrero;
import com.isban.spring.mvc.service.IServicioPersonajes;
 
@Controller
public class PersonajesController {
 
    protected final Log logger = LogFactory.getLog(getClass());
    
    @Autowired
    private IServicioPersonajes servicioPersonajes;
 
    @RequestMapping(value="/personajes.htm")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String now = (new Date()).toString();
        logger.info("Returning personajes view with " + now);
 
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("now", now);
        myModel.put("personajes", this.servicioPersonajes.getPersonajes());
        
        return new ModelAndView("personajes", "model", myModel);
 
    }
    
    public void setServicioUsuarios(IServicioPersonajes servicioPersonajes) {
        this.servicioPersonajes = servicioPersonajes;
    }
}

