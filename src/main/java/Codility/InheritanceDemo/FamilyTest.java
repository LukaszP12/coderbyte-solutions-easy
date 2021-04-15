package Codility.InheritanceDemo;

public class FamilyTest {

    public static void main(String[] args) {
        Children child = new Children();
        child.setFirstName("John");
        child.setLastName("Doe");

        System.out.println(child.getFirstName() + " " + child.getLastName());
    }

}
