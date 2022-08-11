package com.example.demo.controller;


import com.example.demo.model.Personas;
import com.example.demo.model.repository.PersonasDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Inicio {

    @Autowired
    private PersonasDao dao;

    @RequestMapping("/")
    public String index(Model model){

        Iterable<Personas> todos = dao.findAll();

        for (Personas p: todos
             ) {
            System.out.println(p.getNombre());

        }
        model.addAttribute("todos", todos);

        return "index";

    }

}
