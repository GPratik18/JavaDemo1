class RevNum{
    static int ReversedNumber=0;
    public static void main(String[] args) {
	System.out.println(R(Integer.parseInt(args[0])));
    }
    public static int R(int Num){
        if(Num>0){
            ReversedNumber=ReversedNumber*10+(Num%10);
            R(Num/10);
        }
        return ReversedNumber;
    }

}