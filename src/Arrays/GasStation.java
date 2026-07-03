package Arrays;

import java.util.Arrays;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int start = 0;
        int currentGas = 0;

        if(Arrays.stream(gas).sum() < Arrays.stream(cost).sum()){
            return -1;
        }

        for (int i=0; i<n; i++){
            currentGas += (gas[i]-cost[i]);
            if(currentGas<0){
                start = i + 1;
                currentGas = 0;
            }
        }
        return start;
    }
}
