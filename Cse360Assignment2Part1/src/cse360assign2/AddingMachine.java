package cse360assign2;
/*+----------------------------------------------------------------------
||
||  Class AddingMachine 
||
||         Author:  John Lambert
||			ID:		1214853159
||        Purpose:  have an interger that can have values added to subtracted from 
					it as well as have it cleared, displayed or show a history
					of the processes that took place 
||
||  Inherits From:  NA
||
||     Interfaces:  NA
||
|+-----------------------------------------------------------------------
||
||      Constants:  NA
||
|+-----------------------------------------------------------------------
||
||   Constructors:  None
||
||  Class Methods:  getTotal returns the value of total
					add adds a value to the total and adds the transaction to the string
					subtract subtracts a value from the total and adds the transaction to the string
					toString returns the list of transactions
					clear clears the string and the total
||
||
++-----------------------------------------------------------------------*/
public class AddingMachine {

	private int total;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {//method to return total
		return 0;
	}
	
	public void add (int value) {//method to add
		
	}
	
	public void subtract (int value) {//method to subtract
		
	}
		
	public String toString () {//method to return a string of all transactions
		return "";
	}

	public void clear() {//method to clear the data and refresh
	
	}
}
