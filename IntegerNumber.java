package Assignment1;

public class IntegerNumber {
	    private int num;

	    IntegerNumber(int num) {
	        this.num=num;
	    }

	    void square() {
	        System.out.println("Square="+(num*num));
	    }

	    void cube() {
	        System.out.println("Cube=*"+(num*num*num));
	    }

	    public static void main(String args[]) {
	        int n = Integer.parseInt(args[0]);
	        IntegerNumber obj=new IntegerNumber(n);
	        obj.square();
	        obj.cube();
	    }
}