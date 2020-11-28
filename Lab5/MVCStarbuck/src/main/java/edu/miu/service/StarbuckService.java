package edu.miu.service;

import java.util.List;

public interface StarbuckService {
	public String findPassword(String name );
	public List<String> getAdvice(String roast);
}
