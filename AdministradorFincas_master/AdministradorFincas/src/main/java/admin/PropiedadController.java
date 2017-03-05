package admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PropiedadController {
	public static List<Propiedad> propiedades = new ArrayList<>();
	

	@RequestMapping("/")
	public String tablon(Model model) {
			
		model.addAttribute("propiedades", propiedades);

		return "tablon";
	}

}