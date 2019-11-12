import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class CountriesTest {

    Counties c1 = new Counties();

    @Test
    public void removeStringState1(){

        ArrayList<String> MyList = new ArrayList<>();

        MyList.add("USA");
        MyList.add("Turkey");
        MyList.add("France");
        MyList.add("USA");
        MyList.add("England");

        String remove = "USA";



        int result = c1.countCountry(MyList,remove);


    Assert.assertTrue(result==2);



    }


    @Test
    public void removeStringState2(){

        ArrayList<String> MyList = new ArrayList<>();

        MyList.add("USA");
        MyList.add("Turkey");
        MyList.add("France");
        MyList.add("USA");
        MyList.add("England");

        String remove = "Russia";



        int result = c1.countCountry(MyList,remove);


        Assert.assertTrue(result==-1);



    }

    @Test
    public void removeStringState3(){

        ArrayList<String> MyList = new ArrayList<>();
        MyList.add("England");
        MyList.add("USA");
        MyList.add("Turkey");
        MyList.add("France");
        MyList.add("USA");
        MyList.add("England");
        MyList.add("England");
        String remove = "England";



        int result = c1.countCountry(MyList,remove);


        Assert.assertTrue(result==3);

    }

    @Test
    public void sortArrayList1(){

        ArrayList<String> MyList = new ArrayList<>();

        MyList.add("USA");
        MyList.add("England");
        MyList.add("Russia");
        MyList.add("Germany");
        MyList.add("South Africa");
        MyList.add("Brazil");

        ArrayList<String> result = c1.sortArrayList(MyList);

        ArrayList<String> Expected = new ArrayList<>();

        Collections.sort(Expected);

        for(int i = 0 ; i< Expected.size() ; i++){

            Assert.assertTrue(Expected.get(i).equals(result.get(i)));

        }


    }

    @Test
    public void sortArrayList2(){

        ArrayList<String> MyList = new ArrayList<>();

        MyList.add("Argentina");
        MyList.add("South Korea");
        MyList.add("Mali");
        MyList.add("Peru");
        MyList.add("Mexico");
        MyList.add("Brazil");

        ArrayList<String> result = c1.sortArrayList(MyList);

        ArrayList<String> Expected = new ArrayList<>();

        Collections.sort(Expected);

        for(int i = 0 ; i< Expected.size() ; i++){

            Assert.assertTrue(Expected.get(i).equals(result.get(i)));

        }


    }

    @Test
    public void reverseTheList1(){

        ArrayList<String> MyList = new ArrayList<>();

        MyList.add("Argentina");
        MyList.add("South Korea");
        MyList.add("Mali");
        MyList.add("Peru");
        MyList.add("Mexico");
        MyList.add("Brazil");

        ArrayList<String> result = c1.reverseTheList(MyList);

        ArrayList<String> Expected = new ArrayList<>();

        Expected.add("Brazil");
        Expected.add("Mexico");
        Expected.add("Peru");
        Expected.add("Mali");
        Expected.add("South Korea");
        Expected.add("Argentina");

        for(int i = 0 ; i< Expected.size() ; i++){

            Assert.assertTrue(Expected.get(i).equals(result.get(i)));

        }


    }

    @Test
    public void reverseTheList2(){

        ArrayList<String> MyList = new ArrayList<>();
        MyList.add("USA");
        MyList.add("South Korea");
        MyList.add("Paris");
        MyList.add("Peru");
        MyList.add("Mexico");
        MyList.add("Brazil");

        ArrayList<String> result = c1.reverseTheList(MyList);

        ArrayList<String> Expected = new ArrayList<>();

        Expected.add("Brazil");
        Expected.add("Mexico");
        Expected.add("Peru");
        Expected.add("Paris");
        Expected.add("South Korea");
        Expected.add("USA");

        for(int i = 0 ; i< Expected.size() ; i++){

            Assert.assertTrue(Expected.get(i).equals(result.get(i)));

        }


    }

    @Test
    public void getTotal1(){

         String myNum = "5421312341";


        int myTotal = c1.getTotal(myNum);

        int expected = 10 ;


        Assert.assertTrue(myTotal==expected);


    }

    @Test
    public void getTotal2(){

        String myNum = "5654656213";


        int myTotal = c1.getTotal(myNum);

        int expected = 29;


        Assert.assertTrue(myTotal==expected);


    }

    @Test
    public void getTotal3(){

        String myNum = "00000000000";


        int myTotal = c1.getTotal(myNum);

        int expected = -1;


        Assert.assertTrue(myTotal==expected);

    }

    @Test
    public void isfirstArrayListContainssecondArrayList1(){

        ArrayList<String> myCount = new ArrayList<>();

        myCount.add("Turkey");
        myCount.add("USA");
        myCount.add("Canada");
        myCount.add("France");
        myCount.add("China");



        ArrayList<String> myCount2 = new ArrayList<>();

        myCount2.add("Turkey");
        myCount2.add("USA");
        myCount2.add("Canada");
        myCount2.add("China");
        myCount2.add("France");
        myCount2.add("China");

        boolean result = c1.isfirstArrayListContainssecondArrayList(myCount2 , myCount);

        boolean expected = true;

        Assert.assertEquals(expected , result);


    }

    @Test
    public void isfirstArrayListContainssecondArrayList2(){

        ArrayList<String> myCount = new ArrayList<>();

        myCount.add("Turkey");
        myCount.add("USA");
        myCount.add("Canada");
        myCount.add("France");




        ArrayList<String> myCount2 = new ArrayList<>();

        myCount2.add("Turkey");
        myCount2.add("USA");
        myCount2.add("Canada");
        myCount2.add("China");
        myCount2.add("France");
        myCount2.add("China");

        boolean result = c1.isfirstArrayListContainssecondArrayList(myCount2 , myCount);

        boolean expected = false;

        Assert.assertEquals(expected , result);

    }


    @Test
    public void replaceTheCountry1(){
        ArrayList<String> myCount = new ArrayList<>();

        myCount.add("Turkey");
        myCount.add("USA");
        myCount.add("Germany");
        myCount.add("France");
        myCount.add("USA");

        String first = "USA";
        String second = "Canada";


        ArrayList<String> Actual = c1.replaceTheCountry(myCount , first, second );

        ArrayList<String> Expected = new ArrayList<>();

        Expected.add("Turkey");
        Expected.add("Canada");
        Expected.add("Germany");
        Expected.add("France");
        Expected.add("Canada");

        for(int i = 0 ;i < Expected.size() ; i++){

            Assert.assertTrue(Actual.get(i).equals(Expected.get(i)));


        }


    }


    @Test
    public void replaceTheCountry2(){
        ArrayList<String> myCount = new ArrayList<>();

        myCount.add("Finland");
        myCount.add("USA");
        myCount.add("Germany");
        myCount.add("Finland");
        myCount.add("USA");
        myCount.add("Finland");

        String first = "Finland";
        String second = "Italy";


        ArrayList<String> Actual = c1.replaceTheCountry(myCount , first, second );

        ArrayList<String> Expected = new ArrayList<>();

        Expected.add("Italy");
        Expected.add("USA");
        Expected.add("Germany");
        Expected.add("Italy");
        Expected.add("USA");


        for(int i = 0 ;i < Expected.size() ; i++){

            System.out.println(Actual.get(i));
            System.out.println(Expected.get(i));

            Assert.assertTrue(Actual.get(i).equals(Expected.get(i)));


        }


    }


    @Test
    public void replaceTheCountry3(){
        ArrayList<String> myCount = new ArrayList<>();

        myCount.add("Finland");
        myCount.add("USA");
        myCount.add("Germany");
        myCount.add("Finland");
        myCount.add("USA");

        String first = "South Africa";
        String second = "Italy";


        ArrayList<String> Actual = c1.replaceTheCountry(myCount , first, second );

        ArrayList<String> Expected = new ArrayList<>();

        Expected.add("-1");
        Expected.add("-1");
        Expected.add("-1");
        Expected.add("-1");
        Expected.add("-1");

        for(int i = 0 ;i < Expected.size() ; i++){

            Assert.assertTrue(Actual.get(i).equals(Expected.get(i)));


        }


    }



}
