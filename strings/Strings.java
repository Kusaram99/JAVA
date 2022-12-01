package strings;

public class Strings {
    // find palindrom
    static boolean palinDrom (String str){
        int n = str.length();
        for(int i=0; i< n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }

    // --------------
    
        // --- For a given String convert each the first letter of each 
        // word to uppercase - Ques. of - (CODE_NATION) Comp.

        static String toUpperCaseCon(String str){
            StringBuilder sb = new StringBuilder("");
            char ch = Character.toUpperCase(str.charAt(0));
            sb.append(ch);

            for(int i=1; i< str.length(); i++){
                if(str.charAt(i) == ' ' && i < str.length()){
                    sb.append(str.charAt(i));
                    i++;
                    sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    // ------------- String Compress (Amazon interview Ques.)
    static String stringCompress(String str){
        StringBuilder sbStr = new StringBuilder("");
        for(int i=0; i< str.length(); i++){
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sbStr.append(str.charAt(i));
            if(count > 1){
                sbStr.append(count.toString());
            }
        }
        return sbStr.toString();
    }

    public static void main(String[] args){
        // System.out.println(palinDrom("nioon"));// Palindrom 

        // String s1 = "hello";
        // String s2 = "hellp";
        // System.out.println(s1.compareToIgnoreCase(s2));
        
        // int num[] = {10};
        // System.out.println(num.toString()); // it will give error

        // --- convert into upper case
        // System.out.println(toUpperCaseCon("hi i am ram"));

        // --- String compression ---- (Amazome enterview)
        System.out.println(stringCompress("aammmrrrknnnsshhhhh"));//a2m3r3kn3s2h5
        

    }
}
