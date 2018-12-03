package com.example.domain;

public class Library_Branch {
	
	private long BookId;
	private long BranchId;
	private int No_Of_Copies;
	
	public Library_Branch(long bookId, long branchId, int no_Of_Copies) {
		super();
		BookId = bookId;
		BranchId = branchId;
		No_Of_Copies = no_Of_Copies;
	}

	public long getBookId() {
		return BookId;
	}

	public void setBookId(long bookId) {
		BookId = bookId;
	}

	public long getBranchId() {
		return BranchId;
	}

	public void setBranchId(long branchId) {
		BranchId = branchId;
	}

	public int getNo_Of_Copies() {
		return No_Of_Copies;
	}

	public void setNo_Of_Copies(int no_Of_Copies) {
		No_Of_Copies = no_Of_Copies;
	}

	@Override
	public String toString() {
		return "Library_Branch [BookId=" + BookId + ", BranchId=" + BranchId + ", No_Of_Copies=" + No_Of_Copies + "]";
	}
	
	
}
