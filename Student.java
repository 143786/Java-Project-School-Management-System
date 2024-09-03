package SMS;


/* this class is responsible for keep the
students fess, name, ID, Grade and fees paid
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

/* Constructor : the role of a constructor is to
create a new object ( here the object is student )
by initializing the values
 */

    /**
     *
     * @param id id for the student : unique.
     * @param name : name of the student.
     * @param grade : grade of the student.
     */
    public Student(int id, String name,int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        

}


}
