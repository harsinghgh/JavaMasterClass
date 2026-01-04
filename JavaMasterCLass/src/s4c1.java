public class s4c1 {
    static void main(String[] args) {
        double score1 = 20.00;
        double score2 = 80.00;

        double score3 = (score1 + score2) * 100.00 ;

        double remop = score3 % 40.00 ;

        boolean result;
        if (remop == 0.00){
            result = true;
        }
        else {
            result = false;
        }

        System.out.println(result);

        if(result == false){
            System.out.println("got some remainder");
        }


    }
}