package by.epam.training.cls.task3;

public class Student {

	private String surname;
	private String group;
	private int[] grades;

	// Длина списка оценок студента.
	public static final int GRADES_LEN = 5;
	
	{
		grades = new int[GRADES_LEN];
	}

	Student() {
		this("", "");
	}
	
	Student(String surname, String group) {
		this.surname = surname;
		this.group = group;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int[] getGrades() {
		return grades;
	}

	public boolean setGrades(int[] grades) {
		
		if (grades.length == Student.GRADES_LEN) {
			this.grades = grades;
		} else {
			return false;
		}
		
		return true;
	}

	/**
	 * Проверяет, что у студента оценки выше или равны заданному уровню.
	 * 
	 * @param grade
	 * @return
	 */
	public boolean excellent(int grade) {

		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < grade) {
				return false;
			}
		}

		return true;
	}

}