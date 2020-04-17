package com.cap.fetchservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.cap.fetchservice.service.FetchEmpService;
@RestController
@RequestMapping("/emp")
@CrossOrigin("http://localhost:4200")
		public class FetchEmpController  {
	@Autowired
	  FetchEmpService empService;
	      @GetMapping("/find/{id}")
	      public Object findEmployee(@PathVariable Integer id) {
	    	  return empService.findEmployee(id);
	      }
			
			
}
