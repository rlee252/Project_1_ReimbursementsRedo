package com.revature.reimbursement.model;

import java.sql.Blob;



public class Reimbursement {
	int reimbId;
	int reimbAmount;
	String reimbSubmitted;
	String reimbResolved;
	String reimbDescription;
	Blob reimbReceipt;
	int reimbAuthor;
	int reimbResolver;
	int reimbStatusId;
	int reimbTypeId;
}
