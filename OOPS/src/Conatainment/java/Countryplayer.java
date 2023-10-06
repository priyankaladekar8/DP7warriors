package Conatainment.java;

public class Countryplayer {
	public static void main(String args[]) {
	

	
	Country c1=new Country( );
	//Country c2=new Country(102, "delhi" );
	//c1.setId(101);
//c1.setName("mumbai");
	
	
	Player p1=new Player();
	//Player p2=new Player( 2, "dipti" , c2);
	p1.setPlayerid(11);
	p1.setName("Dhoni");
	p1.getCountry().setId(101);
	p1.getCountry().setName("mumbai");
	
	
	
	
   //System.out.println(c1.getId()," " + c1.getName());
   //System.out.println("--------");
   //System.out.println(p1.getPlayerid(), " " +p1.getName());
	
}	
}


