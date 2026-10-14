package Assignment1;
import java.util.Scanner;
class Customer {
    int cid;
    String cname;
    double billAmount;
    Customer(int cid, String cname, double billAmount) {
        this.cid = cid;
        this.cname = cname;
        this.billAmount = billAmount;
    }

    void display() {
        System.out.println(cid + "\t" + cname + "\t" + billAmount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        Customer[] c = new Customer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Customer " + (i + 1) + " details:");
            System.out.print("Customer ID: ");
            int id = sc.nextInt();
            System.out.print("Customer Name: ");
            String name = sc.next();
            System.out.print("Bill Amount: ");
            double bill = sc.nextDouble();
            c[i] = new Customer(id, name, bill);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (c[i].billAmount > c[j].billAmount) {
                    Customer temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }

        System.out.println("\nCustomers in Ascending Order:");
        System.out.println("ID\tName\tBill");
        for (int i = 0; i < n; i++) {
            c[i].display();
        }
        sc.close();
    }
}