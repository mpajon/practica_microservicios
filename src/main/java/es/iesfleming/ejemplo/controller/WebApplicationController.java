package es.iesfleming.ejemplo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApplicationController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	String inicio() {
		return "<h1>Hola mundo</h1><p>WebApplicationController</p>";
	}
}
