package Searching;
/*
Finding Square root of the given number using Binary search.
 */
public class SquareRoot {
    public static void main(String[] args) {
        int k = 10;
        //System.out.println(sqroot(k));
        System.out.println(efficientSolution(k));
    }

    private static int efficientSolution(int target) {
        int start = 1;
        int end = target;
        int answer = -1;

        while(start <= end){
            int middle = start + (end-start) / 2; // for avoid integer overflow

            if(middle <= target/middle){ // This is equivalent to middle*middle <= target
                start = middle+1;
                answer = middle;
            }
            else{
                end = middle-1;
            }
        }
        return answer;
    }

    private static int sqroot(int target) {
        int start = 1;
        int end = target;
        int answer = -1;
        while(start <= end){
            int middle = (start + end)/2;
            int currentSquare = middle * middle;
            if(currentSquare == target){
                return middle;
            }
            else if(currentSquare < target){
                start = middle+1;
                answer = middle;
            }
            else{
                end = middle-1;
            }
        }
        return answer;
    }
}
