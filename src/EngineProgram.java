/*
 * Задача на взаимодействие между классами. Разработать систему «Вступительные экзамены».
 * Абитуриент регистрируется на Факультет, сдает Экзамены. 
 * Преподаватель выставляет Оценку. Система подсчитывает средний бал и определяет 
 * Абитуриента, зачисленного в учебное заведение.
 */

import java.util.Comparator;
import java.util.Scanner;

public class EngineProgram {
	public int amountOfAbiturients = 0;
	public static final double COEF_OF_ENROLLED = 0.4;
	Scanner in;
	Faculty FAIT;
	public EngineProgram() {
		FAIT = new Faculty(); 
		in = new Scanner (System.in);  
	}
	
    public void examAbiturients() {
    	FAIT.fillTheGroup();
		FAIT.fillTheTeacher(); 
		
		int choice;
		do {
			System.out.println("Do you want to add an abiturient(1 - yes, 0 - no): ");
			choice = in.nextInt();
			if(choice == 1) {
				FAIT.addToTheFaculty();
			}
			else choice = 0;
		}while(choice == 1);
		
		exam();
		
    }
                         
    public void exam() {
		in = new Scanner(System.in);
		int mathMark;
		int CSMark; 
		int engMark;
		int i = 0;
		System.out.println("This exams takes " + FAIT.teacher.getScientificLevel() + " " + FAIT.teacher.getfName() + " " + FAIT.teacher.getlName());
		for (Student tempStud:FAIT.abiturient) {  
			tempStud = (Student) FAIT.abiturient.get(i); 
			System.out.println(tempStud.getfName() + " " + tempStud.getlName() + "'s marks: ");
			System.out.println("Mark for Math exam: ");
			mathMark = in.nextInt();
			System.out.println("Mark for Computer Science exam: ");
			CSMark = in.nextInt();
			System.out.println("Mark for English exam: ");
			engMark = in.nextInt();
			tempStud.setGradeFoMath(mathMark);
			tempStud.setGradeForComputerScience(CSMark);
			tempStud.setGradeForEnglish(engMark);
			i++;  
		}
		
	}
    
    public void countEverage() {
    	int tempEverage;
    	int i = 0; // iterator
    	for (Student tempStud:FAIT.abiturient) {
    		tempStud = (Student) FAIT.abiturient.get(i);
    		tempEverage = (tempStud.getGradeFoMath() + tempStud.getGradeForComputerScience() + tempStud.getGradeForEnglish()) / 3;
    	     tempStud.setEverageGrade(tempEverage);
    	     i++;
    	}
    }
       
    public void makeRating() {
    	FAIT.abiturient.sort(new Comparator <Student>() {
    		@Override
    		public int compare(Student o1, Student o2) {
    			if(o1.getEverageGrade() == o2.getEverageGrade()) {
    				return 0;
    			}
    				else if(o1.getEverageGrade() < o2.getEverageGrade()) {
    					return 1;
    				}
    				else return -1;
    			}
    	});
    	
    }
    
    public void whoEnroll() {
    	Student tempStud;
    	double possibleStudents = FAIT.abiturient.size() * COEF_OF_ENROLLED;
    	System.out.println("This abiturients can study in the university for free: ");
    	for(int i = 0; i < possibleStudents; i++) {
    		tempStud = (Student)FAIT.abiturient.get(i);
    		System.out.println("First Name: " + tempStud.getfName());
    		System.out.println("Second Name: " + tempStud.getlName());
    		System.out.println("Course: " + tempStud.getCourse());
    		System.out.println("Group: " + tempStud.getGroup());
    		System.out.println("Everage grade: " + tempStud.getEverageGrade());	
    	}
    }    
    
    public void ShowAllTheAbiturients() {
    	int i = 0;
    	System.out.println("Abiturients to the FAIT faculty:");
    	for ( Student tempStud:FAIT.abiturient) {
    		tempStud = (Student) FAIT.abiturient.get(i);
    		System.out.println("First Name: " + tempStud.getfName());
    		System.out.println("Second Name: " + tempStud.getlName());
    		System.out.println("Course: " + tempStud.getCourse());
    		System.out.println("Group: " + tempStud.getGroup());
    		System.out.println("Everage grade: " + tempStud.getEverageGrade());
    		i++;
    		amountOfAbiturients++;
    	}
    }
	
	
}
