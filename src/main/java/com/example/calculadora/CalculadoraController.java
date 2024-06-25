package com.example.calculadora;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculadoraController {
    double resultado = 0.0;

    @GetMapping("/calculadora")
    public String mostrarCalculadora() {
        return "calculadora";
    }

    @PostMapping("/calcular")
    public String calcular(
            @RequestParam(name = "numero1", required = false, defaultValue = "0") double numero1,
            @RequestParam(name = "operacion", required = false, defaultValue = "+") String operacion,
            Model model) {

        switch (operacion) {
            case "+":
                resultado = resultado + numero1;
                break;
            case "-":
                resultado = resultado - numero1;
                break;
            case "*":
                resultado = resultado * numero1;
                break;
            case "/":
                if (numero1 != 0) {
                    resultado = resultado / numero1;
                } else {
                    model.addAttribute("error", "División por cero no permitida");
                    return "calculadora";
                }
                break;
            case "AC":
                resultado = 0.0;
                break;
        }

        model.addAttribute("resultado", resultado);
        return "calculadora";
    }
}

