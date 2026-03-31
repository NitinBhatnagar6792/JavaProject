package test.courses.in28minutes;

public class TestRecords {

	record Person (String name, String email, String phoneNumber) {
		
		// custom constructor
		Person (String name, String email, String phoneNumber) {
			this.name = name;
			this.email = email;
			if (phoneNumber.startsWith("+91")) {
				this.phoneNumber = phoneNumber;
			} else {
				this.phoneNumber = "+91"+phoneNumber;
			}
		}
		
		public String name() {
			System.out.println("Name is "+name);
			return name;
		}
	}

	record Employee (String name, String email, String phoneNumber) {
		
		// compact constructor with just validations
		Employee  {
			if (name == null) throw new IllegalArgumentException("name is null");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("A", "A@gmail.com", "98111");
		System.out.println("p="+p);
		System.out.println("p.name()="+p.name());
		Person p1 = new Person("A", "A@gmail.com", "98111");
		Person p2 = new Person("B", "A@gmail.com", "98111");
		System.out.println("p.equals(p1)="+p1.equals(p1)); // all value equals so true
		System.out.println("p.equals(p2)="+p1.equals(p2));
	}

}
