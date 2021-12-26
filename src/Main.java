public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut Hoca", "0905469852652","TRH");
        Teacher t2=new Teacher("grahm bell","00","FZK");
        Teacher t3=new Teacher("Külyutmaz","1111","BIO");


        Course tarih=new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik=new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course biyo= new Course("Biyoloji","103","BIO");
        biyo.addTeacher(t3);



        Student s1=new Student("inek şaban","132","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,78,50);

        s1.isPass();

        Student s2=new Student("güdü necmi","444","4",tarih,fizik,biyo);
        s2.addBulkExamNote(50,30,70);
        s2.isPass();






    }
}
