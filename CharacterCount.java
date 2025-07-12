import java.util.*;
 class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char ch[]=str.toCharArray();
        int alp_c=0,dig_cou=0,space_cou=0,spc_count=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(ch[i])){
                alp_c++;
            }
            else if(Character.isDigit(ch[i])){
                dig_cou++;
            }
            else if(Character.isWhitespace(ch[i])){
                space_cou++;
            }
            else{
                spc_count++;
            }
        }
        System.out.println("Alphabet count: "+alp_c);
        System.out.println("Digit_count: "+dig_cou);
        System.out.println("Space_count: "+space_cou);
        System.out.println("Special characters count: "+spc_count);
    }
 }
