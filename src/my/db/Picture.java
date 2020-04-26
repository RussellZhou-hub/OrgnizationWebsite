package my.db; 

import java.util.Date;

import af.sql.annotation.AFCOLUMNS; 
import af.sql.annotation.AFTABLE; 

/** 本类由 POJO生成器 自动生成于 2020-04-25 18:49:41
    作者：阿发你好      官网: http://afanihao.cn 
*/ 

/** INSERT语句 ( 预处理方式 ) 
  INSERT INTO `picture`
        (`id`, `realName`, `name`, `size`, `storePath`, `tag`, `timeCreated`, `timeModified`) 
  VALUES(?, ?, ?, ?, ?, ?, ?, ?) 
*/ 

/** INSERT语句 ( MyBatis方式 ) 
  INSERT INTO `picture`
        (`id`, `realName`, `name`, `size`, `storePath`, `tag`, `timeCreated`, `timeModified`) 
  VALUES(#{id}, #{realName}, #{name}, #{size}, #{storePath}, #{tag}, #{timeCreated}, #{timeModified}) 

  自增主键: id
*/ 

@AFTABLE(name="picture")  
@AFCOLUMNS(generated="id") 
public class Picture 
{ 
 
	public Long id ; 
	public String realName ; 
	public String name ; 
	public Long size ; 
	public String storePath ; 
	public String tag ; 
	public Date timeCreated ; 
	public Date timeModified ; 


	public void setId(Long id)
	{
		this.id=id;
	}
	public Long getId()
	{
		return this.id;
	}
	public void setRealName(String realName)
	{
		this.realName=realName;
	}
	public String getRealName()
	{
		return this.realName;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setSize(Long size)
	{
		this.size=size;
	}
	public Long getSize()
	{
		return this.size;
	}
	public void setStorePath(String storePath)
	{
		this.storePath=storePath;
	}
	public String getStorePath()
	{
		return this.storePath;
	}
	public void setTag(String tag)
	{
		this.tag=tag;
	}
	public String getTag()
	{
		return this.tag;
	}
	public void setTimeCreated(Date timeCreated)
	{
		this.timeCreated=timeCreated;
	}
	public Date getTimeCreated()
	{
		return this.timeCreated;
	}
	public void setTimeModified(Date timeModified)
	{
		this.timeModified=timeModified;
	}
	public Date getTimeModified()
	{
		return this.timeModified;
	}

} 
 