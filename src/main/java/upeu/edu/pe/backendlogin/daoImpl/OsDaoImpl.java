package upeu.edu.pe.backendlogin.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.backendlogin.dao.Todo;
import upeu.edu.pe.backendlogin.entity.Os;

@Component
public class OsDaoImpl implements Todo<Os>{
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Os t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Os t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Os read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Os> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM OS", new BeanPropertyRowMapper<Os>(Os.class));
	}

}
