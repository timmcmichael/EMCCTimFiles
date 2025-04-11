/*
 * This program outputs a few basic facts about Ella Fitzgerald.
 *
 * It demonstrates "string interpolation" to easily output variable values, and it shows how to use an
 * "escape sequence."
 */
 
 string name = "Ella Fitzgerald";
 int birthYear = 1917;
 int deathYear = 1996;

 int ageAtDeath = deathYear - birthYear;
 
 Console.WriteLine($"{name} was born in {birthYear} and died in {deathYear}.");
 Console.WriteLine($"She was {ageAtDeath} years old at the time of her death.");
 Console.WriteLine("She was known as the \"First Lady of Song\"");
 Console.WriteLine("She is considered one of the\nbest scat singers of all time.");