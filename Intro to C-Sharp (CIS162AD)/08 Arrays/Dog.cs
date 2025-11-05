/* 
 * This class models a Dog object to demonstrate storing objects in an array. The demonstration program is
 * ArrayOfObjects.cs.
 * 
 */

namespace ObjectArrays; // Change to match your project

public class Dog
{
    // Properties
    public string Name
    {
        get;
        set;
    }

    public int Age
    {
        get;
        set;
    }

    public bool IsClean
    {
        get;
        set;
    }

    // Constructor
    public Dog(string name, int age) {
        this.Name = name;
        this.Age = age;
        this.IsClean = true;
    }

    // Getters (Accessors)

    public string CheckSmell() {
        if (this.IsClean) {
            return "Smells clean!";
        } else {
            return this.Name + " stinks!";
        }
    }

    // Modifiers (Mutators)
    public void PlayOutside() {
        this.IsClean = false;
    }

    public void HaveABirthday() {
        this.Age++;
    }

    public void VisitGroomer() {
        this.IsClean = true;
    }
}
