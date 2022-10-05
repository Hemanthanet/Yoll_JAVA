package com.group2.coding_day;

public class FirstTask {
    /*
    //write a method that returns count of the second parameter (String) in first parameter passed to the method
		//String word="lala land";
		//String toFinfOccurance = "la";
		// findOccurance(String word, String toFindOccurance)
     */
    public static void main(String[] args) {
        String word="lala land";
        String toFinfOccurance = "la";
        findOccurance(word, toFinfOccurance);


    }
    public static  void findOccurance (String word,String toFindOccurance){
        //word=word.replaceAll(" ","");
        int i=0;
        int count=0;

        while(i<word.length()){
            if(word.substring(i, i+2).equalsIgnoreCase(toFindOccurance))
            {
                count++;
            }
            i++;
        }
        System.out.println(count);

    }
}



/*
String word="lala landla";
			String toFinfOccurance = "la";

			int count = 0;
			for (int i = 0; i < word.length()-1; i++) {

				if (word.substring(i, (i + 2)).equals(toFinfOccurance))
					count++;

				}
			System.out.println(count);
 */












/*

String word = "lala land";
		int Count = 0;
		for (int i = 0; i < word.length() - 2; i++) {

			if (word.substring(i, (i + 2)).equals("la"))
				Count++;

			}
		System.out.println(Count);
 */

/*
public static void main(String[] args) {

		String word = "lala land";
		String toFindOccurance= "la";

	firstMethod(word,toFindOccurance);

	}


public static void firstMethod ( String word, String toFindOccurance) {
	int count = 0 ;
	int i = 0;

	while(i<word.length()-1) {

		if (word.substring(i,i+2).equalsIgnoreCase(toFindOccurance)) {
			count++;
	}i++;
		}
	System.out.println("How often" + toFindOccurance +"appears " + count);

	}
 */