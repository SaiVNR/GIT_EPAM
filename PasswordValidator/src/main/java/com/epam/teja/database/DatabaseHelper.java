package com.epam.teja.database;

/**
 * @author Sai Teja
 *
 */
public interface DatabaseHelper {

	/**
	 * @param userName Username.
	 * @return encrypted password.
	 */
	String getPassword(String userName);
}
