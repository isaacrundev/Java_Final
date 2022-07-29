//employee controleer

package com.company_mngm_sys.demo.employees;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company_mngm_sys.demo.dao.repository;

import net.bytebuddy.asm.Advice.Return;

@Controller // employeeをaddする用のクラス
@RequestMapping("/employees") // URLとコントローラーのクラスまたはメソッドを紐づけることができるアノテーション
// employeeの下に下記の表示されます(request by default)

public class addingController {

    // @RequestMapping(value = "/add", method = RequestMethod.GET) // user_entry
    // public String addEmployees() {
    // return "<form action=\"/employees/list\">\n" // ここのpathも変えておく
    // + "<label for=\"fname\">First name:</label><br>\n"
    // + "<input type=\"text\" id=\"fname\" name=\"fname\"><br>\n"
    // + "<label for=\"lname\">Last name:</label><br>\n"
    // + "<input type=\"text\" id=\"lname\" name=\"lname\"><br><br>\n"
    // + "<input type=\"submit\" value=\"Submit\">\n"
    // + "</form> ";
    // };

    // @RequestMapping("/list") // formから得たpath
    // public String listEmployee(@RequestParam String fname, @RequestParam String
    // lname) {
    // return "This is lists of employees" + fname + "" + lname;
    // };

    // Return "html/list-employees";

    @Autowired
    repository repo;

    @GetMapping // lists
    public String displayEmployees(Model model) {
        List<Employees> employees = repo.findAll();
        model.addAttribute("employees", employees);

        return "employees/list-employees";
    }

    @GetMapping("/new")
    public String displayEmployeeForm(Model model) {
        model.addAttribute("employees", new Employees());
        return "employees/new-employees";
    }

    @PostMapping("/save")
    public String createEmployees(Employees employees) {
        repo.save(employees);
        return "redirect:/employees"; // コロンはリクエストを返す
    }

}
