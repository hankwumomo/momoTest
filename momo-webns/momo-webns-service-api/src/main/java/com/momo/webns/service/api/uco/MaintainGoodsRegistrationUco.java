package com.momo.webns.service.api.uco;

import java.util.List;

import com.momo.webns.service.api.dto.Goods;
import com.momo.webns.service.api.dto.GoodsRegistration;
import com.momo.webns.service.api.dto.form.MaintainGoodRegSpecTdescribeFormApi;

public interface MaintainGoodsRegistrationUco {
	
	public List<Goods> retrieveGoodsList();
	
	public GoodsRegistration retrieveGoodsRegistration();
	
	public void saveNewGoodRegSpec(MaintainGoodRegSpecTdescribeFormApi form);
	

}
