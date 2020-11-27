package edu.miu.service;

import edu.miu.database.Database;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarbuckServiceImpl implements StarbuckService {

    private static final Database data = new Database();

    public StarbuckServiceImpl() {

    }

    public String findPassword(String name) {
        String expectedPassword = data.getPassword(name);
        return expectedPassword;
    }

    public List<String> getAdvice(String roast) {
        return data.getAdvice(roast);
    }
}



