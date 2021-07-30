package com.sust.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sust.entity.Buyer;
import com.sust.entity.Seller;

import lombok.experimental.PackagePrivate;


@Mapper
public interface ShowGoodsDao {

	@Select("select * from buyer where buyer_cname=#{cname}")
	public List<Buyer> getMyAllBuyers(@Param("cname") String cname);
	
	@Select("select * from buyer where buyer_state=#{state} and buyer_cname=#{cname}")
	public List<Buyer> getStateBuyers(@Param("state") String state,@Param("cname") String cname);

	@Select("select * from seller where seller_state=#{state} and seller_cname=#{cname}")
	public List<Seller> getStateSellers(@Param("state") String state,@Param("cname") String cname);

	@Select("select * from seller where seller_cname=#{cname}")
	public List<Seller> getMyAllSellers(@Param("cname") String cname);
	
	@Select("select * from seller where seller_id=#{id}")
	public Seller getOneSeller(@Param("id") Integer id);
	
	@Select("select * from buyer where buyer_id=#{id}")
	public Buyer getOneBuyer(@Param("id") Integer id);
}
