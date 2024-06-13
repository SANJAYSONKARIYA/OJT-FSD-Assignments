package com.test;

import com.media.Media;
import com.media.Book;
import com.media.CD;
import com.media.DVD;

public class Main {
    public static void main(String[] args) {
        Media[] mediaArray = {new Book(), new CD(), new DVD()};
        for (Media media : mediaArray) {
            media.displayInfo();
        }
    }
}
