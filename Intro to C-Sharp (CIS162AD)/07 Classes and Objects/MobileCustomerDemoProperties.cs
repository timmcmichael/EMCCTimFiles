/*
 * MobileCustomerDemo
 * 
 * Tests and demonstrates functionality of the CellCustomer class by instantiating objects
 * and using their instance methods.
 * 
 * NOTE: This is a copy of the CellCustomerDemo class, renamed for the video on constructors.
 * 
 */

using OOPDemo;

MobileCustomer customer1;
customer1 = new MobileCustomer("Deadpool", "800-867-5309", 16.0);
MobileCustomer customer2 = new MobileCustomer("Ryan Reynolds", "555-555-5555");

//customer1.SetName("Deadpool");
//customer1.SetPhoneNumber("800-867-5309");
//customer1.SetMonthlyData(20.0);
//customer2.SetName("Ryan Reynolds");

Console.WriteLine(customer1.Name);
customer1.Name = "Spiderman";
Console.WriteLine(customer1.Name);
Console.WriteLine(customer1.MonthlyData);
Console.WriteLine($"Customer 2's monthly data: {customer2.MonthlyData}");
customer2.MonthlyData = -5.4;
Console.WriteLine($"Customer 2's monthly data: {customer2.MonthlyData}");
customer2.MonthlyData = 5.4;
Console.WriteLine($"Customer 2's monthly data: {customer2.MonthlyData}");


Console.WriteLine(customer1.PhoneNumber);
Console.WriteLine(customer1.RemainingData);
Console.WriteLine(customer2.MonthlyData);

customer1.UseData(2.5);
customer1.AddData(1.25);
Console.WriteLine($"Remaining data: {customer1.RemainingData}");

customer1.ResetData();
Console.WriteLine($"After reset: {customer1.RemainingData}");

Console.WriteLine("----------------");
Console.WriteLine("Customer 2: ");
Console.WriteLine(customer2.Name);
Console.WriteLine(customer2.PhoneNumber);
Console.WriteLine(customer2.RemainingData);
Console.WriteLine(customer2.MonthlyData);

customer1.EmailAddress = "test@deadpool.com";
Console.WriteLine(customer1.EmailAddress);
