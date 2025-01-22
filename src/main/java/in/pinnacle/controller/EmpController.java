package in.pinnacle.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;
import in.pinnacle.model.Emp;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class EmpController {
    List <Emp> empList = new ArrayList<>();
    
    @GetMapping("/emp")
    public String getEmp(@RequestParam("id") int id, Model model) {
        return "emp";
        }
        @PutMapping("/emp")
        public String updateEmp(@RequestBody Emp emp) {
            empList.set(emp.getId(), emp);
            return "redirect:/emp";
            }
            @PostMapping("/emp")
            public String addEmp(@RequestBody Emp emp) {
                empList.add(emp);
                return "redirect:/emp";
            }
            // @DeleteMapping
            // public String deleteEmp(@RequestParam("id") int id) {
            //     empList.removeIf(e -> e.getId() == id);
            //     return "redirect:/emp";
            //     }

           
    
}
