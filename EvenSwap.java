public class EvenSwap {
    public static void main(String args[]){

        int array[] = {1,2,3,4,5};
        int temp;

        for(int i = 0; i < array.length; i++){
            if((i+1) % 2==0){
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }

        for(int i =0; i < array.length; i++){
            System.out.print(array[i]);
        }
    }
}
