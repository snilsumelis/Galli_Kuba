import java.util.Scanner;

public class Galli {
    private Integer Currency;
    public Integer Result;
    private Integer LastGalli;

    // Uygunluğu kontrol edilmiş sayının 10 tabanına döndüğü method
    public int GallitoDecimal(Integer Currency) {
        int decimal = 0;
        int power = 0;
        while (Currency > 0) {
            int remainder = Currency % 10;
            decimal += remainder * Math.pow(9, power);
            power += 1;
            Currency /= 10;
        }
        Result = decimal;

        return Result;
    }




    public void Add(Galli newGalli) {
        GallitoDecimal(Currency);
        Result += newGalli.Result;
        ShowCurrency(Result);
    }

    public void Add(Kuba newKuba) {
        Result += (newKuba.Result)/2;
        ShowCurrency(Result);
    }
    /*Kullanıcıdan alınan sayının bir galli değeri olup olmadığını stringe çevirip
    inceleyen, ona göre decimale çevirme moethodunu çağıran method */
    public void GetCurrency() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Galli amount:  ");
        String temp = String.valueOf((sc.nextInt()));
        if (!sc.nextLine().contains("9")) {
            System.out.println("Valid Galli amount");
            Currency = Integer.valueOf(temp);
            GallitoDecimal(Currency);
        } else System.out.println("Invalid Galli amount");

    }

    public void GetCurrency(Integer newGalli) {
        String temp = Integer.toString(newGalli);
        if (!temp.contains("9")) {
            System.out.println("Valid Galli amount");
            Currency = newGalli;
            GallitoDecimal(Currency);
        } else {
            System.out.println("Invalid Galli amount");
        }

    }

    public void ShowCurrency(Integer Result) {
        int decimal = 0;
        int power = 0;
        while (Result > 0) {
            int remainder = Result % 9;
            decimal += remainder * Math.pow(10, power);
            power += 1;
            Result /= 9;
        }
        LastGalli = decimal;
        System.out.println("Your Total Galli Amount :  " + LastGalli);

    }

    public void Subtract(Galli newGalli) {
        GallitoDecimal(Currency);
        Result -= newGalli.Result;
        ShowCurrency(Result);
    }

    public Kuba Convert() {
        Kuba kuba = new Kuba();
        kuba.ShowCurrency(2*Result);

        return kuba;
    }
}
