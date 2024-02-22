public class Main {
    public static void main(String[] args) {
        Galli galli1 = new Galli();
        Galli galli2 = new Galli();
        Kuba kuba1 = new Kuba();
        Kuba kuba2 = new Kuba();

        //-------------CurrencyInputandCheck--------------//
        //Call defined value
        //galli1.GetCurrency(25);
        //galli2.GetCurrency(15);
        //Terminal input
        //galli1.GetCurrency();
        //galli2.GetCurrency(11);
        //------------------//
        //Call defined value
        //kuba1.GetCurrency(30);
        //kuba2.GetCurrency(15);
        //Terminal input
        //kuba1.GetCurrency();
        //kuba21.GetCurrency();

        //----------- SameCurrencyOperations--------------//
        //galli1.Add(galli2);
        //galli1.Subtract(galli2);

        //kuba1.Add(kuba2);
        //kuba1.Substract(kuba2);
        //----------AddKubatoGalli&AddGallitoKuba---------//
        //kuba1.Add(galli1);
        //galli1.Add(kuba1);

        //-------------------Converters-------------------//
        //kuba1= galli1.Convert();
        //galli1=kuba1.Convert();

    }
}