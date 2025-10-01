/*
 * CellCustomerDemo
 * 
 * Tests and demonstrates functionality of the CellCustomer class by instantiating objects
 * and using their instance methods.
 * 
 */

using OOPDemo;

CellCustomer customer1;
customer1 = new CellCustomer();
CellCustomer customer2 = new CellCustomer();

customer1.SetName("Deadpool");
customer1.SetPhoneNumber("800-867-5309");
customer1.SetMonthlyData(20.0);
customer2.SetName("Ryan Reynolds");

Console.WriteLine(customer1.GetName());
Console.WriteLine(customer1.GetPhoneNumber());
Console.WriteLine(customer1.GetRemainingData());
Console.WriteLine(customer2.GetMonthlyData());

customer1.UseData(2.5);
customer1.AddData(1.25);
Console.WriteLine($"Remaining data: {customer1.GetRemainingData()}");

customer1.ResetData();
Console.WriteLine($"After reset: {customer1.GetRemainingData()}");

Console.WriteLine("----------------");

Console.WriteLine(customer2.GetName());

