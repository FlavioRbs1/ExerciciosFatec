package com.controledocumentos.controledocumentos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControleDocumentosController {

	@RequestMapping("/CadastrarDocumento")
	public String form() {
		return "controle/formDocumento";
	}
}