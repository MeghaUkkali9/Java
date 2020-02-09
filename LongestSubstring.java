public class LongestSubstring {

    public static void main(String[] args){
        //System.out.println("hello world");
        String string = "abcabcd";
        for(int i = 0; i<string.length()-1; i++){
            char min = string.charAt(i);
            for(int j=i+1; j<string.length(); j++){
                char max=string.charAt(j);
                if(min==max){

                }
            }

        }
    }
}
