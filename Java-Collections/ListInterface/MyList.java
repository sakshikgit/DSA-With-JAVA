import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MyList {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(7);
        System.out.println(list);
        // list.remove(Integer.valueOf(5));
        // System.out.println(list);
        // list.remove(3);
        // System.out.println(list);

        Iterator<Integer> itr = list.iterator();
        System.out.println("my list -");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //sorting 
        list.sort(new Comparator<Integer>() {
            public int compare(Integer A, Integer B){
                return A-B;
            }
        });
        System.out.println(list);

        //student class
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(10, "sakshi"));
        list1.add(new Student(5, "Ayush"));
        list1.add(new Student(15, "rohit"));

        list1.sort(new Comparator<Student>() {
            public int compare(Student A, Student B){
                return B.rollNumber - A.rollNumber;

            }
            
        });
        System.out.println(list1);
    }  
}

class Student{
    int rollNumber;
    String name;

    public Student(int rollNumber, String name){
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public String toString(){
        return name;
    }
}