package com.company_mngm_sys.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company_mngm_sys.demo.dao.ClientRepository;
import com.company_mngm_sys.demo.entity.Clients;

@RestController
@RequestMapping("/clients")
public class ClientsController {

    @Autowired
    ClientRepository clientRepo;

    @GetMapping("/new")
    public String displayClientForm(Model model) {
        model.addAttribute("clients", new Clients());
        return "/clients_new";
    }

    @PostMapping("/save")
    public String createClient(Clients client) {
        clientRepo.save(client);
        return "redirect:/clients";
    }
}
