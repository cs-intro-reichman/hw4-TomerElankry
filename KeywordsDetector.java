public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
        //System.out.println(ifFound("Our product will transform the market", "the"));
        //System.out.println(ifFound("The team showed great Synergy in the last project", "synerdgy"));

    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for(int i=0;i<sentences.length;i++)
        {
            for(int j = 0; j<keywords.length;j++)
            {
                if(ifFound(sentences[i],keywords[j]))
                {
                    System.out.println(sentences[i]);
                }
            }
        }
    }
    // A function that recieves a string and turns all it's chars to lower case
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
    // A function that accepts two strings s1 , s2  and returns true if s2 is a substring of s1. otherwise it returnes false
    public static boolean ifFound(String s1, String s2)
    {
        s1=lowerCase(s1);
        s2 =lowerCase(s2);
        boolean match;
        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            match = true;
            for (int j = 0; j < s2.length(); j++)
            {
                if (s1.charAt(i + j) != s2.charAt(j))
                {
                    match = false;
                    break;
                }
            }
            if (match) return true;
        }
        return false;
    }
}
