/**
 * 
 */
package com.grupoatrium.persistencia.impl;

/**
 * @author ilr00819
 *
 */
public class LibrosDAO {
	
	private ConnectionMgrTest ConnMgr;

	/**
	 * @return the ConnMgr
	 */
	public ConnectionMgrTest getConnMgr() {
		return ConnMgr;
	}

	/**
	 * @param mgr the ConnMgr to set
	 */
	public void setConnMgr(ConnectionMgrTest ConnMgr) {
		this.ConnMgr = ConnMgr;
	}
}
