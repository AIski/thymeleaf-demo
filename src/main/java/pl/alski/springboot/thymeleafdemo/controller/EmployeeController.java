package pl.alski.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.alski.springboot.thymeleafdemo.entity.Employee;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/employees")
public class EmployeeController {


private List<Employee> theEmployees;

@PostConstruct
private void LoadData(){

    //create employees
    Employee emp1= new Employee(1, "Leslie", "Andrews", "leslie@luv2code.com");
    Employee emp2= new Employee(1, "Mark", "Davids", "mark@luv2code.com");
    Employee emp3= new Employee(1, "John", "Green", "john@luv2code.com");
    Employee emp4= new Employee(1, "Micheal", "Watson", "michael@luv2code.com");
    Employee emp5= new Employee(1, "Edward", "Patterson", "edward@luv2code.com");

    theEmployees=new ArrayList<>();

    //add to list
    theEmployees.add(emp1);
    theEmployees.add(emp2);
    theEmployees.add(emp3);
    theEmployees.add(emp4);
    theEmployees.add(emp5);
}

    @GetMapping("/list")
    public String listEmployees(Model theModel) {
    theModel.addAttribute("employees", theEmployees);
    return "list-employees";
    }




}
