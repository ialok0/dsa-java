package Arrays;

public class H_Index {
    /* H-index for a research paper
    *  ex - [3,0,6,1,5] array of citations(researcher for paper)
    * H researcher at least published the paper for H times.
    *
    * */

    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] arr = new int[n+1];

        for(int c:citations){
            if(c>n){
                arr[n]++;
            }else{
                arr[c]++;
            }
        }
        int count = 0;
        for(int i=n; i>=0; i--){
            count += arr[i];
            if(count >= i){
                return i;
            }
        }
        return 0;
    }
}
