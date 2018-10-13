/*
 * Задача на взаимодействие между классами. Разработать систему «Вступительные экзамены».
 * Абитуриент регистрируется на Факультет, сдает Экзамены. 
 * Преподаватель выставляет Оценку. Система подсчитывает средний бал и определяет 
 * Абитуриента, зачисленного в учебное заведение.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Faculty implements PastExam {

	 Scanner in;
	 public ArrayList<Student> group;
	 public Teacher teacher;
	 public Faculty() {
		 group = new ArrayList<>();
		 teacher = new Teacher();
	 }

	 public void fillTheGroup() {
		 Student[] tempStud = new Student[5];
		 tempStud[0].setfName("Ivan");
		 tempStud[0].setlName("Kotielnikov");
		 tempStud[0].setCourse(3);
		 tempStud[0].setGroup("IUST");
		 
		 tempStud[1].setfName("Misha");
		 tempStud[1].setlName("Dolinskiy");
		 tempStud[1].setCourse(3);
		 tempStud[1].setGroup("IUST");
		 
		 tempStud[2].setfName("Denis");
		 tempStud[2].setlName("Mantach");
		 tempStud[2].setCourse(3);
		 tempStud[2].setGroup("IUST");

		 tempStud[3].setfName("Anna");
		 tempStud[3].setlName("Yatsiuta");
		 tempStud[3].setCourse(3);
		 tempStud[3].setGroup("IUST");

		 tempStud[4].setfName("Tasya");
		 tempStud[4].setlName("Girich");
		 tempStud[4].setCourse(3);
		 tempStud[4].setGroup("IUST");
		 
		 for ( int i = 0; i < 5; i++) {
			 group.add(tempStud[i]);
		 }
	 }
	 
	 public void fillTheTeacher() {
		 teacher.setfName("Olga");
		 teacher.setlName("Bondarchuk");
		 teacher.setAge(35);
		 teacher.setScientificLevel("doctor");
	 }
	 
	 
	public void exam() {
		in = new Scanner(System.in);
		int mathMark;
		int CSMark;
		int engMark;  
		//Student tempStud = new Student();
		System.out.println("This exams takes " + teacher.getScientificLevel() + " " + teacher.getfName() + " " + teacher.getlName());
		for ( int i = 0; i < group.size(); i++) {
			Student tempStud = group.get(i);
			System.out.println("Mark for Math exam: ");
			mathMark = in.nextInt();
			System.out.println("Mark for Computer Science exam: ");
			CSMark = in.nextInt();
			System.out.println("Mark for English exam: ");
			engMark = in.nextInt();
			tempStud.setGradeFoMath(mathMark);
			tempStud.setGradeForComputerScience(CSMark);
			tempStud.setGradeForEnglish(engMark);
			group.add(i, tempStud);
			
		}
		
	}
	
	
}
