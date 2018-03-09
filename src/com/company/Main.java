package com.company;

import com.company.math.MathHelper;
import com.company.ui.UserInteractionHelper;

public class Main {

    public static void main(String[] args) {
        int a = UserInteractionHelper.getNumberFromUser("A");
        int b = UserInteractionHelper.getNumberFromUser("B");
        int result = MathHelper.sumTwoNumbers(a, b);
        UserInteractionHelper.printResults(result);

        double testVale = Math.sqrt(10);
    }

}
