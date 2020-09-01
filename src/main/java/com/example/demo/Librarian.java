package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Librarian {
	@Autowired
	private LibraryService lib;
	
	@CrossOrigin
	@RequestMapping("/Details")
	public List<Library> Books()
	{
		return lib.getDetails();
		
	}
	
	@CrossOrigin
	@RequestMapping("/Details/{name}")
	public Optional<Library> StudentDetails(@PathVariable String name)
	{
		return lib.getStudentDetail(name);
	}
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.POST, value="/Details")
	public void addDetail(@RequestBody Library L)
	{
		lib.addStudent(L);
	}
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.DELETE, value="Details/{name}")
	public void deregsiter(@PathVariable String name)
	{
		lib.deleteStudent(name);
	}
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.PUT, value="/Details/{name}")
	public void updateDetails(@RequestBody Library updatedBok, @PathVariable String name)
	{
		lib.updateStudent(updatedBok,name);
	}

}
