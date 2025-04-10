Console.Write("What is your name? ");
string name = Console.ReadLine();

Console.Write("How many Beatles albums do you own? ");
int albums = Convert.ToInt32(Console.ReadLine());

Console.WriteLine($"Hello {name}, you have {albums} Beatles albums.");
