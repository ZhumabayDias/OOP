package example;

public class Ex2 {
	public static void main(String[] args)
    {
	int        i, ratio;
	int[]      numbers = {100,10,0,5,2,8,0,30};
	i = 0;
	for (i=0; i < numbers.length-1; i++)
     {
	try
        {
		ratio = numbers[i] / numbers[i+1];
		System.out.println(numbers[i]+"/"+numbers[i+1]+"="+ratio);
	} 
        catch (ArithmeticException ae)
        {
	    System.out.println("Couldn't calculate "+
			       numbers[i]+"/"+numbers[i+1]);
	}
    }
}
}