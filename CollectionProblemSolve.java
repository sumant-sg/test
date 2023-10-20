import com.sun.source.tree.Tree;

import java.util.*;
import java.util.Map.Entry;
public class CollectionProblemSolve {
    public static void main(String[] args) {

    }
}
//    Write a Java program that takes an array of integers
//    as input and removes duplicates from the array using a Set from the Collections framework. Print the elements of the modified array.
class DuplicateElementArrayList{
    public static void main(String[] args) {
        //int[] arr = new int[9];
        List<Integer> arr = new ArrayList<Integer>(10);
        Scanner sc = new Scanner(System.in);
        System.out.println(arr.size());
        for(int i = 0; i < 10; i++){
            int val = sc.nextInt();
            arr.add(val);
        }
        //Set<Integer> set = new HashSet<Integer>(arr);
        Set<Integer> set = new HashSet<Integer>();
//        for(int i = 0; i < arr.size(); i++) {
//            if (set.contains(arr.get(i))) arr.remove(i);//shifting issue
//            else set.add(arr.get(i));
//        }
//
//
//        }
        Iterator<Integer> iterate = arr.iterator();
//        while(iterate.hasNext()) {
////            System.out.println(iterate.next());
//            if(!(set.contains(iterate.next()))) set.add(iterate.next());//ConcurrentModificationException
//            else arr.remove(iterate.next());//exception modification while traverse
//        }


        for(Integer i: arr) {
            if (!(set.contains(i))) {

                set.add(i);
            } else {

                arr.remove(i);

            }
        }
//
//        }
//        arr.clear();
//        arr.addAll(set);
        for(Integer im: arr){
            System.out.println(im);

        }




    }
}
//  Write a Java program that takes a paragraph or a sentence as input and counts the frequency of each word.
//  `Use a HashMap from the Collections
//   framework to store the words as keys and their frequencies as values. Print the word-frequency pairs in descending order of frequency.
class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<String, Integer> map = new HashMap<String, Integer>();
        //String[] words = str.split("\\W");
        String[] words = str.split(" ");
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);//for creating a map with word and its freq
            }else{
                map.put(word, 1);
            }
        }

        Set<Map.Entry<String, Integer>> set1 = map.entrySet();
        List<Integer> li = new ArrayList<Integer>();
        for(Map.Entry<String, Integer> e : set1) {
            li.add(e.getValue());
        }
        Collections.sort(li, Collections.reverseOrder());


        for(int i = 0; i < li.size(); i++){

            for(Map.Entry<String, Integer> e : set1) {
                if (li.get(i) == e.getValue()) {
                    System.out.println(e.getKey() + "---- >" + e.getValue());
                    //set1.(e);

                }
            }



        }



    }
}
//Question: Student Grade Analyzer
//Create a Student class with attributes like name, roll number, and grade. Use a TreeSet from the Collections framework
// to store the students
// and their grades. Write a
// program to add students and their grades, display the list of students sorted by their roll numbers,
// and find the highest and lowest grades.
class Student1{
    private String name;
    private int roll;
    private String grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }




    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", grade='" + grade + '\'' +
                '}';
    }

    public Student1(String name, int roll, String grade){
        this.name = name;
        this.grade = grade;
        this.roll = roll;
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1("ram", 21, "E");
        Student1 s2 = new Student1("hary", 31, "D");
        Student1 s3 = new Student1("roy", 341, "C");
        Student1 s4 = new Student1("ajay", 221, "B");
        Student1 s5 = new Student1("mantu", 121, "A");

        TreeSet<Student1> tset = new TreeSet<Student1>();
        tset.add(s1);tset.add(s3);
        tset.add(s2);tset.add(s4);tset.add(s5);
        for(Student1 stu: tset){
            System.out.println(stu);
        }

        TreeSet<Student1> tset1 = new TreeSet<Student1>();
        tset1.add(s1);tset1.add(s3);
        tset1.add(s2);tset1.add(s4);tset1.add(s5);

        System.out.println("=======================================");
        System.out.println("Highest grade: " + tset1.first().getGrade());
        System.out.println("lowest grade: " + tset1.last().getGrade());


    }
    }

