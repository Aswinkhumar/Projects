package Recursion;

public class JosephusProblem {
    public static void main(String[] args) {
        int n = 5;  // number of people in the circle.
        int k = 3;  // iteration of a person needs to be killed.
        System.out.println(findSurvivor(n,k));
    }

    private static int findSurvivor(int n, int k) {
        if(n==1) return 0;
        return (findSurvivor(n-1, k) + k) % n;
    }
}
