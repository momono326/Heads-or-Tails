import java.util.Scanner;
class HeadandTail
{
    public static void main(String args[])
    {
	int n, r;
	int h = 0, t = 0;

	Scanner sc = new Scanner(System.in);
	System.out.println("Who are you?");
	String name = sc.nextLine();
	System.out.println("Hello, " + name);
	System.out.println("Tossing a coin...");
	for(int i = 0; i < 3; i++)
	    {
		n = (int)(Math.random()*2); //0.0以上2.0未満の整数をランダムでnに代入
		r = i + 1;
	  
		System.out.print("Round" + r + ": ");
		if(n == 0)
		    {
			System.out.println("Heads");
			h++;
		    }
		if(n == 1)
		    {
			System.out.println("Tails");
			t++;
		    }
	    }
	System.out.println("Heads: " + h + ", Tails: " + t) ;

	if(h > t) System.out.println(name + " won!");
	if(t > h) System.out.println(name + " lost.");
    }
}
