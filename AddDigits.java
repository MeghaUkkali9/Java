public class AddDigits {

    public static void main(String args[]){
        int  num = 78;
        System.out.println(addDigits(num));
    }
    static int addDigits(int num){
        return num % 9 == 0?9:num%9;
    }
}
