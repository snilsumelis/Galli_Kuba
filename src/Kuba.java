import java.util.Scanner;

public class Kuba {
    private Integer Currency;
    public Integer Result;
    private Integer LastKuba;

    public int KubatoDecimal(Integer Currency) {
        int decimal = 0;
        int power = 0;
        while (Currency > 0) {
            int remainder = Currency % 10;
            decimal += remainder * Math.pow(7, power);
            power += 1;
            Currency /= 10;
        }
        Result = decimal;
        return Result;
    }

    //Kuba + Kuba
    public void Add(Kuba newKuba) {
        KubatoDecimal(Currency);
        Result += newKuba.Result;
    }

    public void Add(Galli newGalli) {
        Result += 2 * (newGalli.Result);
        System.out.println("Your Gallias are Added to Kubas;  " + Result);
        ShowCurrency(Result);

    }
    /*Kullanıcıdan alınan sayının bir galli değeri olup olmadığını stringe çevirip
        inceleyen, ona göre decimale çevirme moethodunu çağıran method */
    //Terminal Input
    public void GetCurrency() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Kuba amount:  ");
        String temp = String.valueOf((sc.nextInt()));
        String regex = "[7-9]+";
        if (!sc.nextLine().matches(regex)) {
            System.out.println("Valid Kuba amount");
            Currency = Integer.valueOf(temp);
            KubatoDecimal(Currency);
            System.out.println(Currency);
        } else System.out.println("Invalid Kuba amount");

    }
    /*Kullanıcıdan alınan sayının bir galli değeri olup olmadığını stringe çevirip
        inceleyen, ona göre decimale çevirme moethodunu çağıran method */
    //Call Defined Input
    public void GetCurrency(Integer newKuba) {
        String temp = Integer.toString(newKuba);
        if (!temp.matches("[7-9]+")) {
            System.out.println("Valid Kuba amount");
            Currency = newKuba;
            KubatoDecimal(Currency);

        } else {
            System.out.println("Invalid Kuba amount");
        }

    }

    public void ShowCurrency(Integer Result) {
        int decimal = 0;
        int power = 0;
        while (Result > 0) {
            int remainder = Result % 7;
            decimal += remainder * Math.pow(10, power);
            power += 1;
            Result /= 7;
        }
        LastKuba = decimal;
        System.out.println("Your Total Kuba Amount :  " + LastKuba);
    }

    public void Subtract(Kuba newKuba) {
        KubatoDecimal(Currency);
        Result -= newKuba.Result;
        ShowCurrency(Result);
    }

    public Galli Convert() {
        Galli galli = new Galli();
        galli.ShowCurrency(Result / 2);
        return galli;
    }
}
