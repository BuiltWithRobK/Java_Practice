class If
{
	public static void main ( String[] args )
	{
		if (5 > 1) System.out.println("Five is greater than one.") ;
		if (2 < 4) 
			{
				System.out.println("Two is less than four.") ;
				System.out.println("Test Succeeded.") ;
			}
		int num = 2 ;
		if (((num > 5) && (num < 10)) || (num == 12))
		System.out.println("Number 6-9 inclusive, or 12") ;
	}
}