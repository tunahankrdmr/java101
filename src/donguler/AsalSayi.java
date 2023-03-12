package donguler;

public class AsalSayi {
    public static void main(String[] args) {

        for(int sayi=2;sayi<=100;sayi++)
        {
            boolean isTrue=true;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    isTrue=false;
                    break;
                }
            }

            if(isTrue)
            {
                System.out.print(sayi+"\n");
            }
        }
    }
}
