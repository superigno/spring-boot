package com.pc.globalpos.ratefeed.model.ecb;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author gino.q
 * @date April 8, 2020
 *
 */
@XmlRootElement(name = "Cube")
@XmlAccessorType(XmlAccessType.NONE)
public class CubeBranch {
	
	@XmlAttribute(name="time")
	private String time;
	
	@XmlElement(name="Cube")
	private List<CubeDetail> detailList;
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public List<CubeDetail> getDetailList() {
		return detailList;
	}
	public void setDetailList(List<CubeDetail> detailList) {
		this.detailList = detailList;
	}
	
}
