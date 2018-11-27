package transportation;

import java.text.DecimalFormat;

/**
 * @author ����
 * 2018��10��22��
 * Transportation.java
 */
public abstract class Transportation {
private String type;//��ͨ��ʽ����
private double arrivingTime;//����վ��������ʱ��
private double returnTime;//�ӳ�վ������������ʱ��
private double getTickets;//ȡƱʱ��
private double securityCheck;//����ʱ��
private double waitingTime;//��ʱ��
private double speed;//����
private double price;//����
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
//	// TODO �Զ����ɵĹ��캯�����
//}
public void compute(double distance){
	double time;
	double totalPrice;
	time=this.getArrivingTime()+this.getReturnTime()+this.getGetTickets()+this.getSecurityCheck()+this.getWaitingTime();
	totalPrice=this.getPrice()*distance;
	DecimalFormat df=new DecimalFormat();
	System.out.println("ͨ����ͨ��ʽ"+this.getType()+"����ʱ�䣺"+df.format(time)+"Сʱ");
	System.out.println("ͨ����ͨ��ʽ"+this.getType()+"�踶���ã�"+df.format(totalPrice)+"Ԫ");
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
