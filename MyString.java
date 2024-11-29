public class MyString {
    public static void main(String[] args) {
        /*System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));*/

        System.out.println("Testing contains:");
        System.out.println(contains("baba yaga", "baba")); // true
        System.out.println(contains("baba yaga", "")); // false
        System.out.println(contains("baba yaga", "John Wick is the baba yaga")); // false
        System.out.println(contains("baba yaga", "Yaga")); // true
        System.out.println(contains("baba yaga", "babayaga")); // true
        //System.out.println(contains("personality", "dad")); // false
        
        //System.out.println(contains("baba yaga", "babayaga"));// true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newS="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>=65 && str.charAt(i)<=90)
            {
                newS+=(char)(str.charAt(i)+32);
            }
            else newS+=str.charAt(i);
        }
        return newS;
    }
    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if(str2.length()>str1.length()) return false;
        if(str2.length()==0) return true;
        //str1 = lowerCase(str1);
        //str2 = lowerCase(str2);
        int count = 0;

        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)==str2.charAt(0))
            {
                for(int j = 0;j<str2.length();j++)
                {
                    if(str1.charAt(i+j)!=str2.charAt(j)) break;
                    else count++;
                }
                if(count==str2.length()) return true;
            }
        }
    
        return false;
    }
}
