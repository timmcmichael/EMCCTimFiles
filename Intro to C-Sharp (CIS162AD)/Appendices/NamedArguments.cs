/*
 * This example shows a method call using named arguments.
 */
public class Program
{
    public static void Main()
    {
        {
            double amount = TotalBill(tipPercentage: 18.0, tax: 1.0, meal: 100.0);
            Console.WriteLine(amount);
        }
        static double TotalBill(double meal, double tax, double tipPercentage)
        {
            return meal + (meal * tax / 100) + (meal * tipPercentage / 100);
        }

    }
}
