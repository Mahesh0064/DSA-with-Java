package com.oops;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queen q=new Queen();
		q.moves();
		Rook r=new Rook();
		r.moves();

	}

}
interface ChessPlayer
{
	void moves();// public static void moves()
	
}
class Queen implements ChessPlayer
{
	public void moves()
	{
		System.out.println("up down left right diagonal(in all 4 dirns)");
	}
}
class Rook implements ChessPlayer
{
	public void moves()
	{
		System.out.println("up, down ,left ,right");
	}
}
class King implements ChessPlayer
{
	public void moves()
	{
		System.out.println("up down left right diagonal (by 1 step)");
	}
}