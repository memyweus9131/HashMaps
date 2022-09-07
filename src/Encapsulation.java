public class Encapsulation {

    private String name;
    private int id;
    private int age;
    private String grade;


    public void setName(String newName) {
        this.name = newName;
    }
    public void setId(int newId) {
        this.id = newId;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }
    public void setGrade(String newGrade) {
        this.grade = newGrade;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public String getGrade() {
        return grade;
    }
}