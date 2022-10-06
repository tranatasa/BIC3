public class SummenrechnerTest {



    public static void checkAdd(){
        Summenrechner rechner = new Summenrechner();

        long summe = rechner.add(2,2);

        assertEqual(4, summe);


    }
}
