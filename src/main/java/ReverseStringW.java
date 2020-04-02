public class ReverseStringW
{


   public static String reverseWord(String str) {
        if(str!=null) {

            String[] w = str.split(" ");
            //String Buffer Suggestion- Findbugs
            String revString = "";
            for (int i = 0;i<w.length;i++)
            {
                String word = w[i];
                String rw = "";
                for(int j=word.length()-1;j>=0;j--)
                {
                    rw += word.charAt(j);
                }
                revString = revString + rw + " ";
            }
            //System.out.println(str);
            System.out.println(revString);
            return revString;
        }
        else {
            return null;
        }
    }


    public static void main(String[] args) {

        String str="i am learning automation";
        //ReverseStringW dd=new ReverseStringW();
        System.out.print(ReverseStringW.reverseWord(str));
    }
}

