public class Encapsulation {
    public int roll_no;
    public String name;
    private String grade;

    public Encapsulation(int roll_no, String name, String grade) {
        this.roll_no = roll_no;
        this.name = name;
        this.grade = grade;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public String getGrade(){
        return grade;
    }
}
