public class Question3 {
    public static void main (String[] args){
        int n = 3;
        int m = 4;
        int result = n * (++m);
        System.out.println(result);

        int l = 3;
        int p = 4;
        int solution = l * (p++);
        System.out.println(solution);
    }
}
