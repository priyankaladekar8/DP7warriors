package Conatainment.java;

public class Player {
	private int playerid;
	 private String name;
	  private Country country;
	
	Player ()
	{
		
	}
	Player(int playerid,String name, Country course)
	{
		this.playerid=playerid;
		this.name=name;
		 Country country;
	}
	
	public int getPlayerid()
	{
		return playerid;
	}
	public void setPlayerid(int id)
	{
		this.playerid=playerid;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public Country getCountry()
	{
		return country;
	}
	public void setCountry(Country country)
	{
		this.country=country;
	}
	public String toString()
	{
		return "playerDetails: "+"playerid: "+playerid+" "+"name: "+name+ "Country: "+country;
	}
}


