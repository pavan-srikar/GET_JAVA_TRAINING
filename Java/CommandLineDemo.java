/* Java program that takes command line arguments for input*/

class CommandLineDemo
{
	public static void main(String[] args){
		int number1,number2,sum;
		String name;

		name=args[0];
		number1=Integer.parseInt(args[1]);
		number2=Integer.parseInt(args[2]);

		sum=number1+number2;

		System.out.println(name+" is a java programmer");
		System.out.println("The Sum of 2 Numbers is :"+sum);
}}