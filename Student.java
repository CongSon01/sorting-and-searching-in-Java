package Algorithm;
public class Student implements Comparable<Student>
{
	private String ID, Name, BirthYear;
    public Student(String id, String name, String bt) {

        this.ID = id;
        this.Name = name;
        this.BirthYear = bt;
       
    }   


    //toString method
    public String toString() {
        return "Student: [ID = " + ID + ", Name = " + Name + ", BirthYear = " + BirthYear+"]";
    }

  

    //Sorting the array based on SSN
    public int compareTo(Student target) {

        int result;

        if (Name.equals(target.getName()))
            result = ID.compareTo((String) target.getID());
        else 

            result = ID.compareTo((String) target.getID());

        return result;
    }
    

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }


    public Object getBirthDay() {
        return BirthYear;
    }

}