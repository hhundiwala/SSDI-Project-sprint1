package com.spring.app.service;

import java.util.List;

import com.spring.app.bean.ComplaintBean;
import com.spring.app.bean.ComplaintOut;
import com.spring.app.model.Complaint;

public interface ComplaintService {
	public List<ComplaintOut> listComplaints();
	public void addComplaint(ComplaintBean c);
}
