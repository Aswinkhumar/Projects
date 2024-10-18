package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        solution(n, 'A','B', 'C');
    }

    private static void solution(int n, char first, char middle, char last) {
        if(n == 1){
            System.out.println("Move 1 from " + first + " to " + last);
            return;
        }

        solution(n-1, first, last, middle);
        System.out.println("Move " + n + " from " + first + " to " + last);
        solution(n-1, middle, first, last);
    }
}
