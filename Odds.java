public class Odds {
    public static void main(String[] args) {
        final int MAX = 10;
        int[][] odds = new int[MAX+1][];
        for(int n=0;n<=MAX;n++)
            odds[n] = new int[n+1];
        for(int n=0;n<odds.length;n++)
            for(int k=0;k<odds[n].length;k++){

                int lotteryodds = 1;
                for(int i=1;i<=k;i++)
                    lotteryodds = lotteryodds*(n-i+1)/i;
                odds[n][k] = lotteryodds;
            }
        for(int[] row:odds) {
            for (int odd : row)
                System.out.printf("%4d",odd);
            System.out.println();
        }
    }
}
