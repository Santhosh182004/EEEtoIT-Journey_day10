import java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String str2=s.nextLine();
        char ch[]=str.toCharArray();
        char ch2[]=str2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        if(str.length()==str2.length()){
            int count=0;
            for(int i=0;i<str.length();i++){
                   if(ch[i]==ch2[i]){
                         count++;
                   }
            }
            if(count==str.length()){
                System.out.println("The given strings are anagrams");
            }
            else{
            System.out.println("The given strings are not an anagrams");
        }
        }
        else{
            System.out.println("The given strings are not an anagrams");
        }
        // optimised verison to avoid for loop and count
        /* if(Arrays.equals(ch, ch2)) {
    System.out.println("Anagram");
    } 
    else {
    System.out.println("Not Anagram");
     }*/
   }}  
