//Write a Java program to input cost price and selling price of a product and check profit or loss.

Write a Java program to check whether a year is leap year or not.

int SP, CP;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the cost price and selling price");
SP = sc.nextInt();
CP = sc.nextInt();

String result = (SP > CP )? "profit ": "Loss ";
System.out.println(result);
}
}