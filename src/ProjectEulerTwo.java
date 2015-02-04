/**
 * Created by NOEL on 2/3/2015.
 */
public class ProjectEulerTwo {
  public static void main(String[] args) {
    int[] array;
    array=new int[100000];
    array[0]=1;
    array[1]=2;
    int i = 1;
    int sum=0;

  for(;;) {
    i = i + 1;
    array[i]=array[i - 1] + array[i - 2];
    //System.out.println(array[i]);
    if (array[i] > 4000000) {
      for (int x = 0; x < i; x++) {
        if(array[x] % 2 == 0){
          sum = array[x] + sum;
          System.out.println(sum);
        }
      }
      return;
    }
  }
}
}