public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("meenakshi");
        s1.setFee(30000);
        s1.setCourse("mysql");
        System.out.println(s1.getName());
        System.out.println(s1.getFee());
        System.out.println(s1.getCourse());

        Student s2 = new Student();
        s2.setName("usha");
        s2.setFee(30000);
        s2.setCourse("mysql");
        System.out.println(s2.getName());
        System.out.println(s2.getFee());
        System.out.println(s2.getCourse());
    }
}
