public class vowelsRecognization {
    public static void main(String[] args) {
        String str="abcde";
        System.out.println(returnVowels(str));

    }
    public static int returnVowels(String str){
        int totalVowels=0;
        int n=str.length();
        char[] chars=str.toCharArray();
        String Vowels="aeiouAEIOU";
        for(int i=0;i<n;i++){
            if(Vowels.indexOf(chars[i])!= -1){
                totalVowels+=(i+1)*(n-i);
            }
        }
        return totalVowels;
    }
}
