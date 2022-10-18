import java.util.Scanner;
public class Polidrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  a= in.nextLine();
        int strbegin=0;
        int strend;
        for(int i=0;i < a.length();i++){
            if( a.charAt(i) == ' ' || i == (a.length()-1)){
                if(i != (a.length()-1)){ strend = i;}
                else {strend = i+1;}
                String Str1 = a.substring(strbegin,strend);

                if(isPolidrom(Str1)==true){
                    System.out.println(Str1 + " - true");
                }
                else {
                    System.out.println(Str1 + " - false");
                }
                strbegin = i+1;
            }
        }
    }
    public static boolean isPolidrom(String a) {
        int s=0;
        for(int i=0; i < a.length(); i++){
            if(a.charAt(i) == a.charAt(a.length()-i-1)){
                s++;
            }
        }
        if(s==a.length()){
            return  true;
        }
        else{
            return  false;
        }
    }
}
