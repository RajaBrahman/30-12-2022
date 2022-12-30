interface func
{
	static void display(){
	
      System.out.println("This collection of kits is in the list of matrial");
	
      }
	void arrays(String[] kits);
}
class demo{
	public static void main(String[] args)
	{
	String Matrials[]={"punching bags","sympads","headgear","gloves"};
	func.display();
  //lamnda experssion implemented
	func k=(String[]kits)->{
		for(String x:kits)
	{
	 System.out.println(x);
	}

	};

	
      k.arrays(Matrials);
	
    }
}