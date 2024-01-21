package testi1;

import java.util.Scanner;

public class ObjectsClockTimeProgram {
	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 ClockTime clockTime = new ClockTime();
		 System.out.print("Enter hours to add: ");
		 int hours = Integer.parseInt(input.nextLine());
		 while (hours >= 0) {
		 System.out.print("Enter minutes to add: ");
		 int minutes = Integer.parseInt(input.nextLine());
		 clockTime.add(hours, minutes);
		 System.out.println(clockTime + "\n");
		 System.out.print("Enter hours to add: ");
		 hours = Integer.parseInt(input.nextLine());
		 }
		 input.close();
	}
	
	public static class ClockTime {
		
		int hours;
		int minutes;
		
		public ClockTime() {
			this.hours = 0;
			this.minutes = 0;
		}
		
		public void add(int hours, int minutes) {
			if (hours >= 0 && minutes >= 0) {
				this.hours = this.hours + hours;
				this.minutes = this.minutes + minutes;
				if (this.minutes > 59) {
					int division = this.minutes / 60;
					this.hours = this.hours + division;
					this.minutes = this.minutes - division * 60;
				}
				if (this.hours > 23) {
					int division = this.hours / 24;
					this.hours = this.hours - division * 24;
				}
			}
		}
		
		@Override
		public String toString() {
			String hours;
			if (this.hours < 10) {
				hours = "0" + this.hours;
			} else {
				hours = Integer.toString(this.hours);
			}
			String minutes;
			if (this.minutes < 10) {
				minutes = "0" + this.minutes;
			} else {
				minutes = Integer.toString(this.minutes);
			}
			return hours + ":" + minutes;
		}
	}
}
