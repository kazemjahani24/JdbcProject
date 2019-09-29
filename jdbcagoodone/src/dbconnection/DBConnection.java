
package dbconnection;
import java.util.List;
import student.Student;
import studentrepository.StudentRepository;


public class DBConnection {

	public static void main(String[] args)  {
			
			//the lines below are to fetch the whole table from data
			// in the line below we used StudentRepository.getAllStudent to say that we are Accessing the getAllStudents which is in class StudentRepository
			List<Student> studentList = StudentRepository.addstudents();
	
			for(Student std : studentList) {
				System.out.print(std.getId() +"  ");
				System.out.print(std.getName()+"  ");
				System.out.print(std.getEmail()+"  ");
				System.out.print(std.getWeight()+"  ");
				System.out.println("");
			}
		
		/*
			// the lines below are to fetch one row from the database using java
		
			StudentInsert student = StudentRepositInsert.getStudentById(2);
			
			System.out.print(student.getId() +"  ");
			System.out.print(student.getSalary()+"  ");
			System.out.print(student.getName()+"  ");
			System.out.print(student.getSurname()+"  ");
		*/
		
		/*
			//in the line below since we have an argument inside addstudent in the studentrepository , we have to create the object here
			Student std = new Student();
			std.setName("nas");
			std.setEmail("nas@gmail");
			std.setWeight(66);
		//int id=7;
		//int salary=7544;
//		String name="nazi";
//		String surname="naziii";
		
	
	//	StudentRepository.insertStudent(std);
		System.out.println("data added");
		
		*/

	}

	}



