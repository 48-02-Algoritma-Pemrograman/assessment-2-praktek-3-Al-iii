static String nPrint(int n) {
        if (n == 0) {
            return String.valueOf(n);
        } else if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } 
        return String.valueOf(n);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        for (int i =0;i<=N;i++){
            System.out.print(nPrint(i)+" ");
        }
        input.close();
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
    
}
