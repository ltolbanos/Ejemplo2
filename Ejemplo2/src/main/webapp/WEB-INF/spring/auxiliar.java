//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.isban.spring.mvc.domain.LoginForm;
//import com.isban.spring.mvc.domain.Usuario;
//import com.isban.spring.mvc.service.IGuerrero;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.Scope;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class MiClase{
	...
}


//@Controller
//@RequestMapping("miVistaPrincipal/*")
//public class miController {
//	@RequestMapping("miVistaSecundariaA")
//	public String miMetodoControladorA(ModelMap model) {
//		...
//	}
//	@RequestMapping("miVistaSecundariaB")
//	public String miMetodoControladorA(ModelMap model) {
//		...
//	}
//}
//
//
//@RequestMapping("miVistaPrincipal/miVistaSecundariaA")
//public String miMetodoControladorA(ModelMap model) {
//	...
//}
//@RequestMapping("miVistaPrincipal/miVistaSecundariaB")
//public String miMetodoControladorA(ModelMap model) {
//	...
//}
//
//
///miUrl?miId=valor
//
//@RequestMapping(value="/miUrl")
//public String miMetodoControlador(@RequestParam("miId") String miId){
//  ...
//
//}
//
//
///miUrl/miId
//
//@RequestMapping(value="/miUrl/{miId}")
//public String miMetodoControlador(@PathVariable String miId){
//	...
//}
//
//
//
//@RequestMapping("loginform")
//public class LoginFormController {
//}
//
//@RequestMapping(method = RequestMethod.GET)
//public String miMetodoControlador(ModelMap model) {
//	...
//}
//
//
//public String showForm(ModelMap model) {
//	LoginForm loginForm = new LoginForm();
//	model.addAttribute("loginForm", loginForm);
//	return "nombreVista";
//}
//
//public ModelAndView showForm() {
//	Model myModel = new Model();
//	myModel.put("atributos", atributos);
//	return new ModelAndView("nombreVista", "model", myModel);
//}
















