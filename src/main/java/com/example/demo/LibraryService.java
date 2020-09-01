package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

	
	List<Library> library=new ArrayList<Library>();

		@Autowired
		BookRepositry Repo;
	
	
public List<Library> getDetails()
{
	ArrayList<Library> Alldetails =new ArrayList<>();
	
	Repo.findAll().forEach(Alldetails::add);
	return Alldetails;
}

public Optional<Library> getStudentDetail(String name)
{
	return Repo.findById(name);
}


public void addStudent(Library Student)
{
	Repo.save(Student);
}

public void deleteStudent(String name)
{
	Repo.deleteById(name);
}



public void updateStudent(Library updateDetails, String name) {
	// TODO Auto-generated method stub
	
		Repo.save(updateDetails);
}

}
