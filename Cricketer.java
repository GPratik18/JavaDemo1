import java.util.Scanner;
class CricketerMain{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 to create Batsman and 2 to create Bowler");
		int choice = sc.nextInt();
		sc.close();

		Cricketer c;
		if(choice == 1){
			c=new Batsman("India","Rohit Sharma",4,2);
		}
		else {
			c=new Bowler("India","Irfan Pathan",4,2);
		}
		c.print();
		System.out.println("Some trial changes for git trials");
	}

}
class Cricketer {
	private String country;
	private String playerName;
	public Cricketer(String country, String playerName){
		this.country=country;
		this.playerName=playerName;
	}
	public void print(){
		System.out.println("Country name :"+country);
		System.out.println("Player name  :"+playerName);
	}
}

class Bowler extends Cricketer{
	private int wickets;
	private int runsGiven;
	public Bowler (String country,String playerName,int wickets,int runsGiven){
		super(country,playerName);
		this.wickets=wickets;
		this.runsGiven=runsGiven;
	}
	public void print(){
		super.print();
		System.out.println("Number of wickets  :"+wickets);
		System.out.println("Number of runs given :"+runsGiven);
	}
}

class Batsman extends Cricketer{
	private int no50s;
	private int no100s;
	public Batsman(String country,String playerName,int no50s,int no100s){
		super(country,playerName);
		this.no50s=no50s;
		this.no100s=no100s;
	}
	public void print(){
		super.print();
		System.out.println("Number of 50s  :"+no50s);
		System.out.println("Number of 100s :"+no100s);
	}
}