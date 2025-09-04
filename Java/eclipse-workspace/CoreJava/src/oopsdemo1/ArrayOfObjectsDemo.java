package oopsdemo1;

/**
 * Author :Jetty.Srikar
 * Date :Sep 3, 2025
 * Time :10:53:16 AM
 *project : projCoreJava
 */
class Faculty{
	int empId;
	String name;

	public void setData(int c,String d){
		this.empId=c;
		this.name=d;
	}

	public void showData(){
		System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
		System.out.println();
	}
}
public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		// Create array of Faculty members
		Faculty[] obj=new Faculty[5];

		for (int i = 0; i < 5; i++) {
			obj[i]=new Faculty();
		}

		//assign data to faculty Objects
		obj[0].setData(100, "JAMES");
		obj[1].setData(1600, "FGD");
		obj[2].setData(1050, "JAFSSMES");
		obj[3].setData(16700, "JHFJDF");
		obj[4].setData(1090, "SUFFG");

		// display Faculty Object Data
		System.out.println("************** Faculty Details **************");
		for(int i=0; i<5; i++) {
			obj[i].showData();
		}
		System.out.println("*********************************************");

	}

}
