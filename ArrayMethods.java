public class ArrayMethods{
  public static int rowSum(int[][] ary, int c)
  int x =0;
  if (ary.length<=c || c<0){
    return 0;
  }
  for(int i=0; i<ary[c].length;i++){
    x+=ary[c][i];
  }
  return c;}





}
