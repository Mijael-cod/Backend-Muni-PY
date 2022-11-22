package upeu.edu.pe.backendlogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.backendlogin.entity.Os;
import upeu.edu.pe.backendlogin.service.OsService;

@RestController
@RequestMapping("/api/os")
@CrossOrigin({"*"})
public class OsController {
	
	@Autowired
	private OsService osService;
	
	@GetMapping
	public List<Os> getList(){
		return osService.readAll();
	}
	

}
