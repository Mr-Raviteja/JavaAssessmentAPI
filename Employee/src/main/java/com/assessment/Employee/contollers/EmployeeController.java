package com.assessment.Employee.contollers;

import com.assessment.Employee.entities.EmployeeDetailsEntity;
import com.assessment.Employee.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class EmployeeController {
    @Autowired
    IEmployeeService iEmployeeService;


    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public ResponseEntity<EmployeeDetailsEntity> createOrUpdateEmp(@RequestBody EmployeeDetailsEntity employeeDetailsEntity) {

        return ResponseEntity.ok().body(iEmployeeService.createEmployeeDetailsEntity(employeeDetailsEntity));
    }

    @RequestMapping(value = "/employees/{empId}", method = RequestMethod.PUT)
    public ResponseEntity<EmployeeDetailsEntity> createOrUpdateEmp(@RequestBody EmployeeDetailsEntity employeeDetailsEntity, @PathVariable Long empId) throws Exception {
        return ResponseEntity.ok().body(iEmployeeService.updateEmployeeDetailsEntity(employeeDetailsEntity));
    }


    @RequestMapping(value = "/employees/{empId}", method = RequestMethod.GET)
    public ResponseEntity<EmployeeDetailsEntity> getEmployeeById(@PathVariable Long empId) throws Exception {

        return ResponseEntity.ok().body(iEmployeeService.getEmployeeDetailsEntityById(empId));
    }

    @RequestMapping(value = "/employees/{empId}", method = RequestMethod.DELETE)
    public HttpStatus deleteEmployee(@PathVariable Long empId) throws Exception {
        iEmployeeService.deleteEmployeeDetailsEntity(empId);
        return HttpStatus.OK;
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public ResponseEntity<List<EmployeeDetailsEntity>> getAllEmployees() {

        return ResponseEntity.ok().body(iEmployeeService.getAllEmployeeDetailsEntity());
    }

    @RequestMapping(value = "/employees/hello", method = RequestMethod.GET)
    public ResponseEntity<String> getWelcomPage() throws Exception {

        return ResponseEntity.ok().body("Welcome To Grab a bite");
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Boolean authGaurd() throws Exception {

        return true;
    }
    /*@RequestMapping(value = "/login", method = RequestMethod.POST)
    @CrossOrigin(origins = "*")
    public Boolean authGaurd(@RequestParam("email") String email,@RequestParam("password") String password) throws Exception {
       if ("admin".equals(email) && "admin".equals(password))
            return true;
        else
          return false;
    }*/

}
