package com.company;

public class myString {
    char[] word;

    public myString(char[] word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return new String(word);
    }
}
