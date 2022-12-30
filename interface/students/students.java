class CusExcep extends Exception{
    CusExcep(String str)
	{
	   super(str);
	}
	static String stud_name[]={"chan","Alan","Nebula","santo","christina"};
	static int id[]={01,02,03,04,05};
	static int marks[]={86,97,66,76,90};
	static double att[]={98,77,65,59,80};
	
}
class Mainstudents{
    public static void main(String...args){
	    for(int i=0;i<CusExcep.marks.length;i++){
		  try{
		       System.out.println("Student Name  :"+CusExcep.stud_name[i]+"\t"+ "Student Id :"+CusExcep.id[i]+"\t"+"Marks :"+CusExcep.marks[i]+"\t"+ "Attendance :"+CusExcep.att[i]);  
			     if(CusExcep.att[i]<60)
				 {
					 throw new CusExcep(CusExcep.stud_name[i]+"Secured less than 60 attendance");
                               
				 }
                }
				 catch(CusExcep e)
				 {
					System.out.println(e.getMessage()); 
				 }
		     

		}
	}
}