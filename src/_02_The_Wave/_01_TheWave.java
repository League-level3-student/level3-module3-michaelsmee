package _02_The_Wave;

import java.util.ArrayList;

public class _01_TheWave {
    /*
     * Background:
     * https://en.wikipedia.org/wiki/Wave_%28audience%29 
     * 
     * Task:
     * Your task is to create a function that turns a string into a Wave.
     * You will be passed a string and you must return that string in an
     * ArrayList where an uppercase letter is a person standing up.
     * Example:
     * wave("hello") => "Hello", "hEllo", "heLlo", "helLo", "hellO"
     * 
     * 1. The input string will always be lower case but maybe empty.
     * 2. If the character in the string is whitespace then pass over it as
     *    if it was an empty seat.
     */
    
    public static ArrayList<String> wave(String str) {
        int count = str.length();
    	ArrayList<String> result = new ArrayList<String>();
    	int start = 0;
    	int end = 1;
        for(int i=0; i<count;  i++) {
        	if(Character.isAlphabetic(str.charAt(i))) {
        	result.add(str.substring(0, start) + str.substring(start,end).toUpperCase() + str.substring(end));
        	
        }
        	start++;
        	end++;
        }
        System.out.println(result);
        return result;
    }
}
