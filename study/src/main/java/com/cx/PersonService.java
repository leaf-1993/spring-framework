package com.cx;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @author chenxiang
 * @create 2021-12-08 13:15
 */
@Component
public class PersonService {

	@Lookup("person")
	public Object test(){
		return "";
	}
}
