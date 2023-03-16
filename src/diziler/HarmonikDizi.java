package diziler;

public class HarmonikDizi {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        double result=0;
        for (int i=0; i< numbers.length; i++){
            result+=1.0/numbers[i]; //harmonik seri
        }
        System.out.println(numbers.length/result);
    }
}
