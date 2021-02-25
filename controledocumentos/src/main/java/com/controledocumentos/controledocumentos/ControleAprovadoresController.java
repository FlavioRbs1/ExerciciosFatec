package com.controledocumentos.controledocumentos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControleAprovadoresController {

	@RequestMapping("/aprovadores")
	public String form() {
		return "controle/formAprovadores";
	}
	
}
