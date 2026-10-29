public class comparingStrings {
    static void main() {
        String str1 =  "abc";
        String str2 = "abc";
        if(str1 == str2){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
        if(str1 .equals( str2)){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }if(str1 .equalsIgnoreCase( str2)){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }

    }
}
