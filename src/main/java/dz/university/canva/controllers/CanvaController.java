package dz.university.canva.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dz.university.canva.models.CanvaResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import dz.university.canva.models.Canva;
import dz.university.canva.models.CanvaParent;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping(value = "/api/canva")
public class CanvaController {
	
	Map<String, List<CanvaParent>> canvaMap = new HashMap<>();
	List<Canva> canvas = null;

	CanvaResponse canvaResponse = new CanvaResponse();
	
	{
		
		canvas = Arrays.asList(
				new Canva("1", "Vente de Marchandises", 70.0, 100.28, 100.28, 500.30, 50.0, 700.0, 500.0, 80.20, 50.0, new ArrayList<>()),
				new Canva("2", "Ventes de produits finis et intermédiaires", 70.0, 100.28, 100.28, 500.30, 50.0, 700.0, 500.0, 80.20, 50.0, new ArrayList<>()),
				new Canva("3", "Vente de travaux", 70.0, 100.28, 100.28, 500.30, 50.0, 700.0, 500.0, 80.20, 50.0, new ArrayList<>()),
				new Canva("4", "Vente d'études", 70.0, 100.28, 100.28, 500.30, 50.0, 700.0, 500.0, 80.20, 50.0, new ArrayList<>()),
				new Canva("5", "Autres (703,708 et 709)", 70.0, 100.28, 100.28, 500.30, 50.0, 700.0, 500.0, 80.20, 50.0, new ArrayList<>())
		);
		Canva Parent = new Canva("6", "Chiffre d'Affaires = (1)+(2)+(3)+(4)+(5)", 70.0, 100.28, 100.28, 500.30, 50.0, 700.0, 500.0, 80.20, 50.0, new ArrayList<>());

		canvas.get(0).setParent(Parent);
		canvas.get(1).setParent(Parent);
		canvas.get(2).setParent(Parent);
		canvas.get(3).setParent(Parent);
		canvas.get(4).setParent(Parent);

		canvaResponse.setData(canvas);
	}
	
	
	
		
	@GetMapping(value = {"/{key}/", "/{key}"})
	@ApiOperation(value = "find canva by id", notes = "provide the canva id to get the response", response = Canva.class)
	public CanvaParent findByKey(@PathVariable String key) {
		return null;
	}
	
	@GetMapping(value = {"", "/"})
	@CrossOrigin(origins="http://localhost:3000")
	@ApiParam(value = "this method allows you to get all the canvas")
	public CanvaResponse findAll() {
		return canvaResponse;
	}
	
	@PutMapping(value = {"", "/"})
	@CrossOrigin(origins="http://localhost:3000")
	@ApiParam(value = "this method allows you to get all the canvas")
	public CanvaParent update(@RequestBody CanvaParent canva) {

		return null;
	}
	
	
}
