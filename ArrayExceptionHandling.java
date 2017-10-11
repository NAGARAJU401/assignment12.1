package Array;
//package : Package is name that organizes a set of related classes and interfaces similar to  
//different folders on my computer
//package is Array
import java.util.Arrays;
public class ArrayExceptionHandling {
	 //public : members which can access as public,public members are visible to all other classes.
		//class : is a context of java that are used to create objects and to define object data types and methods.
		//declares a class called ArrayExceptionHandling
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
		//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		int[] Array={1,97,24,8,45,88,2,90,5,12};
		//creating an array of size 10
		int[] newArray=new int[9];
		//another array and declared an array size of 9
		for(int i=0;i<Array.length;i++)
			//here i=0 it means array starts from 0
			//i value is equal to array length which we have and this will be incremented
		{
			try
			{
				newArray[i]=Array[i];//given array is equal to new array
			}
			catch(Exception e)
			{
				System.out.println("ArrayIndexOutOfBoundsException ae");
			//Array is going out of the give size then we will have 
				//ArrayIndexOutOfBoundsException 
				}
			/*the code is prone to exceptions is placed in the try block
			 *when exception occurs that exception occurred is handled by the 
			 *catch block associated with it
			 */
		}
		System.out.println(Arrays.toString(Array));//exist array
		//system is final class
	//out is a static member of system class and type printStream
//println is method of printStream class.ln means nextline
				
		System.out.println(Arrays.toString(newArray));//copied array
		//system : system is a class in java language.lang package
	  	//out : out is the static member of system class.It's type PrintStream
	  	//println: which is used to print the output.

	}

}
