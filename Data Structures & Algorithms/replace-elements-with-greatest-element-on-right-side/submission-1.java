class Solution {
    public int[] replaceElements(int[] arr) {
        int[] output = new int[arr.length];
        if (arr.length==1) {
            output[0] = -1;
            return output;
        }

        for (int i=0;i<arr.length-1;i++) {
            int max = 0;
            for (int j=i+1;j<arr.length;j++) {
                if (arr[j]>max) {
                    max = arr[j];
                }
            }
            output[i] = max;
        }
        output[arr.length-1]=-1;
        return output;
        
    }
}