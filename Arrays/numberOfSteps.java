class numberOfSteps {
    public static int steps(int num) {
        int steps = 0;
        while(num > 0){
            if(num%2 == 0){
                num = num/2;
            }else{
                num = num - 1;
            }
            steps++;
        }
        return steps;
    }
    public static void main(String[] args) {
        System.out.println(steps(14));
    }
}