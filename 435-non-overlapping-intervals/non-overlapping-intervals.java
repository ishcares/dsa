class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
            int curstart = intervals[0][0];
            int curend = intervals[0][1];
            int s,e;
            int count =0;
            for(int i = 1; i<intervals.length;i++){
                s = intervals[i][0];
                e = intervals[i][1];
                if(s<curend){
                    count++;
                curend = Math.min(e,curend);
                }
                else{
                    curend =e;
                    curstart=s;
                }
            }
            return count;

    }
}