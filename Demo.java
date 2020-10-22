public class Demo {
  public static void main(String[] args) {
    if(args.length == 0) printLoop(5);
    else printLoop(Integer.parseInt(args[0]));
//    int[][] arr = { {1,2,3,4}, {5,6,7,8} };
//    System.out.println(arrayDeepToString(arr));
  }

  public static void printLoop(int n) {
    for (int i = n; i > 0; i--) {
      for (int j = 1; j <= i; j++) {
         System.out.print(n-i+1);
      }
      System.out.println();
    }
  }

  public static String arrToString(int[]arr){
      String result = "{";
      if (arr.length == 0) return (result + "}");
      for (int i=0; i<arr.length-1; i++) {
        result = result + String.valueOf(arr[i]) + ", ";
      }
      result = result + String.valueOf(arr[arr.length-1]) + "}";
      return result;
  }

  public static String arrayDeepToString(int[][]arr) {
    String result = "{";
    if (arr.length == 0) return (result + "}");
    for (int i=0; i<arr.length-1; i++) {
      result = result + arrToString(arr[i]) + ", ";
    }
    result = result + arrToString(arr[arr.length-1]) + "}";
    return result;
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][] arr = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            double randomized = Math.random() * maxValue + 1;
            double rounded = Math.floor(randomized);
            int result = (int)rounded;
            arr[i][j] = result;
          }
        }
        return arr;
      }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    int[][] arr = new int[rows][];
    for (int i = 0; i < rows; i++) {
      double randomcolumns = Math.random() * (cols + 1);
      int columns = (int) randomcolumns;
      arr[i] = new int[columns];
        for (int j = 0; j < columns; j++) {

          double randomNum = Math.random() * (maxValue + 1);
          int result = (int)randomNum;

          arr[i][j] = result;
        }
      }
      return arr;
    }


  }
