package com.company.india.anonymous;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonEventCounter {
    private static int counter = 10;
    private Button buttonOne;
    private Button buttonTwo;

    public ButtonEventCounter() {


        buttonOne = new Button();
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //we can take access like this
                ButtonEventCounter.this.counter += 1;
            }
        });


        buttonTwo = new Button();
        buttonTwo.addActionListener(new ActionListener() {
            private static final int NUMBER = 1;

            @Override
            public void actionPerformed(ActionEvent e) {
                int counter = 0;

                //shadowing : local counter equal 1 any time
                counter += NUMBER;

            }
        });

    }

}
