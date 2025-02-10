/*
 * This program demonstrates the K12Student class.
 *
 * NOTE: This is the completed code at the end of the video (and doesn't compile due to the filename change). See K12Student.java for the starter file.
 */
package module05;

public class K12StudentDemo {     // This is the finished file, not the starter!

        public static void main(String[] args) {
                // K12Student student1 = new K12Student();
                // student1.setName("Vanessa");
                // student1.setAge(4);
                K12Student student1 = new K12Student("Vanessa", 5);
                System.out.println("Age = " + student1.getAge());
                System.out.println(student1.getName() + " is a(n) " + student1.getSchoolType() + " student in grade "
                                + student1.getGradeLevel());

                // K12Student student2 = new K12Student();
                // student2.setName("Carlos");
                // student2.setAge(10);
                K12Student student2 = new K12Student("Carlos", 10);
                System.out.println(student2.getName() + " is a(n) " + student2.getSchoolType() + " student in grade "
                                + student2.getGradeLevel());

                // K12Student student3 = new K12Student();
                // student3.setName("Ling");
                // student3.setAge(15);
                K12Student student3 = new K12Student("Ling", 15);
                System.out.println(student3.getName() + " is a(n) " + student3.getSchoolType() + " student in grade "
                                + student3.getGradeLevel());

                // K12Student student4 = new K12Student();
                // student4.setName("Jeff");
                // student4.setAge(122);
                K12Student student4 = new K12Student("Jeff", 122);
                System.out.println(student4.getName() + " is a(n) " + student4.getSchoolType() + " student in grade "
                                + student4.getGradeLevel());

                System.out.println("Correcting Jeff's age...");
                student4.setAge(12);
                System.out.println(student4.getName() + " is a(n) " + student4.getSchoolType() + " student in grade "
                                + student4.getGradeLevel());
        }

}
