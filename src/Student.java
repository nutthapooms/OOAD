/**
 * Created by nutth on 10/28/2018.
 */
public class Student {
    int x ;
    public  String name;

    public Student(String name) {
        this.name = name;
    }

    public Student(int x) {
        this.x = x;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
