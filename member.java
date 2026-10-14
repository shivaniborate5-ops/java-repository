package Staff;


	import java.util.Scanner;

	abstract class Staff {
	    String name, address;

	    Staff(String name, String address) {
	        this.name = name;
	        this.address = address;
	    }

	    abstract double calculateSalary();

	    void displayBasicDetails() {
	        System.out.println("Name    : " + name);
	        System.out.println("Address : " + address);
	    }
	}

	class FullTimeStaff extends Staff {
	    String department;
	    double salary, HRA, DA;

	    FullTimeStaff(String name, String address, String department, double salary) {
	        super(name, address);
	        this.department = department;
	        this.salary = salary;
	        HRA = salary * 0.08;
	        DA = salary * 0.05;
	    }

	    double calculateSalary() {
	        return salary + HRA + DA;
	    }

	    void display() {
	        displayBasicDetails();
	        System.out.println("Department : " + department);
	        System.out.println("Basic Salary : " + salary);
	        System.out.println("HRA (8%) : " + HRA);
	        System.out.println("DA (5%) : " + DA);
	        System.out.println("Total Salary : " + calculateSalary());
	    }
	}

	class PartTimeStaff extends Staff {
	    int hours;
	    double ratePerHour;

	    PartTimeStaff(String name, String address, int hours, double ratePerHour) {
	        super(name, address);
	        this.hours = hours;
	        this.ratePerHour = ratePerHour;
	    }

	    double calculateSalary() {
	        return hours * ratePerHour;
	    }

	    void display() {
	        displayBasicDetails();
	        System.out.println("Number of Hours : " + hours);
	        System.out.println("Rate per Hour : " + ratePerHour);
	        System.out.println("Total Salary : " + calculateSalary());
	    }
	}

	public class member {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of staff: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        Staff[] staff = new Staff[n];

	        for (int i = 0; i < n; i++) {
	            System.out.println("\n1. Full-Time Staff");
	            System.out.println("2. Part-Time Staff");
	            System.out.print("Enter your choice: ");
	            int choice = sc.nextInt();
	            sc.nextLine();

	            System.out.print("Enter Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Address: ");
	            String address = sc.nextLine();

	            if (choice == 1) {
	                System.out.print("Enter Department: ");
	                String department = sc.nextLine();

	                System.out.print("Enter Salary: ");
	                double salary = sc.nextDouble();
	                sc.nextLine();

	                staff[i] = new FullTimeStaff(
	                    name, address, department, salary
	                );

	            } else {
	                System.out.print("Enter Number of Hours: ");
	                int hours = sc.nextInt();

	                System.out.print("Enter Rate per Hour: ");
	                double rate = sc.nextDouble();
	                sc.nextLine();

	                staff[i] = new PartTimeStaff(
	                    name, address, hours, rate
	                );
	            }
	        }

	        System.out.println("\n===== FULL-TIME STAFF =====");

	        for (Staff s : staff) {
	            if (s instanceof FullTimeStaff) {
	                ((FullTimeStaff) s).display();
	                System.out.println("----------------------");
	            }
	        }

	        System.out.println("\n===== PART-TIME STAFF =====");

	        for (Staff s : staff) {
	            if (s instanceof PartTimeStaff) {
	                ((PartTimeStaff) s).display();
	                System.out.println("----------------------");
	            }
	        }

	        sc.close();
	    }
	}


