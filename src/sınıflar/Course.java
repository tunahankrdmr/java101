package sınıflar;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozNot;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        int sozNot;
    }

    public void addTeacher(Teacher t1){
        if(this.prefix.equals(t1.branch)){
            this.courseTeacher=t1;
            System.out.println("İşlem başarılı");
        }else{
            System.out.println(t1.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher(){
        if(this.courseTeacher!=null){
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        }else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

}
