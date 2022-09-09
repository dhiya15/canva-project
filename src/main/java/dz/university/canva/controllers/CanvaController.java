package dz.university.canva.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dz.university.canva.models.Canva;
import dz.university.canva.models.CanvaParent;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping(value = "/api/canva")
public class CanvaController {
	
	Map<String, List<CanvaParent>> canvaMap = new HashMap<>();
	List<CanvaParent> canvas = null;
	
	{
		
		canvas = Arrays.asList(
				new CanvaParent("0", new Canva("6", "Chiffre d'Affaires = (1)+(2)+(3)+(4)+(5)", 70.0, 100.28, 100.28, 500.30, 50.0, 700.0, 500.0, 80.20, 50.0), new ArrayList<>()),
				new CanvaParent("0-0", new Canva("1", "Vente de Marchandises", 70.0, 100.28, 100.28, 500.30, 50.0, 700.0, 500.0, 80.20, 50.0), new ArrayList<>()),
				new CanvaParent("0-1", new Canva("2", "Ventes de produits finis et intermédiaires", 70.0, 100.28, 100.28, 500.30, 50.0, 700.0, 500.0, 80.20, 50.0), new ArrayList<>()),
				new CanvaParent("0-2", new Canva("3", "Vente de travaux", 70.0, 100.28, 100.28, 500.30, 50.0, 700.0, 500.0, 80.20, 50.0), new ArrayList<>()),
				new CanvaParent("0-3", new Canva("4", "Vente d'études", 70.0, 100.28, 100.28, 500.30, 50.0, 700.0, 500.0, 80.20, 50.0), new ArrayList<>()),
				new CanvaParent("0-4", new Canva("5", "Autres (703,708 et 709)", 70.0, 100.28, 100.28, 500.30, 50.0, 700.0, 500.0, 80.20, 50.0), new ArrayList<>())
		);
		
		canvaMap.put("root", Arrays.asList(
				canvas.get(0)
			)
		);
		
		canvaMap.get("root").get(0).getChildren().add(canvas.get(1));
		canvaMap.get("root").get(0).getChildren().add(canvas.get(2));
		canvaMap.get("root").get(0).getChildren().add(canvas.get(3));
		canvaMap.get("root").get(0).getChildren().add(canvas.get(4));
	}
	
	
	
		
	@GetMapping(value = {"/{key}/", "/{key}"})
	@ApiOperation(value = "find canva by id", notes = "provide the canva id to get the response", response = Canva.class)
	public CanvaParent findByKey(@PathVariable String key) {
		for(int i=0; i<canvas.size(); i++) {
			if(canvas.get(i).getKey().equals(key)) {
				return canvas.get(i);
			}
		}
		return null;
	}
	
	@GetMapping(value = {"", "/"})
	@ApiParam(value = "this method allows you to get all the canvas")
	public Map<String, List<CanvaParent>> findAll() {
		return canvaMap;
	}
	
	@PutMapping(value = {"", "/"})
	@ApiParam(value = "this method allows you to get all the canvas")
	public CanvaParent update(@RequestBody CanvaParent canva) {
		for(int i=0; i<canvas.size(); i++) {
			if(canvas.get(i).getKey().equals(canva.getKey())) {
				canvas.set(i, canva);
				return canvas.get(i);
			}
		}
		return null;
	}
	
	
}
