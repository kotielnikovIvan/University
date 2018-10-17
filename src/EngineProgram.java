/*
 * Задача на взаимодействие между классами. Разработать систему «Вступительные экзамены».
 * Абитуриент регистрируется на Факультет, сдает Экзамены. 
 * Преподаватель выставляет Оценку. Система подсчитывает средний бал и определяет 
 * Абитуриента, зачисленного в учебное заведение.
 */

import java.util.Scanner;

public class EngineProgram {
	
	Scanner in;
	Faculty FAIT;
	public EngineProgram() {
		FAIT = new Faculty();
		in = new Scanner (System.in);  
	}
	
    public void findRating() {
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
		
		FAIT.exam();
		
    }
	
	
}
