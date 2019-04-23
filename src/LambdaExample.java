import java.io.FileFilter;

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testable s= ()->System.out.print("hello");
		s.display();
		Addition add=(q,p)->q+p;
		System.out.println("\n"+add.add(1, 6));
	}

}
interface Addition{
	public int add(int a,int b);
}