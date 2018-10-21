/*
 * Задача на взаимодействие между классами. Разработать систему «Вступительные экзамены».
 * Абитуриент регистрируется на Факультет, сдает Экзамены. 
 * Преподаватель выставляет Оценку. Система подсчитывает средний бал и определяет 
 * Абитуриента, зачисленного в учебное заведение.
 */

public class Student {
    private String fName;
    private String lName;
    private String group;
    private int course;
    private int gradeFoMath;
    private int gradeForComputerScience;
    private int gradeForEnglish;
    private int everageGrade;
      
	public int getEverageGrade() {
		return everageGrade;
	}
	public void setEverageGrade(int everageGrade) {
		this.everageGrade = everageGrade;
	}
	public int getGradeFoMath() {
		return gradeFoMath;
	}
	public void setGradeFoMath(int gradeFoMath) {
		this.gradeFoMath = gradeFoMath;
	}
	public int getGradeForComputerScience() {
		return gradeForComputerScience;
	}
	public void setGradeForComputerScience(int gradeForComputerScience) {
		this.gradeForComputerScience = gradeForComputerScience;
	}
	public int getGradeForEnglish() {
		return gradeForEnglish;
	}
	public void setGradeForEnglish(int gradeForEnglish) {
		this.gradeForEnglish = gradeForEnglish;
	}
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
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}

}
