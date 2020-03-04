public class Woww {
    public static void CaeserEncryption(String input){
        char [] caeser={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String output="";
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            int pos=c-'a';
            if(pos+1<caeser.length){
                output += caeser[pos + 1];
            }else
            {
                output+="a";
            }
        }
        System.out.print("your word is : "+output.toUpperCase());
    }//CaeserEncryption

}
