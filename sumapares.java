public class sumapares {
    public static void main(String[] args) {
        int sumapares;

        sumapares= 0;

        for(int i=0; i<=100 ; i++){
            if(i %2== 0){
                sumapares += i;
            }
        }

        System.out.println("el resultado es: "+ sumapares);
    }
}
