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
import com.isban.spring.mvc.service.IServicioUsuarios;
 
@Controller
public class UsuariosController {
 
    protected final Log logger = LogFactory.getLog(getClass());
    
    @Autowired
    private IServicioUsuarios servicioUsuarios;
 
    @RequestMapping(value="/usuarios.htm")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String now = (new Date()).toString();
        logger.info("Returning usuarios view with " + now);
 
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("now", now);
        myModel.put("usuarios", this.servicioUsuarios.getUsuarios());
        
        return new ModelAndView("usuarios", "model", myModel);
 
    }
    
    public void setServicioUsuarios(IServicioUsuarios servicioUsuarios) {
        this.servicioUsuarios = servicioUsuarios;
    }
    
    @RequestMapping(value="/personajesUsuario.htm")
    public ModelAndView personajesUsuario(@RequestParam("nick") String nick)
            throws ServletException, IOException {
        logger.info("Returning personajesUsuario view");
 
        Map<String, Object> myModel = new HashMap<String, Object>();
        Usuario usuario = this.servicioUsuarios.getUsuario(nick);
        List<IGuerrero> personajes = usuario.getPersonajes();
        myModel.put("personajes", personajes);
        
        return new ModelAndView("personajes", "model", myModel);
 
    }
}

