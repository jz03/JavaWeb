package cn.jz.helloWorld.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 注入集合
 * 
 * @author 冀州
 * @date 2018年4月13日
 */
public class JavaCollection {
	List addressList;
	Set addressSet;
	Map addressMap;
	Properties addressProp;

	public List getAddressList() {
		System.out.println("list :" + addressList);
		return addressList;
	}

	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}

	public Set getAddressSet() {
		System.out.println("set :" + addressSet);
		return addressSet;
	}

	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}

	public Map getAddressMap() {
		System.out.println("map :" + addressMap);
		return addressMap;
	}

	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}

	public Properties getAddressProp() {
		System.out.println("properties :" + addressProp);
		return addressProp;
	}

	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}
}
