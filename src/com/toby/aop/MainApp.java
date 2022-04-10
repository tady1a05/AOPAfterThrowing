package com.toby.aop;

import java.util.ArrayList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.toby.aop.dao.*;
import com.toby.aop.model.Account;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		AccountDao accountDao = context.getBean("accountDao",AccountDao.class);
		ArrayList<Account> acclist;
		try {
			acclist = accountDao.getAccountList(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of getAccountList()");
		context.close();
	}

}
