public class StaticExample2 {
    public static void main(String[] args)
    {
        University s1 = new University("name", 1);

        University.printUniversityName();
    }
}

class University
{
    private String studentName;
    private int rollNO;
    private static String universityName = "University name here";

    public University(String name, int rollNO)
    {
        this.studentName = name;
        this.rollNO = rollNO;
    }

    static void printUniversityName()
    {
        System.out.println("UniName: " + universityName);
    }

    static
    {
        System.out.println("This is an example of the static block");
    }
}
