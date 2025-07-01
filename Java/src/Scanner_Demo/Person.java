package Scanner_Demo;

public class Person {
		
		//data members
		private String name;
		private int Income;
		private String Gender;
		private int Age;
		private long MobileNumber;
		private int tax;
		
		//getter and setter
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIncome() {
			return Income;
		}
		public void setIncome(int income) {
			Income = income;
		}
		public String getGender() {
			return Gender;
		}
		public void setGender(String gender) {
			Gender = gender;
		}
		public int getAge() {
			return Age;
		}
		public void setAge(int age) {
			Age = age;
		}
		public long getMobileNumber() {
			return MobileNumber;
		}
		public void setMobileNumber(long mobileNumber) {
			MobileNumber = mobileNumber;
		}
		public int getTax() {
			return tax;
		}
		public void setTax(int tax) {
			this.tax = tax;
		}
		
		//object class methodd returns string representation of person object
		@Override
		public String toString() {
			return "Person [name=" + name + ", Income=" + Income + ", Gender=" + Gender + ", Age=" + Age
					+ ", MobileNumber=" + MobileNumber + ", tax=" + tax + "]";
		}
		
		
		

	

}
