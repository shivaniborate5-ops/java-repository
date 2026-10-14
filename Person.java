package Assignment1;
import java.util.Scanner;
class Person {
    int pid;
    String pname;
    int age;
    String gender;
    Person() {
        this.pid = 0;
        this.pname = "Unknown";
        this.age = 0;
        this.gender = "Unknown";
    }

    Person(int pid, String pname, int age, String gender) {
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        this.gender = gender;
    }
    void display() {
        System.out.println(pid + "\t" + pname + "\t" + age + "\t" + gender);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] p = new Person[5];
        for (int i = 0; i < 2; i++) {
            System.out.println("\nEnter Person " + (i + 1) + " details:");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Gender: ");
            String gender = sc.next();
            p[i] = new Person(id, name, age, gender);
        }
        System.out.println("\nPerson Details:");
        System.out.println("ID\tName\tAge\tGender");
        for (int i = 0; i < 2; i++) {
            p[i].display();
        }
        sc.close();
    }
}