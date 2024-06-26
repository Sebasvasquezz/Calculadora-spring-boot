package com.example.calculadora;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * This class is a Spring MVC Controller for handling calculator operations.
 */
@Controller
public class CalculadoraController {
    double resultado = 0.0;

    /**
     * Handles GET requests to the /calculadora endpoint.
     * Displays the calculator view.
     *
     * @return the name of the template to be rendered, in this case "calculadora".
     */
    @GetMapping("/calculadora")
    public String mostrarCalculadora() {
        return "calculadora";
    }

    /**
     * Handles POST requests to the /calcular endpoint.
     * Performs the specified arithmetic operation and updates the result.
     *
     * @param numero1 the number to be used in the calculation, defaults to 0 if not provided.
     * @param operacion the operation to be performed, defaults to "+" if not provided.
     * @param model the model object used to pass attributes to the view.
     * @return the name of the template to be rendered, in this case "calculadora".
     */
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

