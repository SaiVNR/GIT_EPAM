package com.epam.teja.password_validator;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.epam.teja.database.DatabaseHelper;



/**
 * @author Sai Teja
 *
 */
public class DatabasePasswordTest {

	@Mock
	DatabaseHelper databaseHelper;
	
	PasswordValidator passwordValidator = new PasswordValidator();
	
	@Before
	public void begin() {
		databaseHelper = mock(DatabaseHelper.class);
		when(databaseHelper.getPassword("admin")).thenReturn("Admin@11");
		when(databaseHelper.getPassword("user")).thenReturn("suser@2");
	}
	/**
	 * 
	 */
	@Test
	public void testPasswordAdmin() {
		assertTrue(passwordValidator.validatePassword(databaseHelper.getPassword("admin")));
		assertEquals("Admin@11", databaseHelper.getPassword("admin"));
		
	}
	
	@Test
	public void testPasswordUser() {
		assertFalse(passwordValidator.validatePassword(databaseHelper.getPassword("user")));
		assertFalse("Admin@11".equals(databaseHelper.getPassword("user")));
		
	}
}

//https://stackoverflow.com/questions/15554296/simple-java-aes-encrypt-decrypt-example
