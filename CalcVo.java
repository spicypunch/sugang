package sugang;

public class CalcVo {
	private String subject;
	private String grades;
	
	public CalcVo() {
		
	}
	public CalcVo(String subject, String grades) {
		this.subject = subject;
		this.grades = grades;
	}
	public String getSubject() {
		return subject;
	}

	public String getGrades() {
		return grades;
	}
	
}
