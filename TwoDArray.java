public class TwoDArray {

    public static void main(String args[]){
        String[][] states = new String[2][2];

        states[0][0] = "California";
        states[0][1] = "Sacramento";
        states[1][0] = "Pennsylvania";
        states[1][1] = "Philadelphia";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < states.length; i++){
            sb.append(states[i][0]).append(" is state of ").append(states[i][1]).append(". \n");
        }
        System.out.println(sb);
    }
}
/*
Two dimensional array
String[][] string = new String[r][c];
r-> rows
c-> columns

    say r = 3 and c = 2

    then matrix is    0      1
                   0  " "   " "
                   1  " "   " "
                   2  " "   ' '

                   How to print 2D?
                   Ans: use two for loops

                   or else use string builder to append use logic


 */