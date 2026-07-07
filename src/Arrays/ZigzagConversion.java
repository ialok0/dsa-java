package Arrays;
/*
* example = PAYPALISHIRING ,, numrows = 3;
* output  = PINALSIGYAHRPI
        P     I    N        in output - first row write and then append second and so on.
        A   L S  I G        like output - PIN + ALSIG + YAHR + PI = PINALSIGYAHRPI ;
        Y A   H R
        P     I
* */
public class ZigzagConversion {
    public String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();

        if(numRows == 1){
            return s;
        }

        for(int i = 0; i<numRows; i++){
            int index = i;
            int down  = 2*(numRows-1-i);
            int up    = 2*i;
            boolean isGoDown = true;

            while(index<s.length()) {
                sb.append(s.charAt(index));

                if (i == 0) {
                    index += down;
                } else if (i == numRows - 1) {
                    index += up;
                } else {
                    if (isGoDown) {
                        index += down;
                    } else {
                        index += up;
                    }
                }
                isGoDown = !isGoDown;
            }
        }
        return sb.toString();
    }
}
