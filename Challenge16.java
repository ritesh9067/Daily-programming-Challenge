class Challenge16 {
    public static long findLcm(int n,int m){
       long lcm =1;
       long max =Math.max(n,m);
       long p =max;
       
       for(int i=1;;i++){
           max =p*i;
           if(max%n==0 && max%m==0){
               lcm =max;
               break;
           }
       }
       return lcm;
    }
    public static void main(String[] args) {
       int n =123456;
       int m = 789012;
;
       
       System.out.println(findLcm(n,m));
    }
    

}
