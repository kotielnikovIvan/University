/*
 * Задача на взаимодействие между классами. Разработать систему «Вступительные экзамены».
 * Абитуриент регистрируется на Факультет, сдает Экзамены. 
 * Преподаватель выставляет Оценку. Система подсчитывает средний бал и определяет 
 * Абитуриента, зачисленного в учебное заведение.
 */

public class Teacher {

	private String fName;
	private String lName;
	private String scientificLevel;
	private int age;
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getScientificLevel() {
		return scientificLevel;
	}
	public void setScientificLevel(String scientificLevel) {
		this.scientificLevel = scientificLevel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
