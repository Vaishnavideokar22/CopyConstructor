class Student{
    String name;
    int age;

    Student(){
        
    }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "vaishnavi";
        s1.age = 22;
        System.out.println(s1.name);
        System.out.println(s1.age);

        Student s2 = new Student(s1);


    }
    
}
