/* 
 * This shows an optional argument. In the TotalBill method, tipPercentage is optional. Since it 
 * has a default value, we can call the method without providing a value for that parameter.
 */
double amount = TotalBill(100.0);  // amount = 120.0
double amount2 = TotalBill(100.0, 18.0);  // amount2 = 118.0
 
Console.WriteLine(amount);
Console.WriteLine(amount2);
 
public static double TotalBill(double meal, double tipPercentage = 20.0) {
		return meal + (meal * tipPercentage/100);
}
