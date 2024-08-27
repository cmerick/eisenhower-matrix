package com.cmerick.eisenhower_matrix.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Vitor
 *
 */
@Component
public class CommonBaseService {

	@Autowired
	private DataSource dataSource;

	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}

	public String encode(String encode) throws UnsupportedEncodingException {
		return new String(encode.getBytes("UTF-16"), StandardCharsets.UTF_16LE).replace("�", "");
	}
}
