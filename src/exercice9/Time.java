package exercice9;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		hour = 0;
		minute = 0;
		second = 0;
	}
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String toString() {
		if (hour < 10){
			if ( minute < 10) {
				if (second < 10) {
					return	"0" + hour + ":"+ "0"+ minute+ ":" + "0" + second;
				}
				return	"0" + hour + ":"+ "0"+ minute + ":" + second ;
			}
			return	"0" + hour+ ":" +  minute+ ":" + second ;
		}
		return hour + ":" + minute+":" + second ;
	}
	
	public Time nextSecond() {
	    this.second++;
	    if (this.second == 60) {
	        this.second = 0;
	        this.minute++;
	        if (this.minute == 60) {
	            this.minute = 0;
	            this.hour = (this.hour + 1) % 24;
	        }
	    }
	    return this;  
	}

	public Time previousSecond() {
	    this.second--;
	    if (this.second < 0) {
	        this.second = 59;
	        this.minute--;
	        if (this.minute < 0) {
	            this.minute = 59;
	            this.hour = (this.hour - 1 + 24) % 24;
	        }
	    }
	    return this; 
	}
	
	

}
