public class PredefinedMethods2 {
    public static void main(String[] args) {
        String name1 = "rock";
        String name2 = "rock";
//        System.out.println(name1 == name2);
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        String name3 = "Rock";
        System.out.println(name3.hashCode());
        String name4 = "Nick";
        System.out.println(name4.hashCode());
        name2 = "K rock";
        System.out.println(name2.hashCode());

    }
}