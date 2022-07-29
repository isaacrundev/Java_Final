package com.company_mngm_sys.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company_mngm_sys.demo.dao.ClientRepository;
import com.company_mngm_sys.demo.entity.Clients;

@Controller
@RequestMapping("/clients")
public class ClientsController {

    @Autowired
    ClientRepository clientRepo;

    @GetMapping
    public String displayClients(Model model) {
        List<Clients> clients = clientRepo.findAll();
        model.addAttribute("clientList", clients);
        return "clients/clients_list";
    }

    @GetMapping("/new")
    public String displayClientForm(Model model) {
        model.addAttribute("client", new Clients());
        return "clients/client_new";
    }

    @PostMapping("/save")
    public String createClient(Clients client) {
        clientRepo.save(client);
        return "redirect:/clients";
    }
}
