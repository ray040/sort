package au.org.ray;

import java.util.*;

public class Sort {
	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<Student>();

		studentList.add(new Student(33, "Tina", 3.68));
		studentList.add(new Student(85, "Louis", 3.85));
		studentList.add(new Student(56, "Samil", 3.75));
		studentList.add(new Student(19, "Samar", 3.75));
		studentList.add(new Student(22, "Lorry", 3.76));

		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if (s2.getCgpa() > s1.getCgpa()) {
					return 1;
				} else if (s2.getCgpa() < s1.getCgpa()) {
					return -1;
				}
				return s1.getFname().compareTo(s2.getFname());
			}
		});

		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}
}

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}
