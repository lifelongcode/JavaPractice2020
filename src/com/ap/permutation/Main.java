package com.ap.permutation;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        PermutationExm pm = new PermutationExm();

        String firstInput = JOptionPane.showInputDialog("Please Enter word: ");
        String secondInput = JOptionPane.showInputDialog("Please Enter another word");

        JOptionPane.showMessageDialog(null, "Is my input word permutation? "
                                        + pm.permutation(firstInput, secondInput));

    }
}
