package upeu.edu.pe.backendlogin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import upeu.edu.pe.backendlogin.dao.Todo;
import upeu.edu.pe.backendlogin.entity.Os;

@Service
public class OsService implements Todo<Os>{

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
		return null;
	}

}
