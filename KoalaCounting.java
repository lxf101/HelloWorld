
public class KoalaCounting {
	public static int getTotal(int[] arr) {
	    int sum = 0;
	    for(int i = 0; i< arr.length; i++) {
	    	sum += arr[i];
	    }
	    return sum;
	}

  public static void main(String[] args) {
    int[] dayOne = {17, 13, 19, 22};
    System.out.println(getTotal(dayOne));
  }
}
