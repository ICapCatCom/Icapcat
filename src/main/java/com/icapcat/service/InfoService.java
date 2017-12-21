package com.icapcat.service;

import com.icapcat.domain.InfoEntity;

public interface InfoService {
	/**
	 * 保存
	 */
	public boolean save(InfoEntity info);
	/**
	 * 删除
	 */
	public boolean delete(InfoEntity info);
}
