package com.example.pcbang.controller;

import com.example.pcbang.entity.Menu;
import com.example.pcbang.repository.MenuRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MenuController {

    private final MenuRepository menuRepository;

    public MenuController(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @GetMapping("/menu")
    public String showMenu(Model model) {
        List<Menu> menuList = menuRepository.findAll();
        model.addAttribute("menuList", menuList);
        return "menu"; // templates/menu.html
    }
    
    @GetMapping("/menu/add")
    public String showAddForm() {
        return "add-menu"; // templates/add-menu.html
    }

    @PostMapping("/menu/add")
    public String addMenu(@RequestParam String name, @RequestParam int price) {
        Menu menu = new Menu();
        menu.setName(name);
        menu.setPrice(price);
        menuRepository.save(menu);
        return "redirect:/menu";
    }

}
