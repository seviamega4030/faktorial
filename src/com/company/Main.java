package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
    int n = 10;

            // Top
            for (int i = n; i > 0; i--)
                {
                    // Stars
                    for (int j = 0; j < i; j++)
                        {
                            System.out.print("0");
                        }
                    // Spaces
                    for (int j = i; j < n; j++)
                        {
                            System.out.print("*");
                        }
                    // Stars
                    for (int j = i; j < n; j++)
                        {
                            System.out.print("*");
                        }
                    // Stars
                    for (int j = 0; j < i; j++)
                        {
                            System.out.print("0");
                        }
                    System.out.println();

                }

            // Bottom
            for (int i = 2; i < n + 1/* Note the shift here */; i++)
                {
                    // Stars
                    for (int j = 0; j < i; j++)
                        {
                            System.out.print("0");
                        }
                    // Spaces
                    for (int j = i; j < n; j++)
                        {
                            System.out.print("*");
                        }
                    // Spaces
                    for (int j = i; j < n; j++)
                        {
                            System.out.print("*");
                        }
                    for (int j = 0; j < i; j++)
                        {
                            System.out.print("0");
                        }
                    System.out.println();

                }
        }
}