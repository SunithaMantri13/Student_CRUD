package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentService {
	
@Autowired 
private StudentRepository repository;

public List<Student> getAllStudentdetails()
{
	return repository.findAll();
}
public Optional<Student> getById(Long id)
{
	return repository.findById(id);
}
public Student Saving(Student stud)
{
	return repository.save(stud);
}
public void deleteStudent(Long id) {
    repository.deleteById(id);
}
public Student UpdateDetails(Long id, Student UpdatedStudent)
{
  Optional<Student> existingStudent = repository.findById(id);
  if(existingStudent!=null)
  {
	  Student UpdatedStudent1= existingStudent.get();
	  UpdatedStudent1.setStudentName(UpdatedStudent.getStudentName());
	  UpdatedStudent1.setStudentEMail(UpdatedStudent.getStudentEMail());
	  UpdatedStudent1.setStudentAddress(UpdatedStudent.getStudentAddress());	  
  }
  return null;
}
}
