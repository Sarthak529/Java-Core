public class commonMethods {
    static void main() {
        String Name ="Sarthak  ";
        System.out.println(Name.length());
        System.out.println(Name.charAt(0));
        String str = "SARTHAK";
        System.out.println(str.equals(Name));
        System.out.println(str.equalsIgnoreCase(Name));
        String str1 = " ";
        System.out.println(str1.isEmpty());
        System.out.println(str1.isBlank());
        Name =Name.trim();
        System.out.println(Name.length());
    }
}
