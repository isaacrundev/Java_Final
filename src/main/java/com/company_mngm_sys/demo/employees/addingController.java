package com.company_mngm_sys.demo.employees;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // employeeをaddする用のクラス
@RequestMapping("/employee") // URLとコントローラーのクラスまたはメソッドを紐づけることができるアノテーション
// employeeの下に下記の表示されます(request by default)

public class addingController {

    @RequestMapping(value = "/add", method = RequestMethod.GET) // user_entry
    public String addEmployee() {
        return "<form action=\"/employee/list\">\n" // ここのpathも変えておく
                + "<label for=\"fname\">First name:</label><br>\n"
                + "<input type=\"text\" id=\"fname\" name=\"fname\"><br>\n"
                + "<label for=\"lname\">Last name:</label><br>\n"
                + "<input type=\"text\" id=\"lname\" name=\"lname\"><br><br>\n"
                + "<input type=\"submit\" value=\"Submit\">\n"
                + "</form> ";
    };

    @RequestMapping("/list") // formから得たpath
    public String listEmployee(@RequestParam String fname, @RequestParam String lname) {
        return "This is lists of employees" + fname + "" + lname;
    };

    @RequestMapping("/{id}")
    public String id(@PathVariable String id) {
        return "Employee ID: " + id;
    };

    @RequestMapping("/{id}/department")
    public List<String> displayStringJson() {
        return Arrays.asList("HR", "IT", "Customer servise");
    }

   //json dataをここに作ることができる


}
