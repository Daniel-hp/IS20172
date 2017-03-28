package Controlador;

import Mapeo.Persona;
import Mapeo.User;
import Modelo.PersonaDAO;
import Modelo.UserDAO;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller 
public class Controlador {
       
    @Autowired
    UserDAO user_db ;
    PersonaDAO persona_db;
    
    @RequestMapping(value="/")
    public String inicio(){
        return "registro"; // para ver el registro (1.2)
      //  return "inicio"; //para ver el iniciar sesión (1.1)
    }
    
    @RequestMapping(value="/user", method = RequestMethod.GET)
    public ModelAndView user(ModelMap model,HttpServletRequest request){
        String p = request.getParameter("correo");
        User usuario = user_db.getPersona(p);
        
        String info = "";
        if (usuario == null){
            model.addAttribute("info", info+"No se encontro ningun usuario con ese correo");
        }else{
            model.addAttribute("info", info+"El usuario es");
            model.addAttribute("usuario", usuario);
        }
        return new ModelAndView("ini2",model);
    
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
        User usuario = new User();
        Persona pers = new Persona();
        p = request.getParameter("nombre");
        p1 = request.getParameter("carrera");
        p2 = request.getParameter("fecha");
        p3 = request.getParameter("correo");
        p4 = request.getParameter("pass");
        pers.setNombre(p);
        pers.setCarrera(p1);
        pers.setFecha(p2);
        usuario.setCorreo(p3);
        usuario.setPassword(p4);
        user_db.guardar(usuario);
       persona_db.guardar(pers);
        model.addAttribute("persona", p+"<br>"+p1+"<br>"+p2+"<br>"+p3+"<br>"+p4+"<br>");
        return new ModelAndView("reg",model);
    
    }
}
