package br.com.accenture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalculatorController {

	@GetMapping(path = { "/calculator", "/" })
	public String calculator() {
		return "calculator";
	}
}
