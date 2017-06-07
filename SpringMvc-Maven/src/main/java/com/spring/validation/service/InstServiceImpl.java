package com.spring.validation.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.spring.validation.dao.InstDao;
import com.spring.validation.entity.InstEntity;

@Service
public class InstServiceImpl implements InstService{

	@Autowired
	private  InstDao instDao;
	FileInputStream fis;

	public void setInstDao(InstDao instDao) {
		this.instDao = instDao;
	}


	@Override
	public void saveInst(InstEntity instEntity) {
		
		File image = new File("D:/rcm.jpg");
		byte[] bfile=new byte[(int) image.length()];
		try {
			fis = new FileInputStream(image);
			fis.read(bfile);
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		instEntity.setLogo(bfile);
		//System.out.println("Bfileeeeeeee"+bfile);
		Random rand = new Random();
		long accumulator = 1 + rand.nextInt(9); // ensures that the 16th digit isn't 0
		for(int i = 0; i < 15; i++) {
		    accumulator *= 10L;
		    accumulator += rand.nextInt(10);
		}
		String instId=String.valueOf(accumulator);
		instEntity.setInst_id(instId);
		instDao.saveInst(instEntity);
	}
	@Override
	public InstEntity getInst(String anchor) {
		return instDao.getInst(anchor);
	}
}
