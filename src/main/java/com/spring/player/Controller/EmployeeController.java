package com.spring.player.Controller;

import com.spring.player.dao.EmployeeDAO;
import org.springframework.web.bind.annotation.RequestMapping;

public class EmployeeController {

    private EmployeeDAO employeeDAO;

    @RequestMapping("/show")
    public void  showemployee()
    {

        employeeDAO.findAll();


    }
}
