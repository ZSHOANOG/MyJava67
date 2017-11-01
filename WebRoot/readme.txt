ssh项目的整合
	spring整合hibernate和struts2
	一、struts2框架(从struts2的实例程序中获取)
		1、导入struts2的jar包
		asm-3.3.jar
		asm-commons-3.3.jar
		asm-tree-3.3.jar
		commons-fileupload-1.3.2.jar
		commons-io-2.2.jar
		commons-lang3-3.2.jar
		freemarker-2.3.22.jar
		javassist-3.11.0.GA.jar
		log4j-api-2.3.jar
		log4j-core-2.3.jar
		ognl-3.0.19.jar
		struts2-core-2.3.32.jar
		xwork-core-2.3.32.jar
		还需要导入struts2-spring的整合包
		struts2-spring-plugin-2.3.32.jar
		2、在web.xml文件中对struts2进行配置
			  <filter>
		  	<filter-name>struts2</filter-name>
		  	<filter-class>org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter</filter-class>
		  </filter>
		  <filter-mapping>
		  	<filter-name>struts2</filter-name>
		  	<url-pattern>/*</url-pattern>
 			 </filter-mapping>
 		3、导入struts2核心配置文件
 		
 	二、spring框架的导入
 		1、导入jar包
 		Spring的基本jar包
 		spring-beans-3.2.0.RELEASE.jar
		spring-context-3.2.0.RELEASE.jar
		spring-core-3.2.0.RELEASE.jar
		spring-expression-3.2.0.RELEASE.jar
		com.springsource.org.dom4j-1.6.1.jar
		com.springsource.org.apache.commons.logging-1.1.1.jar
		导入spring的aop相关的jar包
		com.springsource.org.aopalliance-1.0.0.jar
		spring-aop-3.2.0.RELEASE.jar
		spring-aspects-3.2.0.RELEASE.jar
		com.springsource.org.aspectj.weaver-1.6.8.RELEASE.jar
		Spring完成事物的配置的jar包 JDBC的支持
		spring-jdbc-3.2.0.RELEASE.jar
		spring-tx-3.2.0.RELEASE.jar
		spring和ORM框架整合需要的jar包
		spring-orm-3.2.0.RELEASE.jar
		Spring和web项目整合需要的jar包
		spring-web-3.2.0.RELEASE.jar
		Spring和junit整合的包（在web环境下进行Junit测试）
		spring-test-3.2.0.RELEASE.jar
		2、在web.xml文件当中将Spring和web项目整合
		3、导入Spring的配置文件
	三、hibernate的配置
		1、jar包的导入
			需要lib文件夹下导入required文件夹下的所有jar包
						jpa文件夹下的所有包
			根目录下的hibernate3.jar
		
		2、hibernate核心文件配置
		hibernate.cfg.xml中的配置可以写到Spring的配置文件当中
		
		3、映射文件和实体类
		
		ssh的开发
		1、开发action
		
		