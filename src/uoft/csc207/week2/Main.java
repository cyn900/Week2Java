package uoft.csc207.week2;

public class Main {

    public static void main(String[] args) {
        String[] name = {"First", "Middle", "Last"};
	    Person p = new Person(name, "moogah");
        Person s = new Student(name, "Hfskjda", "12346789");
        System.out.println(p);
    }
}
