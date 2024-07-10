package it.ludo.pizzeria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.ludo.pizzeria.repository.PizzaRepo;

@Controller
@RequestMapping("/")
public class controllerPizza {

    @Autowired
    private PizzaRepo pizzaRepo;

    @GetMapping("/menu")
    public String pizze(Model model) {
        model.addAttribute("pizze", pizzaRepo.findAll());
        return "pizzeria/index";
    }
}
