package Controlador;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller 
public class Controlador {
    
    @RequestMapping(value="/")
    public String inicio(){
      //  return "registro"; // para ver el registro (1.2)
        return "inicio"; //para ver el iniciar sesión (1.1)
    }
    
    @RequestMapping(value="/ini", method = RequestMethod.GET)
    public ModelAndView inicio(ModelMap model,HttpServletRequest request){
        String p = request.getParameter("correo");
        String p2 = request.getParameter("pass");
        model.addAttribute("persona",p+"<br>"+p2);
        return new ModelAndView("ini",model);
    
    }
    
    @RequestMapping(value="/reg", method = RequestMethod.GET)
    public ModelAndView registro(ModelMap model,HttpServletRequest request){
        String p,p1,p2,p3,p4;
        p = request.getParameter("nombre");
        p1 = request.getParameter("carrera");
        p2 = request.getParameter("fecha");
        p3 = request.getParameter("correo");
        p4 = request.getParameter("pass");
       
        model.addAttribute("persona", p+"<br>"+p1+"<br>"+p2+"<br>"+p3+"<br>"+p4+"<br>");
        return new ModelAndView("reg",model);
    
    }
}
