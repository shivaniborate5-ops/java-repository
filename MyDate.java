package Assignment1;

public class MyDate {
		    int dd,mm,yy;
		     MyDate(){
		        dd=1;
		        mm=1;
		        yy=2026;
		    }

		     MyDate(int dd,int mm,int yy) {
		        this.dd=dd;
		        this.mm=mm;
		        this.yy=yy;
		    }

		    void display() {
		        System.out.println(dd+"-"+mm+"-"+yy);
		    }

		    public static void main(String args[]) {
		        MyDate d1=new MyDate();
		        MyDate d2=new MyDate(21,8,2026);

		        System.out.println("Default Date:");
		        d1.display();

		        System.out.println("Parameterized Date:");
		        d2.display();
		    }
		
	}


