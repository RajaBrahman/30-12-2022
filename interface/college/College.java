abstract class College{
	int collId;
	String collName;
	College(String collName,int collId){
		this.collId = collId;
		this.collName = collName;
	}
	public abstract void department();
	public void display(){
		System.out.println("Clge Name : "+collName);
		System.out.println("Clge Id   : "+collId);
	}
}
class Anudip extends College{
	int noofstud;
	String department;
	Anudip(String collName,int collId,int noofstud,String department){
		super(collName,collId);
		this.noofstud = noofstud;
		this.department = department;
	}
	public void department(){
		System.out.println("Dept : "+department);
		System.out.println("No. of studs : "+noofstud);
	}
}
class MainCollege{
	public static void main(String... args){
		College col;
		col = new Anudip("NASA",60001,100,"Aerospace");
		col.display();
		col.department();
	}
}