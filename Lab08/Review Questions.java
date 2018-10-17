
    1. 	if x, y and z are int variables with following values assigned 5, 6, and 4 respectively
	evaluate the following:

	(x + z) % y

	(x * z) % y

2.	System.out.println((int)17.5%5 + 13 - 5); output?

3. 	Write as java expression:

	(b^2 - 4ac) / 2a

	F = (9/5)c + 32

4. 	Write the java code to copy the value of a double variable z to the nearest integer into an int
	variable x.
    
    
    int x = (int)Math.round(z);
    // int x = Math.round(z);  this will return long data type;
    


5.	swap the contents of int variables x and y
    
    int x = 5;
    int y = 10;
    int temp = x;
    x = y;
    y = temp;




6.	int a = 5;
	int b = 6;
	int c = 0;

	Provide the values of the variables a, b and c after these statements.
					a		b		c
	a = b++ + 3;			9_______	_7________	_0________
            // b++ -> 6
	c = 2*a + (++b);		_5_______	_7________	__17_______
            // ++b -> 7
	b = 2*(++c) - (a++);		__6______	__-3_______	__1_______
            // ++c  -> 1, a++ ->5
    
7. 	int a = 3, b = 5;
	double c = 14.1;
					a		b		c
	c /= a;				________	_________	_________
	b += (int)c - a;		________	_________	_________
	a *= 2*b + (int)c;		________	_________	_________

8. 	if(6 < 2*5)
		System.out.println("Hello");
		System.out.println("Hola");

		output?

9.	int j = 6;
	if (j++ == 7)
		System.out.println("Hello");
	else
		System.out.println("Hola");

10. Difference between primitive and object reference variables.

	1) primitive: any of 8 primitive data types; variables other than 8 primitive types are object. 
	2) primitive variables are stored in the memory locations, object stores id


11. String str = "Hello World";

	char ch;
	int len;
	int position;

	ch = str.charAt(0);				value in ch?	// Hello World
	ch = str.charAt(10);				value in ch?	// l
	len = str.length();				value in len?	// 11
	position = str.indexOf('r');			value in position?	//8
	System.out.println(str.substring(6,11)); 	output?		// World

12. String x = "10.95";
	How would extract the double value 10.95 from the above string and store it in double variable y?
		

13. evaluate the expressions:
	(17 < 4 * 3 + 5) || (8*2 == 4*4) && !(3 + 3 == 6)
	________________________________    _____________
			True			False
			_____________________________
				    False


	11 > 5 || (6 < 15 && 7 >= 8)

14. Create an object of the class Auto using the constructor with the following API. Set the model to
	Tesla and miles driven to 1000 and the gear type is automatic and not stick shift.

	Auto (String make, double milesDriven, boolean isStickshift)

		Auto myCar = new Auto( "Tesla", 1000, false );


15. On the above object call the following method with the given API.

	public	void  setMilesDriven(double newMiles)

		myCar.setMilesDriven( 2000 );


16. Integer x = 10; demonstrates what concept?

17. if x = 0;
	x = (x > 0 && x < 10)? 10 : 20;
	what is the value of x?

18. Division by zero
	System.out.println(0/0.0);
	System.out.prinltn(9/0);
	System.out.println(9.0/0);

19. Declare a constant of appropriate type to store the value of a quarter as cents.

20. Generate random number between 10 and 20 store the value in a variable x of int type.

21. SimpleDate x = new SimpleDate(10,4,2014);
	SimpleDate y = new SimpleDate(10,4,2014);

	System.out.println(x.equals(y)); output?
	System.out.println(x == y); output?
	x = y;
	System.out.println(x.equals(y)); output?
	System.out.println(x == y); output?

22. Demonstrate a call to the method with the following API belonging to the class Example
	public static double someMethod(char x, double y)


23. Use DeMorgan's laws to provide equivalent conditional
	expression:
	(x >= 0) && (x < 100)

