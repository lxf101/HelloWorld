public class Knapsack {

    static int knapSack(int weightCap, int weights[], int values[], int i)
    {
    	if (i == 0 || weightCap == 0) {
            return 0;
        }
 
        else if (weights[i - 1] > weightCap) {
            return knapSack(weightCap, weights, values, i - 1);
 
        } else {
            return Math.max(
                   values[i - 1] + knapSack(weightCap - weights[i - 1], weights, values, i - 1),
                   knapSack(weightCap, weights, values, i - 1));
        }
    }


    public static void main(String[] args) {
        int values[] = new int[] { 70, 20, 39, 37, 7, 5, 10 };
        int weights[] = new int[] { 31, 10, 20, 19, 4, 3, 6 };
        int weightCap = 50;
        int i = values.length;
        Knapsack myNapsack = new Knapsack();
        System.out.println(myNapsack.knapSack(weightCap, weights, values, i));
    }
}