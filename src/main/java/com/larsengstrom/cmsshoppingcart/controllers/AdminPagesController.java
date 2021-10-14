package com.larsengstrom.cmsshoppingcart.controllers;

import java.util.List;

import com.larsengstrom.cmsshoppingcart.models.PageRepository;
import com.larsengstrom.cmsshoppingcart.models.data.Page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/pages")
public class AdminPagesController {
        
    private PageRepository pageRepo;

    public AdminPagesController(PageRepository pageRepo) {
            this.pageRepo = pageRepo;
    }

    @GetMapping //Our path is implied through @RequestMapping
    public String index(Model model){
        
        List<Page> pages = pageRepo.findAll();

        model.addAttribute("pages", pages);

        return "admin/pages/index";
    }

}
