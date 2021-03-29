package sugang;

public class ScheduleVo {
	private String subject;
	private String day;
	private int class_time;

	public ScheduleVo() {

	}

	public ScheduleVo(String subject, String day, int class_time) {
		this.subject = subject;
		this.day = day;
		this.class_time = class_time;
	}

	public String getSubject() {
		return subject;
	}

	public String getDay() {
		return day;
	}

	public int getClass_time() {
		return class_time;
	}
}
