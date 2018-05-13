package com.momo.webns.web.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.momo.webns.web.dto.GoodsSpec;

@RestController
public class MaintainRegGoodsSpecController {
	
	
	@RequestMapping(value = "/mgs/gn")
	public String retrieveGoodsName() {

		System.out.println("aaaa");
		return "index";
	}
	
    private User getUser(){
		
    	System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());
		if(SecurityContextHolder.getContext().getAuthentication().getPrincipal() != null){
			if( !SecurityContextHolder.getContext().getAuthentication().getPrincipal().equals("anonymousUser")){
				User user =
						 (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
				System.out.println("abc");
				return user;
			}else {
			
				System.out.println("anonymousUser");
			}	
		}else {
			System.out.println("null");
		}
		
		return null;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/mgs/gn/{id}")
	public Optional<String> retrieveGoodsName(@PathVariable String id) {
		
		//todo here 
		User u = this.getUser();
		//System.out.print(u.getUsername());
		
		
		
		return Optional.of("【QC_NOT 另一個不QC品牌】甲配一般(冷凍分類)");
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/mgs/ggs/{id}")
	public Iterable<GoodsSpec> retrieveGoodsSpec(@PathVariable String id) {
		
		List<GoodsSpec> gsList = new ArrayList<GoodsSpec>();
		GoodsSpec gs1 = new GoodsSpec();
		gs1.setId("01");
		gs1.setNo("101");
		gs1.setTitle("商品內容及尺寸規格");
		gs1.setContent("請輸入規格");
		gsList.add(gs1);
		
		GoodsSpec gs2 = new GoodsSpec();
		gs2.setId("02");
		gs2.setNo("102");
		gs2.setTitle("銷售注意事項");
		gs2.setContent("注意事項");
		gsList.add(gs2);
		
		GoodsSpec gs3 = new GoodsSpec();
		gs3.setId("03");
		gs3.setNo("103");
		gs3.setTitle("贈品");
		gs3.setContent("贈品");
		gsList.add(gs3);
		
		GoodsSpec gs4 = new GoodsSpec();
		gs4.setId("04");
		gs4.setNo("301");
		gs4.setTitle("商品特色標語");
		gs4.setContent("賞車券3000元");
		gsList.add(gs4);
		
		
		return gsList;
		
	}
	
	 @RequestMapping(method=RequestMethod.POST , 
			 value="/mgs/sv")
	 public String save(@RequestBody String gsList) {
	        //contactRepository.save(contact);
		 
		 try {
			gsList =URLDecoder.decode(gsList,java.nio.charset.StandardCharsets.UTF_8.toString());
			 Collection<GoodsSpec> readValues;
			 readValues = new ObjectMapper().readValue(gsList, new TypeReference<Collection<GoodsSpec>>() { });
				
				System.out.println(readValues.size());
				
			
			readValues.forEach(x ->{
				System.out.println(x.getContent());
			});
				
				
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	
		 
	     return "done";
	 }
	

}
