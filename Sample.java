class Sample {
    public static void main(String[] args) {
        int mini = 10;       //primitive
        float fl = 1233L;  //primitive
        char ch = '1';   //primitive
        int maxi = 100;
        final int num = 50; //We cannot change this value.
        String str = "ppbkjk";
        float percent = (float)mini/maxi; //
        int[] array = {0,2,3,4,5}; // Array of integers
        String[] stArray = {"pbk","hello"}; //Array of integers
        System.out.println("Hello world         "+ch);
        System.out.println("char at-"+str.charAt(2));
        System.out.println("length "+str.length());
        System.out.println("sub string "+str.substring(0,2));
        // System.out.println(str.replace("p", "A"));
    }
}