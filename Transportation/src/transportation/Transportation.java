package transportation;

import java.text.DecimalFormat;

/**
 * @author 彭华莉
 * 2018年10月22日
 * Transportation.java
 */
public abstract class Transportation {
private String type;//交通方式名称
private double arrivingTime;//到车站（机场）时间
private double returnTime;//从车站（机场）返回时间
private double getTickets;//取票时间
private double securityCheck;//安检时间
private double waitingTime;//候车时间
private double speed;//车速
private double price;//单价
public Transportation(String type,double arrivingTime,double returnTime,double getTickets,double securityCheck,double waitingTime,double speed,double price)
{
	this.type=type;
	this.arrivingTime =arrivingTime;
	this.returnTime =returnTime;
	this.getTickets =getTickets;
	this.securityCheck =securityCheck;
	this.waitingTime =waitingTime;
	this.speed=speed;
	this.price=price; 
}
//public Transportation() {
//	// TODO 自动生成的构造函数存根
//}
public void compute(double distance){
	double time;
	double totalPrice;
	time=this.getArrivingTime()+this.getReturnTime()+this.getGetTickets()+this.getSecurityCheck()+this.getWaitingTime();
	totalPrice=this.getPrice()*distance;
	DecimalFormat df=new DecimalFormat();
	System.out.println("通过交通方式"+this.getType()+"所需时间："+df.format(time)+"小时");
	System.out.println("通过交通方式"+this.getType()+"需付费用："+df.format(totalPrice)+"元");
};
public  void setType(String type){
	this.type=type;
}
public String getType(){
	return type;
}
public void setArrivingTime(double arrivingTime){
	this.arrivingTime=arrivingTime;
}
public double getArrivingTime(){
	return arrivingTime;
}
public void setReturnTime(double returnTime){
	this.returnTime=returnTime;
}
public double getReturnTime(){
	return returnTime;
}
public void setGetTickets(double getTickets){
	this.getTickets=getTickets;
}
public double getGetTickets(){
	return getTickets;
}
public void setSecurityCheck(double securityCheck){
	this.securityCheck=securityCheck;
}
public double getSecurityCheck(){
	return securityCheck;
}
public void setWaitingTime(double waitingTime){
	this.waitingTime=waitingTime;
}
public double getWaitingTime(){
	return waitingTime;
}
public void setSpeed(double speed){
	this.speed=speed;
}
public double getSpeed(){
	return speed;
}
public void setPrice(double price){
	this.price=price;
}
public double getPrice(){
	return price;
}
}
