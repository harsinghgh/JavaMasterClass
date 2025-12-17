public class logical {
    static void main(String[] args) {
        int harpreetScore = 100;
        int harmeharScore = 10;

        if ((harpreetScore > harmeharScore) && (harpreetScore >80)) {
            System.out.println("Harpreet is better than Harmehar and got more than 80 on Test");
        }
        if((harmeharScore < harpreetScore) || (harmeharScore <40)){
            System.out.println("Harmehar failed in test");
        }

    }
}
