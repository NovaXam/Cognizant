/**
 * Created by student on 3/7/18.
 */
public class Teacher {
    private String name;
    private String profession;

    public Teacher(String name, String profession) {
        this.name = name;
        this.profession = profession;
    };

    public String getTeacherName(){
        return this.name;
    };

    public String getTeacherProfession(){
        return this.profession;
    };
}
