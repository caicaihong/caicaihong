package cai;

public class cai
{
private double amount = 10000;
private double rate = 0.065;
//���㲢���ÿ����Ϣ
//����10����ƽ����Ϣ
private static Double[] interest = new Double[10];

public void getYearInterest(){
int i = 0;
double num = 0;
while(i<10){
//ÿ�����Ϣ
interest[i] = amount*rate;
num = amount + (amount * rate);
this.amount = num;
i++;
}

}
public double getAverage(){
//���� (������Ƿ��ǳ�ȥ������ʣ���)
double average = 0.0;
for(double a:interest){
average += a;
}
return average;
}
public double getAverageInterest(){
double average = 0.0;
for(double a:interest){
average += a;
}
//ƽ����Ϣ
return average/interest.length;
}
public static void main(String[] args){
cai yi = new cai();
yi.getYearInterest();
for(double a:interest){
System.out.println(a +"\n\t");
}
System.out.println("���ࣺ"+yi.getAverage());
System.out.println("ƽ����Ϣ��"+yi.getAverageInterest());
}
}