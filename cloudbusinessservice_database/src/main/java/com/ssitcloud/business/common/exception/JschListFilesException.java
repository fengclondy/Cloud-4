package com.ssitcloud.business.common.exception;

import com.jcraft.jsch.JSchException;

public class JschListFilesException extends JSchException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Throwable cause = null;

	public JschListFilesException() {
	}

	public JschListFilesException(String s) {
		super(s);
	}

	public JschListFilesException(String s, Throwable e) {
		super(s);
		this.cause = e;
	}

	public Throwable getCause() {
		return this.cause;
	}
}
