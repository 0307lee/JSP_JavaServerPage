package com.id.dao;

public class Person1 {
	//?200728  �ش� Ŭ���� �ȿ���id�� name�� �帧��?
	// =�ʿ��ϸ� �θ��� ����
	//	private�� ���� ������ �޼ҵ�� �θ� ���� ȣ��Ǵ�, �� private raw�� ��ü�� �ܺο��� ���� �� ���� ���� �Ұ�����! 
	// java�� class�ν� �����Ѵ�.
	private int id = 20181004;
	private String name ="1�����";
			
	//default= class Person1 ���� �޼��� Person1 
	public Person1() {	
	}

	public int getId() {
		return id;
	}

	public void setId(int id){
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {	
		this.name= name;
	}
	/*--200728 
	com.id.dao.Person#���� �����ͼ� ǥ������
	id.com�̶�� �����ο��� dao��� ����� �ϴ� package�̴�.
	(cf1. �����ϰԴ� dao��� package�� �̷��� ������ �ʾҴ�. 
	*/
}
