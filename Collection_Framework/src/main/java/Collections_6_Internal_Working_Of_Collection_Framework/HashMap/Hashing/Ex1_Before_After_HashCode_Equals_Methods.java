package Collections_6_Internal_Working_Of_Collection_Framework.HashMap.Hashing;

public class Ex1_Before_After_HashCode_Equals_Methods {
    public static void main(String[] args) {

        Student student = new Student(101,"viswa","Secbad");
        Student student2 = new Student(101,"viswa","Secbad");
        System.out.println(" Both objects are equal? "+ student.equals(student2));

        StudentDetails_with_HashCode_EqualsMethods s1 = new StudentDetails_with_HashCode_EqualsMethods(101,"viswa","Secbad");
        StudentDetails_with_HashCode_EqualsMethods s2 = new StudentDetails_with_HashCode_EqualsMethods(101,"viswa","Secbad");

        System.out.println(" Both objects are equal? "+ s1.equals(s2));
    }
}
