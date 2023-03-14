package siniflar;

public class Main {
    public static void main(String[] args) {

        Course mat=new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1=new Teacher("Ahmet","MAT","90550000000");
        Teacher t2 = new Teacher("Fatma Ayşe", "FZK", "90550000001");
        Teacher t3 = new Teacher("Ali Veli", "KMY", "90550000003");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkSozNote(80,40,55);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkSozNote(75,25,45);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkSozNote(100,45,60);
        s3.isPass();

    }
}
