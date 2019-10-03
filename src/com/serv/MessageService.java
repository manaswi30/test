package com.serv;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageService {
	
	static Map<Integer,Message1> messages=new HashMap<>();
	
	static {
		
		messages.put(1,new Message1(1,"abc",LocalDate.of(2019, 12, 10)));
		messages.put(2,new Message1(2,"def",LocalDate.of(2019, 12, 11)));
		messages.put(3,new Message1(3,"xyz",LocalDate.of(2019, 12, 03)));
		messages.put(4,new Message1(4,"asd",LocalDate.of(2019, 12, 02)));

	}
	
	public List<Message1> getAllMessages()
	{
		Collection<Message1> coll=messages.values();
		List<Message1> msglist=new ArrayList(coll);
		return msglist;
	}
	
	public Message1 getMessageById(int id)
	{
		return messages.get(id);
		
	}

	public Message1 addMessage(Message1 m)
	{
		int sizeofcoll=messages.size();
		int newid=sizeofcoll+1;
		m.setId(newid);
		messages.put(newid,m);
		return m;
		
	}
	
	public Message1 delMessage(int id)
	{
		messages.remove(id);
		return getMessageById(id);
		
	}
	 
	
	public Message1 updateMessage(Message1 m)
	{
		messages.put(m.getId(), m);
		return m;
		
	}
	
	
	
	
	

}
