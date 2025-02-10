/*
 * This class represents a simplified K-12 student record, with a name, age, grade level (1-12), and school type (elementary, middle school, or high school).
 * 
 * It demonstrates the use of if-else statements in an object-oriented context, including encapsulation and data validation.
 * 
 */
package module05;

public class K12Student {
    private String name;
    private int age;
    private int gradeLevel;

    // Constructors

    public K12Student(String name, int age) {
        this.name = name;
        this.setAge(age);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public String getSchoolType() {
        if (this.gradeLevel == 0) {
            return "kindergarten";
        } else if (this.gradeLevel < 6) {
            return "elementary school";
        } else if (this.gradeLevel < 9) {
            return "middle school";
        } else {
            return "high school";
        }
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
        if (this.age < 6) {
            this.age = 6;
        }
        if (this.age > 18) {
            this.age = 18;
        }
        this.gradeLevel = this.age - 6;
    }

}