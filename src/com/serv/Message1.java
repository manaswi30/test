package com.serv;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Message1 {
	
private int id; private String msg; private LocalDate date;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

public LocalDate getDate() {
	return date; 
}

public void setDate(LocalDate date) {
	this.date = date;
}

@Override
public String toString() {
	return "Message1 [id=" + id + ", msg=" + msg + ", date=" + date + "]";
}

public Message1(int id, String msg, LocalDate date) {
	super();
	this.id = id;
	this.msg = msg;
	this.date = date;
}

public Message1() {
	super();
} 

}
