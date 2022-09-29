package com.syntax.class7;

public class clockLoopAnotherWay {

	public static void main(String[] args) {
		//the is the easiest way of making the clock
        for (int h = 0; h < 24; h++) { // control hours

            for (int m1 = 0; m1 <= 5; m1++) { // control first digit

                for (int m2 = 0; m2 <= 9; m2++) {//controls second digit

                    if (h < 10) {
                        System.out.println("0" + h + ":" + m1 + m2);
                    } else {
                        System.out.println(h + ":" + m1 + m2);
                    }
                }
            }
        }

    }



}
