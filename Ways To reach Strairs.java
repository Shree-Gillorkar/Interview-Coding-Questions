/*Find total ways to reach n’th stair with at-most `m` steps
Input:  n = 3, m = 2
Output: Total ways to reach the 3rd stair with at most 2 steps are 3
 
1 step + 1 step + 1 step
1 step + 2 steps
2 steps + 1 step
 
 
Input:  n = 4, m = 3
Output: Total ways to reach the 4th stair with at most 3 steps are 7
 
1 step + 1 step + 1 step + 1 steps
1 step + 1 step + 2 steps
1 step + 2 steps + 1 step
1 step + 3 steps
2 steps + 1 step + 1 step
2 steps + 2 steps
3 steps + 1 step
*/

class Main
{
    // Recursive function to find total ways to reach the n'th stair from the bottom
    // when a person is allowed to take at most `m` steps at a time
    public static int totalWays(int n, int m)
    {
        // base case: invalid input
        if (n < 0) {
            return 0;
        }
 
        // base case: 1 way (with no steps)
        if (n == 0) {
            return 1;
        }
 
        int count = 0;
        for (int i = 1; i <= m; i++) {
            count += totalWays(n - i, m);
        }
 
        return count;
    }
 
    public static void main(String[] args)
    {
        int n = 4, m = 3;
 
        System.out.printf("Total ways to reach the %d'th stair with at most " +
                                "%d steps are %d", n, m, totalWays(n, m));
    }
}
