public class Challenge3 {
    public static int findDuplicates(int arr[] ){
        int n =arr.length-1;

        int originalSum = n*(n+1)/2;

        int actualSum =0;

        for(int i:arr) {
            actualSum+= i;
        }

        return actualSum-originalSum;
    }
    public static void main(String[] args){
        int test1[] ={1, 3, 4, 2, 2};
        int test2[] ={3, 1, 3, 4, 2};
        int test3[] ={1, 1};
        int test4[] ={1, 4, 4, 2, 3};

        System.out.println(findDuplicates(test1));
        System.out.println(findDuplicates(test2));
        System.out.println(findDuplicates(test3));
        System.out.println(findDuplicates(test4));
    }
}
