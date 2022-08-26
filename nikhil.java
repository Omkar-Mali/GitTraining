package GitTraining;

class PrimeNo{

    public static void main(String[] args) {
        int num = 5;

        int temp=0;
        for(int i=2; i<num; i++)
        {
            if(num%i==0){
                                temp++;
            }
        }
        if(temp==0)
        {
            System.out.println("The number is prime.");
        }
        else
        {
            System.out.println("The number is not prime.");
        }
    }
}