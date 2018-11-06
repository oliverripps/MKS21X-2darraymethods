public class ArrayMethods{
  public static int rowSum(int[][] ary, int c){
  int x=0;
  if(ary.length<=c || c<0){
    return 0;
  }
  for(int i=0; i<ary[c].length;i++){
    x+=ary[c][i];
  }
  return x;
}
  public static int columnSum(int[][] ary, int c) {
      int x = 0;
      for (int i = 0; i < ary.length; i++) {
          if (c < ary[i].length) {
              x += ary[i][c];
          }
      }
      return x;
    }
  public static int[] allRowSums(int[][] ary) {
    int[] s = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      s[i] = rowSum(ary, i);
        }
    return s;
    }
  public static int[] allColSums(int[][] ary) {
    int max = 0;
    for (int i = 0; i < ary.length; i++) {
      if (ary[i].length > max) {
        max = ary[i].length;
            }
        }
    int[] s = new int[max];
    for (int i = 0; i < max; i++){
      s[i] = columnSum(ary, i);
        }
    return s;
    }
    public static boolean isRowMagic(int[][] ary){
      int[] rows = allRowSums(ary);
      for (int i = 1; i < rows.length; i++){
        if (rows[i] != rows[i - 1]) {
          return false;
        }
      }
      return true;
    }
    public static boolean isColumnMagic(int[][] ary){
        int[] columns = allColSums(ary);
        for (int i = 1; i < columns.length; i++) {
            if (columns[i] != columns[i - 1]) {
                return false;
            }}
        return true;
    }
}
