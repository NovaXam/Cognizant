/**
 * Created by student on 3/7/18.
 */
public class Main {
    public static void main(String [] args) {
        Dog dog = new Dog("wow");
        dog.makeSound();
        Poodle poodleDog = new Poodle("poodle ");

        //override method
        poodleDog.makeSound();

        //overload method
        poodleDog.makeSound(6.43);

        ((Poodle)transformer()).makeSound(7);
        ((Poodle)transformer()).makeSound();

        School newSchool = School.getSchool();
        newSchool.addStudent(new Student("Vlad", 6));
        newSchool.addStudent(new Student("Max", 36));

        newSchool.getStudents();
    };
    public static Dog transformer() {
        return new Poodle("");

    };
};
