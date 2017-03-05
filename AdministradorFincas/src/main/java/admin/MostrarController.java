package admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MostrarController {

	@RequestMapping("/mostrar")
	public String mostrar(@RequestParam int numComunidad, Model model) {

		Comunidad comunidad = TablonController.comunidades.get(numComunidad);

		model.addAttribute("comunidad", comunidad);

		return "mostrar";
	}
}