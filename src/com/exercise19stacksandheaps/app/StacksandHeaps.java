package com.exercise19stacksandheaps.app;

import java.util.Stack;
public class StacksandHeaps 
{
	public static void main(String[] args) 
	{
		//Variables declaration
		String cad="Colour segmentation or color filtering is widely used in OpenCV for identifying specific objects/regions having a specific color. The most widely used colour space is RGB color space, it is called an additive color space as the three color shades add up to give the color to the image. To identify a region of a specific colour, put the threshold and create a mask to separate the different colors. HSV color space is much more useful for this purpose as the colors in HSV space is much more localized thus can be easily separated. Color Filtering has many applications and use cases such as in Cryptography, infrared analysis, food preservation of perishable foods etc. In such cases, the concepts of Image processing can be used to find out or extract out regions of a particular color.\r\n" + 
				"For color segmentation, all we need is the threshold values or the knowledge of the lower bound and upper bound range of colors in one of the color spaces. It works best in Hue-Saturation-Value color space.\r\n" + 
				"After specifying the range of color to be segmented, it is needed to create a mask accordingly and by using it, a particular region of interest can be separated out.";
		
		Stack<Character> letters = new Stack<Character>();
		char[] lettersArray = cad.toCharArray();
		
		for(Character c: lettersArray)
		{
			if(Character.toUpperCase(c)=='A')
			{
				letters.push(c);
			}
		}
		while(!letters.isEmpty())
		{
			System.out.println(letters.pop());
		}
		/*
		for(Character c: letters)
		{
			System.out.println(letters.pop());
		}*/
	}
}
