import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Counties {



// if CountThis String in the myCounties ArrayList then return how many of CountThis string in the myCounties
//              if CountThis is not in the myCountries then return -1
    public int countCountry(ArrayList<String> myCountries, String CountThis){

        int result = 0 ;

        for(int i = 0 ; i<myCountries.size() ; i++) {


        if(!myCountries.contains(CountThis)){

            result =-1;

        }else if(myCountries.get(i).equals(CountThis)){

                result++;
            }

        }

        return result;
    }

/*sort the arraylist

        for example list is equal to =====>>   england USA brazil

        result should be ====>>>   brazil england USA


 */
    public ArrayList<String> sortArrayList(ArrayList<String> myCountries){

         Collections.sort(myCountries);

         return myCountries;


    }

/*
    Reverse the ArrayList

    for example if the list is equal to ======>>>>   england USA brazil

    result should be =====>>>> brazil USA england



 */

    public ArrayList<String> reverseTheList(ArrayList<String> myCountries){

       ArrayList<String> reverse = new ArrayList<>();

        System.out.println(myCountries);

        for(int i = myCountries.size()-1 ; i>=0 ; i--){

            reverse.add(myCountries.get(i));

        }

        return reverse;


    }

    /*

          myNumbers has = "854364363564"

              if the number is even multiply by 2 and if the number is odd miltiply by -1 then sum all the numbers

            for example first number is 8 8*2 = 16
            second numeber is 5  5*-1 = -5

            15 + (-5) = 10

            result is 10


            if result equal to 0 then change it to -1


     */
    public int getTotal(String myNumbers){

        char[] myChar = myNumbers.toCharArray();

        int total = 0 ;
        for(int  i= 0 ; i<myChar.length ; i++){


            if(myChar[i]%2==0){

                String str = String.valueOf(myChar[i]);

                int myeven = Integer.parseInt(str);

                myeven = myeven*2;

                total = total + myeven;

            }else if(myChar[i]%2==1){

                String str = String.valueOf(myChar[i]);

                int myodd = Integer.parseInt(str);

                    myodd = myodd*-1;

                    total = total + myodd;

            }


        }


        if(total == 0 ){

            total = -1 ;
        }
        System.out.println(total);

        return total;
    }


/*

    if first array contains second array then result is true if not then false

        first array =====>>> China Russia USA Mexico
        Second array =====>>>>Mexico Russia USA China

        result true


        first array =====>>> China USA Mexico
        Second array =====>>>>Mexico Russia USA China

        return false


 */

    public boolean isfirstArrayListContainssecondArrayList(ArrayList<String> firstArray ,ArrayList<String> SecondAray){

        boolean result = false;

        for(int i = 0 ; i < firstArray.size(); i++){

            for(int j = 0 ; j < SecondAray.size() ; j++){

                if (firstArray.get(i).contains(SecondAray.get(j))){

                    result = true;
                    break;
                }else if(j==SecondAray.size()-1){


                    return false;

                }

            }


        }

        return result;

    }
    /*

    if ArrayList myCountries have a firstCountry then replace it with a secondCountry

        for Exammple myCountries list ===========>>>> Brazil USA Mexico USA
                    firstCountry =======>>>> USA
                    SeconCounty========>>> Canada

                    result should be Brazil Canada Mexico Canada


     */

    public ArrayList<String> replaceTheCountry(ArrayList<String> myCountries ,String firstCountry , String SecondCounry){

        for(int i = 0 ; i< myCountries.size() ; i++){

            if (!myCountries.contains(firstCountry)){

                myCountries.set(i,"-1");

            }else if(myCountries.get(i).equals(firstCountry)){


                myCountries.set(i,SecondCounry);

            }

        }

        return myCountries;

    }


}