class rollcomp implements Comparator<Student1>{
    public int compare(Student1 o1, Student1 o2){
        if(o1.getRoll() == o2.getRoll()) return 0;
        else if(o1.getRoll() > o2.getRoll()) return -1;
        else return 1;
    }
}
class gradecomp implements Comparator<Student1>{
    public int compare(Student1 o1, Student1 o2){
//        if(o1.grade == o2.grade) return 0;
//        else if(o1.grade.compareTo(o2.grade)) return -1;
//        else return 1;
        return o1.getGrade().compareTo(o2.getGrade());
    }
}


class UserDefinedException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user

        System.out.println("Enter Your Age");

        int age = sc.nextInt();         //Taking input from user

        try
        {
            if(age < 0)
            {
                throw new Exception();    //throws an Exception if age is negative
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);     //Prints exception description
            System.out.println("exception handled");
        }
    }
}
class ab{
    static int a=9;
}
class bc extends ab{
    public static void main(String[] args) {
        bc b1 = new bc();
        int val = b1.a;
        int val1 = bc.a;

    }
}



//MANI
class RightRotationArray{
    public int[] rightrotate(int[] arr, int time){
        int n = arr.length;
        while(time > 0) {
            int val = arr[n-1];
            for (int i = n-1; i >0; i--) {
                arr[i] = arr[i-1];
            }
            arr[0] = val;
            time--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        RightRotationArray obj1 = new RightRotationArray();
        int[] ans = obj1.rightrotate(array,5);
        for(int i = 0; i< ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}


//MANI
class HandlingException{
    public void ageValidityCheck(int age){
        try{
           if(age < 0){
               Exception ex = new Exception();
               throw ex;
           }

        } catch (Exception e) {
            System.out.println("exception handled");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        HandlingException obj1 = new HandlingException();
        obj1.ageValidityCheck(-2);

    }
}

//input Array: -5, 4, 3, -4, 6  (MANI)
//        Output Array: -5, -4, 4, 3, 6
class logicBuilding{
    public int[] logic(int[] arr){
        int[] ans = new int[arr.length]; int index =0;
        for(int i =0; i < arr.length; i++){
            if(arr[i] < 0){
                ans[index] = arr[i];
                index++;
            }
        }
        for(int i =0; i < arr.length; i++){
            if(arr[i] > 0){
                ans[index] = arr[i];
                index++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        logicBuilding obj1 = new logicBuilding();
        int[] ques = {-5, 4, 3, -4, 6};
        int[] array = obj1.logic(ques);
        for(int i =0; i < array.length; i++){
            System.out.print(array[i] + ",");

        }
    }
}

//First Non repeating char
/*class FirstNonRepeating {
    static final int NO_OF_CHARS = 256;
    static char count[] = new char[NO_OF_CHARS];

    static void buildCharCountArray(String str) {
        for(int i = 0; i < str.length(); i++){
            count[str.charAt(i)]++;
        }
    }
    class Mainm {
        static final int NO_OF_CHARS = 256;
        static char count[] = new char[NO_OF_CHARS];

        // this method builds count array which updates frequency for each
        // ascii character (0-255)
        // example for 'p' ascii value is 112, in the array
        // count[112] value would be 2 (p appears twice)
        static void buildCharCountArray(String str) {
            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i)]++;
            }
        }

        // this method finds first non repeating character
        // returns the index of the first non repeating character
        static int findFirstNonRepeating(String string) {
            // build char count array
            buildCharCountArray(string);

            int pos = -1, i;

            for (i = 0; i < string.length(); i++) {
                if (count[string.charAt(i)] == 1) {
                    pos = i;
                    break;
                }
            }

            return pos;
        }

        // Driver method
        public static void main(String[] args) {
            String string = "prepinsta";
            int pos = findFirstNonRepeating(string);

            System.out.println(
                    pos == -1
                            ? "All characters are repeating "
                            : "First non-repeating character is "
                            + string.charAt(pos));
        }
    }
}*/



class Main3 {

    public static void main(String[] args) {
        System.out.println("Hello");
    }
    private class String { }
}
class OverloadingTest {
    public void print(int num) {
        System.out.println("Method with int argument: " + num);
    }

    public void print(double num) {
        System.out.println("Method with double argument: " + num);
    }

    public static void main(String[] args) {
        OverloadingTest test = new OverloadingTest();
        test.print(10.0);
    }

}

class Main32 {
    public static void main(String[] args) {
        int i=0;
        for(; i<100 ;++i);
        {
            --i;
            System.out.println("I");
        }
    }
}

