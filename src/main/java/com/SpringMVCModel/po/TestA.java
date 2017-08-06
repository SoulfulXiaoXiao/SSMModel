package com.SpringMVCModel.po;
import java.util.Date;  
/**
 *  
 * @author generation自动生成
 * $Date: 2015-09-01 10:19:26 
 */
public class TestA extends PageNum{

    private String userName;
    private Integer id;
    private String passWord;
    private Integer flag;
    public TestA(){
    
    }
    public TestA(String userName,Integer id,String passWord,Integer flag){
        this.userName=userName;
        this.id=id;
        this.passWord=passWord;
        this.flag=flag;
    }
   
    public void setUserName(String userName){
        this.userName = userName;
    }
     
    public String getUserName(){
        return this.userName;
    }
    public void setId(Integer id){
        this.id = id;
    }
     
    public Integer getId(){
        return this.id;
    }
    public void setPassWord(String passWord){
        this.passWord = passWord;
    }
     
    public String getPassWord(){
        return this.passWord;
    }
    public void setFlag(Integer flag){
        this.flag = flag;
    }
     
    public Integer getFlag(){
        return this.flag;
    }
    @Override
	public String toString() {
		return "TestA [userName="+userName+",id="+id+",passWord="+passWord+",flag="+flag+"]";
	}
}