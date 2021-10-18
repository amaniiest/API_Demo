package com.aman.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.aman.messenger.model.Message;

public class MessageService {
public List<Message> getallMessages(){
		
		Message m1 = new Message(1L,"API World", "Aman");
		Message m2 = new Message(2L, "SAP", "Hriju");
		
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
				
	}

}
