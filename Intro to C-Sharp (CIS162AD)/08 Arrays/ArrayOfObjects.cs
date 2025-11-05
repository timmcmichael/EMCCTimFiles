/* 
 * This program demonstrates how to create an array of objects using Dog.cs.
 * 
 * NOTE: This is the code that was completed by the end of the video. There is no starter code other than Dog.cs.
 * 
 */

using ArrayOfObjects;

Dog d1 = new Dog("Fifi", 3);
// Dog[] dogs = new Dog[4];
//
// dogs[0] = new Dog("Fido", 4);
// dogs[1] = new Dog("Rover", 8);
// dogs[2] = new Dog("Spike", 2);
// dogs[3] = d1;

Dog[] dogs = { d1, new Dog("Fido", 4), new Dog("Rover", 8),
    new Dog("Spike", 2) };

// Console.WriteLine(d1.Name);

for (int i = 0; i < dogs.Length; i++)
{
    Console.WriteLine(dogs[i].Name);
}

Console.WriteLine($"{dogs[1].Name}'s cleanliness: {dogs[1].CheckSmell()}");
dogs[1].PlayOutside();
Console.WriteLine($"{dogs[1].Name}'s cleanliness: {dogs[1].CheckSmell()}");

dogs[1].Age++;
