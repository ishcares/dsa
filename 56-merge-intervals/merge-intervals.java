class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> res = new ArrayList<>();
        int curstart = intervals[0][0];
        int curend = intervals[0][1];
        int s,e;
      for(int i = 1 ; i<intervals.length;i++){
       s = intervals[i][0];
       e = intervals[i][1];
       if(s<=curend){
        curend = Math.max(e,curend);
       }
       else{
        res.add(new int[]{curstart,curend});
        curstart = s;
        curend = e;
       }
      }
 res.add(new int[]{curstart,curend});
 return res.toArray(new int[res.size()][]);
    }
}