package thecseguide.com;


/* @author www.thecseguide.com

This class will be used to hold the data of every student we display
in recycle-view

*/

public class studentDataClass {

    String name;
    int Age;
    int Marks;

    public studentDataClass(String name, int age, int marks) {
        this.name = name;
        Age = age;
        Marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }
}
