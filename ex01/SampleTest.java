package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.mapper.SampleDefaultVO;
import com.example.demo.mapper.SampleMapper;

@SpringBootTest
public class SampleTest {

	@Autowired SampleMapper sampleMapper;
	
	@Test
	public void list() {
		try {
			SampleDefaultVO vo = new SampleDefaultVO();
			vo.setFirstIndex(1);
			vo.setRecordCountPerPage(10);
			List<?> list =  sampleMapper.selectSampleList(vo);
			list.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
