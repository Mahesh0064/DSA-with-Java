package com.pattern;

public class InvertedPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=7;
		// outer loop
				for(int i=1; i<=n; i++)
				{
					// inner loop
					for(int j=1; j<=n-i-1; j++)
					{
						System.out.print("*");
					}
					System.out.println();
				}

			}

		}


	


