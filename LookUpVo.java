package sugang;

public class LookUpVo {

	private String subject_code;
    private String target;
    private String major;
    private String division;
    private String subject;
    private String grades;
    private String professor;
    private String day;
    private String class_time;
 
    public LookUpVo() {
 
    }
 
    public LookUpVo(String subject_code, String target, String major, String division, String subject, String grades, String professor, String day, String class_time) {
        this.subject_code = subject_code;
    	this.target = target;
        this.major = major;
        this.division = division;
        this.subject = subject;
        this.grades = grades;
        this.professor = professor;
        this.day = day;
        this.class_time = class_time;
    }
    
    public String getSubCode() {
    	return subject_code;
    }
    public String getTarget() {
        return target;
    }
    public String getMajor() {
    	return major;
    }
    public String getDivision() {
    	return division;
    }
    public String getSubject() {
    	return subject;
    }
    public String getGrades() {
    	return grades;
    }
    public String getProfessor() {
        return professor;
    }
    public String getDay() {
    	return day;
    }
    public String getClass_time() {
        return class_time;
    }
}