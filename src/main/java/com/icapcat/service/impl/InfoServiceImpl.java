package com.icapcat.service.impl;

import com.icapcat.domain.InfoEntity;
import com.icapcat.service.InfoService;

public class InfoServiceImpl implements InfoService{
	public boolean save(InfoEntity info) {
		System.out.println("删除了");
		return false;
	}
	public boolean delete(InfoEntity info) {
		System.out.println("保存了");
		return false;
	}
}
