package az.company.collection;

public class Student {
    String name;

    //Constructor
    public Student(String name){
        this.name = name;
        System.out.println(name + " obyekti Heap yaddasda yaradildi!");
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println(name + " obyekti Garbage Collector terefinden silindi");
    }

    static void main(String[] args) {
        Student s1  = new Student("Ilkin");
        Student s2  = new Student("Namiq");

        System.out.println("Telebenin adi: " + s1.name);

        s1 = null;

        s2 = s1;

        System.out.println("Garbage Collection prosesi basladilir...");
        System.gc();

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Proqram bitdi");
    }



}
